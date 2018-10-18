package com.straus.repositories;

import com.straus.beans.Hero;
import com.straus.beans.Match;
import com.straus.beans.Result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

@Repository
public interface MatchRepository extends JpaRepository<Match, Integer> {
	/**
	 * Method to get all matches for a specific user
	 *
	 * @param userId User to filter by
	 * @return A list of matches for the specified user
	 */
	List<Match> findAllByAppUserUserId(int userId);

	/**
	 * Method to get all matches for a specific result
	 *
	 * @param result Result to filter by (WIN, LOSS)
	 * @return A list of matches for the specific result
	 */
	List<Match> findAllByResult(Result result);

	/**
	 * Method to get all matches in which a specific hero was played
	 *
	 * @param hero Hero to filter by
	 * @return A list of matches containing the specific hero
	 */
	List<Match> findAllByHeroesContains(Hero hero);

	/**
	 * Method to get all matches played during a specified time period
	 *
	 * @param startDate Earliest date match could have been played
	 * @param endDate   Latest date match could have been played
	 * @return A list of matches
	 */
	List<Match> findAllByMatchDateBetween(Timestamp startDate, Timestamp endDate);
}
