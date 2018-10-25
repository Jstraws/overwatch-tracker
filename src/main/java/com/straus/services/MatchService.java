package com.straus.services;

import com.straus.beans.*;
import io.swagger.annotations.ApiModel;

import java.util.List;

@ApiModel(value = "Match Service", description = "Provides interface for the Match service layer")
public interface MatchService {
	/**
	 * Method to get a specific match by their id
	 *
	 * @param matchId Id of the match to filter by
	 * @return A match with the matching id
	 */
	Match getMatchById(int matchId);

	/**
	 * Method to get all matches in the system
	 *
	 * @return A list of all matches
	 */
	List<Match> getAllMatches();

	/**
	 * Method to persist a match into the system
	 *
	 * @param match New match object to persist
	 * @return The match object, with the auto-generated id
	 */
	Match createMatch(Match match);

	/**
	 * Method to update a match in the system
	 *
	 * @param match Match object to update
	 */
	void updateMatch(Match match);

	/**
	 * Method to remove a match from the system
	 *
	 * @param matchId Id of the match to delete
	 */
	void deleteMatch(int matchId);

	/**
	 * Method to get all matches for a specific user
	 *
	 * @param userId User to filter by
	 * @return A list of matches for the specified user
	 */
	List<Match> getMatchByUserId(int userId);

	/**
	 * Method to get all matches for a specific result
	 *
	 * @param result Result to filter by (WIN, LOSS)
	 * @return A list of matches for the specific result
	 */
	List<Match> getMatchByResult(Result result);

	/**
	 * Method to get all matches in which a specific hero was played
	 *
	 * @param hero Hero to filter by
	 * @return A list of matches containing the specific hero
	 */
	List<Match> getMatchByHero(Hero hero);

	/**
	 * Method to get all matches played during a season
	 *
	 * @param season Season to filter by
	 * @return A list of matches
	 */
	List<Match> getMatchBySeason(Season season);

	/**
	 * Method to get all matches played on a specific map by a specific user
	 *
	 * @param map    Map to filter by
	 * @param userId UserId to filter by
	 * @return A list of matches
	 */
	List<Match> getMatchByMapAndUser(Map map, int userId);

	/**
	 * Method to get all matches played on a specific MapType by a specific user
	 *
	 * @param mapType Type of map to filter by
	 * @param userId  UserId to filter by
	 * @return A list of matches
	 */
	List<Match> getMatchByMapTypeAndUser(MapType mapType, int userId);

	/**
	 * Method to get the most recent match a user played
	 *
	 * @param userId User id to filter by
	 * @return A single match
	 */
	Match getUsersMostRecentMatch(int userId);

	/**
	 * Method to calculate statistics for a given set of matches
	 *
	 * @param matches List of matches to calculate stats off of
	 * @param name    Name of the statistic being caluclated
	 * @return A Statistic with all of the relevant information
	 */
	Statistic getMatchStatistics(List<Match> matches, String name);
}
