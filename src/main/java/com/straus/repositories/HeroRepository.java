package com.straus.repositories;

import com.straus.beans.Hero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HeroRepository extends JpaRepository<Hero, Integer> {
	/**
	 * Function to find all heroes but sort by Name
	 *
	 * @return A sorted list of heroes
	 */
	List<Hero> findAllByOrderByName();
}
