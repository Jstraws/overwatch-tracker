package com.straus.services;

import com.straus.beans.GameMap;
import com.straus.beans.MapType;
import io.swagger.annotations.ApiModel;

import java.util.List;

@ApiModel(value = "GameMap Service", description = "Provides interface for the GameMap service layer")
public interface MapService {
	/**
	 * Method to get a specific map by their id
	 *
	 * @param mapId Id of the map to filter by
	 * @return A map with the matching id
	 */
    GameMap getMapById(int mapId);

	/**
	 * Method to get a list of maps by type
	 *
	 * @param mapType Type of the map to retrieve
	 * @return A list of maps with matching MapType
	 */
    List<GameMap> getMapsByType(MapType mapType);

	/**
	 * Method to find all maps used in comp/quick play
	 *
	 * @return A list of maps that excludes arcade maps
	 */
    List<GameMap> getCompMaps();

	/**
	 * Method to get all maps in the system
	 *
	 * @return A list of all maps
	 */
    List<GameMap> getAllMaps();

	/**
     * Method to persist a gameMap into the system
     *
     * @param gameMap New gameMap object to persist
     * @return The gameMap object, with the auto-generated id
	 */
    GameMap createMap(GameMap gameMap);

	/**
     * Method to update a gameMap in the system
     *
     * @param gameMap GameMap object to update
	 */
    void updateMap(GameMap gameMap);

	/**
	 * Method to remove a map from the system
	 *
	 * @param mapId Id of the map to delete
	 */
	void deleteMap(int mapId);
}
