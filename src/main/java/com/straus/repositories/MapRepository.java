package com.straus.repositories;

import com.straus.beans.GameMap;
import com.straus.beans.MapType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MapRepository extends JpaRepository<GameMap, Integer> {
	/**
	 * Method to find all maps with matching type
	 *
	 * @param type Type of map to filter by
	 * @return A list of maps with matching types
	 */
	List<GameMap> findAllByTypeOrderByName(MapType type);

	/**
	 * Method to find all maps WITHOUT matching type
	 *
	 * @param type Type to exclude
	 * @return A list of maps without matching type
	 */
	List<GameMap> findAllByTypeNotOrderByName(MapType type);
}
