package com.straus.services;

import com.straus.beans.*;
import com.straus.repositories.MatchRepository;
import com.straus.repositories.SeasonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@Service
public class SeasonServiceImpl implements SeasonService {

	private final SeasonRepository seasonRepository;

	private final MatchRepository matchRepository;

	@Autowired
	public SeasonServiceImpl(SeasonRepository seasonRepository, MatchRepository matchRepository) {
		this.seasonRepository = seasonRepository;
		this.matchRepository = matchRepository;
	}

	/**
	 * Method to get a specific season by their id
	 *
	 * @param seasonId Id of the season to filter by
	 * @return A season with the matching id
	 */
	@Override
	public Season getSeasonById(int seasonId) {
		return seasonRepository.findById(seasonId).orElse(null);
	}

	/**
	 * Method to get all seasons in the system
	 *
	 * @return A list of all seasons
	 */
	@Override
	public List<Season> getAllSeasons() {
		return seasonRepository.findAll(new Sort(Sort.Direction.DESC, "endDate"));
	}

	/**
	 * Method to persist a season into the system
	 *
	 * @param season New season object to persist
	 * @return The season object, with the auto-generated id
	 */
	@Override
	public Season createSeason(Season season) {
		return seasonRepository.save(season);
	}

	/**
	 * Method to update a season in the system
	 *
	 * @param season Season object to update
	 */
	@Override
	public void updateSeason(Season season) {
		seasonRepository.save(season);
	}

	/**
	 * Method to remove a season from the system
	 *
	 * @param seasonId Id of the season to delete
	 */
	@Override
	public void deleteSeason(int seasonId) {
		seasonRepository.deleteById(seasonId);
	}

	/**
	 * Method to create statistics for a user's season
	 *
	 * @param season the season to filter by
	 * @param userId the user to filter by
	 * @return the statistic for the season
	 */
	@Override
	public Statistic getSeasonStatistics(Season season, int userId) {
		SeasonStatistic statistic = new SeasonStatistic(season.getName());
		List<Match> matches = matchRepository.findAllByMatchDateBetweenAndAppUserUserIdOrderByMatchDateDesc(season.getStartDate(), season.getEndDate(), userId);
		Map<String, Statistic> heroStats = new TreeMap<>();

		for (Match match : matches) {
			calculateStat(match, statistic);
			for (Hero hero : match.getHeroes()) {
				if (heroStats.containsKey(hero.getName())) {
					Statistic tempStat = heroStats.get(hero.getName());
					calculateStat(match, tempStat);
					heroStats.put(hero.getName(), tempStat);
				} else {
					Statistic tempStat = new Statistic(hero.getName());
                    tempStat.setIconUrl(hero.getHeroUrl());
					calculateStat(match, tempStat);
					heroStats.put(hero.getName(), tempStat);
				}
			}
            statistic.setHeroStats(new ArrayList<>(heroStats.values()));
		}

		return statistic;
	}

	/**
	 * Method to get the current Season
	 *
	 * @return Season that is currently happening
	 */
	@Override
	public Season getCurrentSeason() {
		return seasonRepository.findFirstByEndDateAfterAndNameNot(Timestamp.from(Instant.now()), "Any");
	}

	private void calculateStat(Match match, Statistic statistic) {
		if (match.getResult().equals(Result.WIN)) {
			statistic.addWin();
		} else if (match.getResult().equals(Result.DRAW)) {
			statistic.addDraw();
		} else {
			statistic.addLoss();
		}
        statistic.addSr(match.getRankDifference());
	}
}
