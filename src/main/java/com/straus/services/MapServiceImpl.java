package com.straus.services;

import com.straus.beans.GameMap;
import com.straus.beans.MapType;
import com.straus.repositories.MapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MapServiceImpl implements MapService {

	private final MapRepository mapRepository;

	@Autowired
	public MapServiceImpl(MapRepository mapRepository) {
		this.mapRepository = mapRepository;
	}

	/**
	 * Method to get a specific map by their id
	 *
	 * @param mapId Id of the map to filter by
	 * @return A map with the matching id
	 */
	@Override
    public GameMap getMapById(int mapId) {
		return mapRepository.findById(mapId).orElse(null);
	}

	/**
	 * Method to get a list of maps by type
	 *
	 * @param mapType Type of the map to retrieve
	 * @return A list of maps with matching MapType
	 */
	@Override
    public List<GameMap> getMapsByType(MapType mapType) {
		return mapRepository.findAllByTypeOrderByName(mapType);
	}

	/**
	 * Method to find all maps used in comp/quick play
	 *
	 * @return A list of maps that excludes arcade maps
	 */
	@Override
    public List<GameMap> getCompMaps() {
		return mapRepository.findAllByTypeNotOrderByName(MapType.ARENA);
	}

	/**
	 * Method to get all maps in the system
	 *
	 * @return A list of all maps
	 */
	@Override
    public List<GameMap> getAllMaps() {
		return mapRepository.findAll(new Sort(Sort.Direction.ASC, "name"));
	}

	/**
     * Method to persist a gameMap into the system
     *
     * @param gameMap New gameMap object to persist
     * @return The gameMap object, with the auto-generated id
	 */
	@Override
    public GameMap createMap(GameMap gameMap) {
        return mapRepository.save(gameMap);
	}

	/**
     * Method to update a gameMap in the system
     *
     * @param gameMap GameMap object to update
	 */
	@Override
    public void updateMap(GameMap gameMap) {
        mapRepository.save(gameMap);
	}

	/**
	 * Method to remove a map from the system
	 *
	 * @param mapId Id of the map to delete
	 */
	@Override
	public void deleteMap(int mapId) {
		mapRepository.deleteById(mapId);
	}
}
