package com.straus.services;

import com.straus.beans.*;
import com.straus.repositories.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchServiceImpl implements MatchService {

	private final MatchRepository matchRepository;

	@Autowired
	public MatchServiceImpl(MatchRepository matchRepository) {
		this.matchRepository = matchRepository;
	}

	/**
	 * Method to get a specific match by their id
	 *
	 * @param matchId Id of the match to filter by
	 * @return A match with the matching id
	 */
	@Override
	public Match getMatchById(int matchId) {
		return matchRepository.findById(matchId).orElse(new Match());
	}

	/**
	 * Method to get all matches in the system
	 *
	 * @return A list of all matches
	 */
	@Override
	public List<Match> getAllMatches() {
		return matchRepository.findAll();
	}

	/**
	 * Method to persist a match into the system
	 *
	 * @param match New match object to persist
	 * @return The match object, with the auto-generated id
	 */
	@Override
	public Match createMatch(Match match) {
		return matchRepository.save(match);
	}

	/**
	 * Method to update a match in the system
	 *
	 * @param match Match object to update
	 */
	@Override
	public void updateMatch(Match match) {
		matchRepository.save(match);
	}

	/**
	 * Method to remove a match from the system
	 *
	 * @param matchId Id of the match to delete
	 */
	@Override
	public void deleteMatch(int matchId) {
		matchRepository.deleteById(matchId);
	}

	/**
	 * Method to get all matches for a specific user
	 *
	 * @param userId User to filter by
	 * @return A list of matches for the specified user
	 */
	@Override
	public List<Match> getMatchByUserId(int userId) {
		return matchRepository.findAllByAppUserUserIdOrderByMatchDateDesc(userId);
	}

	/**
	 * Method to get all matches for a specific result
	 *
	 * @param result Result to filter by (WIN, LOSS)
	 * @return A list of matches for the specific result
	 */
	@Override
	public List<Match> getMatchByResult(Result result) {
		return matchRepository.findAllByResultOrderByMatchDateDesc(result);
	}

	/**
	 * Method to get all matches in which a specific hero was played
	 *
	 * @param hero Hero to filter by
	 * @return A list of matches containing the specific hero
	 */
	@Override
	public List<Match> getMatchByHero(Hero hero) {
		return matchRepository.findAllByHeroesContainsOrderByMatchDateDesc(hero);
	}

	/**
	 * Method to get all matches played during a season
	 *
	 * @param season Season to filter by
	 * @return A list of matches
	 */
	@Override
	public List<Match> getMatchBySeason(Season season) {
		return matchRepository.findAllByMatchDateBetweenOrderByMatchDateDesc(season.getStartDate(), season.getEndDate());
	}

	/**
	 * Method to get the most recent match a user played
	 *
	 * @param userId User id to filter by
	 * @return A single match
	 */
	@Override
	public Match getUsersMostRecentMatch(int userId) {
		return matchRepository.findFirstByAppUserUserIdOrderByMatchDateDesc(userId);
	}

	/**
	 * Method to get all matches played on a specific map by a specific user
	 *
	 * @param map    Map to filter by
	 * @param userId UserId to filter by
	 * @return A list of matches
	 */
	@Override
	public List<Match> getMatchByMapAndUser(Map map, int userId) {
		return matchRepository.findAllByMapAndAppUserUserIdOrderByMatchDateDesc(map, userId);
	}

	/**
	 * Method to get all matches played on a specific MapType by a specific user
	 *
	 * @param mapType Type of map to filter by
	 * @param userId  UserId to filter by
	 * @return A list of matches
	 */
	@Override
	public List<Match> getMatchByMapTypeAndUser(MapType mapType, int userId) {
		return matchRepository.findAllByMapTypeAndAppUserUserIdOrderByMatchDateDesc(mapType, userId);
	}

	/**
	 * Method to calculate statistics for a given set of matches
	 *
	 * @param matches List of matches to calculate stats off of
	 * @param name    Name of statistic being caluclated
	 * @return A Statistic with all of the relevant information
	 */
	@Override
	public Statistic getMatchStatistics(List<Match> matches, String name) {
		Statistic statistic = new Statistic(name);
		for (Match m : matches) {
			if (m.getResult().equals(Result.WIN)) {
				statistic.addWin();
			} else if (m.getResult().equals(Result.LOSS)) {
				statistic.addLoss();
			} else {
				statistic.addDraw();
			}

			statistic.addSr(m.getRankDifference());
		}

		return statistic;
	}
}
