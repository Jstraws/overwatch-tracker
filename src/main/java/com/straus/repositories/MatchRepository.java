package com.straus.repositories;

import com.straus.beans.*;
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
	List<Match> findAllByAppUserUserIdOrderByMatchDateDesc(int userId);

	/**
	 * Method to get all matches for a specific result
	 *
	 * @param result Result to filter by (WIN, LOSS)
	 * @return A list of matches for the specific result
	 */
	List<Match> findAllByResultOrderByMatchDateDesc(Result result);

	/**
	 * Method to get all matches in which a specific hero was played
	 *
	 * @param hero Hero to filter by
	 * @return A list of matches containing the specific hero
	 */
	List<Match> findAllByHeroesContainsOrderByMatchDateDesc(Hero hero);

	/**
	 * Method to get all matches played during a specified time period
	 *
	 * @param startDate Earliest date match could have been played
	 * @param endDate   Latest date match could have been played
	 * @return A list of matches
	 */
	List<Match> findAllByMatchDateBetweenOrderByMatchDateDesc(Timestamp startDate, Timestamp endDate);

	/**
	 * Method to get the most recent match a user played
	 *
	 * @param userId User id to filter by
	 * @return A single match
	 */
	Match findFirstByAppUserUserIdOrderByMatchDateDesc(int userId);

	/**
	 * Method to get all matches played on a specific map by a specific user
	 *
	 * @param map    Map to filter by
	 * @param userId UserId to filter by
	 * @return A list of matches
	 */
	List<Match> findAllByMapAndAppUserUserIdOrderByMatchDateDesc(Map map, int userId);

	/**
	 * Method to get all matches played on a specific MapType by a specific user
	 *
	 * @param mapType Type of map to filter by
	 * @param userId  UserId to filter by
	 * @return A list of matches
	 */
	List<Match> findAllByMapTypeAndAppUserUserIdOrderByMatchDateDesc(MapType mapType, int userId);
}
