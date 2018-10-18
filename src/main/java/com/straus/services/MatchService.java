package com.straus.services;

import com.straus.beans.Hero;
import com.straus.beans.Match;
import com.straus.beans.Result;
import com.straus.beans.Season;
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
}
