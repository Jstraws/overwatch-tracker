package com.straus.services;

import com.straus.beans.Hero;
import io.swagger.annotations.ApiModel;

import java.util.List;

@ApiModel(value = "HeroService", description = "Provides interface for the Hero service layer")
public interface HeroService {
	/**
	 * Method to get a hero by its Id
	 *
	 * @param heroId Id of the hero to filter by
	 * @return The hero with the matching id
	 */
	Hero getHeroById(int heroId);

	/**
	 * Method to get all heroes in the system
	 *
	 * @return A list of all heroes
	 */
	List<Hero> getAllHeroes();

	/**
	 * Method to persist a new hero in the system
	 *
	 * @param hero New hero to be persisted
	 * @return The hero object with the auto-generated id
	 */
	Hero createHero(Hero hero);

	/**
	 * Method to update a hero in the system
	 *
	 * @param hero Hero object to update
	 */
	void updateHero(Hero hero);

	/**
	 * Method to delete a hero by its id
	 *
	 * @param heroId Id of the hero to delete
	 */
	void deleteHeroById(int heroId);
}
