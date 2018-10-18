package com.straus.services;

import com.straus.beans.Map;
import com.straus.repositories.MapRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
	public Map getMapById(int mapId) {
		return mapRepository.getOne(mapId);
	}

	/**
	 * Method to get all maps in the system
	 *
	 * @return A list of all maps
	 */
	@Override
	public List<Map> getAllMaps() {
		return mapRepository.findAll();
	}

	/**
	 * Method to persist a map into the system
	 *
	 * @param map New map object to persist
	 * @return The map object, with the auto-generated id
	 */
	@Override
	public Map createMap(Map map) {
		return mapRepository.save(map);
	}

	/**
	 * Method to update a map in the system
	 *
	 * @param map Map object to update
	 */
	@Override
	public void updateMap(Map map) {
		mapRepository.save(map);
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
