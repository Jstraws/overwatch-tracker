package com.straus.services;

import com.straus.beans.Hero;
import com.straus.repositories.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeroServiceImpl implements HeroService {

	private final HeroRepository heroRepository;

	@Autowired
	public HeroServiceImpl(HeroRepository heroRepository) {
		this.heroRepository = heroRepository;
	}

	/**
	 * Method to get a hero by its Id
	 *
	 * @param heroId Id of the hero to filter by
	 * @return The hero with the matching id
	 */
	@Override
	public Hero getHeroById(int heroId) {
		return heroRepository.getOne(heroId);
	}

	/**
	 * Method to get all heroes in the system
	 *
	 * @return A list of all heroes
	 */
	@Override
	public List<Hero> getAllHeroes() {
		return heroRepository.findAll();
	}

	/**
	 * Method to persist a new hero in the system
	 *
	 * @param hero New hero to be persisted
	 * @return The hero object with the auto-generated id
	 */
	@Override
	public Hero createHero(Hero hero) {
		return heroRepository.save(hero);
	}

	/**
	 * Method to update a hero in the system
	 *
	 * @param hero Hero object to update
	 */
	@Override
	public void updateHero(Hero hero) {
		heroRepository.save(hero);
	}

	/**
	 * Method to delete a hero by its id
	 *
	 * @param heroId Id of the hero to delete
	 */
	@Override
	public void deleteHeroById(int heroId) {
		heroRepository.deleteById(heroId);
	}
}
