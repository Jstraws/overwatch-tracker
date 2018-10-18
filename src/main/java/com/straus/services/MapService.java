package com.straus.services;

import com.straus.beans.Map;
import io.swagger.annotations.ApiModel;

import java.util.List;

@ApiModel(value = "Map Service", description = "Provides interface for the Map service layer")
public interface MapService {
	/**
	 * Method to get a specific map by their id
	 *
	 * @param mapId Id of the map to filter by
	 * @return A map with the matching id
	 */
	Map getMapById(int mapId);

	/**
	 * Method to get all maps in the system
	 *
	 * @return A list of all maps
	 */
	List<Map> getAllMaps();

	/**
	 * Method to persist a map into the system
	 *
	 * @param map New map object to persist
	 * @return The map object, with the auto-generated id
	 */
	Map createMap(Map map);

	/**
	 * Method to update a map in the system
	 *
	 * @param map Map object to update
	 */
	void updateMap(Map map);

	/**
	 * Method to remove a map from the system
	 *
	 * @param mapId Id of the map to delete
	 */
	void deleteMap(int mapId);
}
