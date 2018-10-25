package com.straus.services;

import com.straus.beans.Season;
import com.straus.repositories.SeasonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeasonServiceImpl implements SeasonService {

	private final SeasonRepository seasonRepository;

	@Autowired
	public SeasonServiceImpl(SeasonRepository seasonRepository) {
		this.seasonRepository = seasonRepository;
	}

	/**
	 * Method to get a specific season by their id
	 *
	 * @param seasonId Id of the season to filter by
	 * @return A season with the matching id
	 */
	@Override
	public Season getSeasonById(int seasonId) {
		return seasonRepository.findById(seasonId).orElse(new Season());
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
}
