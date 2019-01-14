package com.straus.services;

import com.straus.beans.Season;
import com.straus.beans.Statistic;
import io.swagger.annotations.ApiModel;

import java.util.List;

@ApiModel(value = "Season Service", description = "Provides interface for the Season service layer")
public interface SeasonService {
	/**
	 * Method to get a specific season by their id
	 *
	 * @param seasonId Id of the season to filter by
	 * @return A season with the matching id
	 */
	Season getSeasonById(int seasonId);

	/**
	 * Method to get all seasons in the system
	 *
	 * @return A list of all seasons
	 */
	List<Season> getAllSeasons();

	/**
	 * Method to persist a season into the system
	 *
	 * @param season New season object to persist
	 * @return The season object, with the auto-generated id
	 */
	Season createSeason(Season season);

	/**
	 * Method to update a season in the system
	 *
	 * @param season Season object to update
	 */
	void updateSeason(Season season);

	/**
	 * Method to remove a season from the system
	 *
	 * @param seasonId Id of the season to delete
	 */
	void deleteSeason(int seasonId);

	/**
	 * Method to create statistics for a user's season
	 *
	 * @param season the season to filter by
	 * @param userId the user to filter by
	 * @return the statistic for the season
	 */
	Statistic getSeasonStatistics(Season season, int userId);

	/**
	 * Method to get the current Season
	 *
	 * @return Season that is currently happening
	 */
	Season getCurrentSeason();
}
