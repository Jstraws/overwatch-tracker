package com.straus.controllers;

import com.straus.beans.Map;
import com.straus.beans.MapType;
import com.straus.services.MapService;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/map")
@ApiModel(value = "MapController", description = "A REST controller to handle HTTP requests for map objects")
public class MapController {

	private final MapService mapService;

	@Autowired
	public MapController(MapService mapService) {
		this.mapService = mapService;
	}

	@GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "A method to get all maps within the system", response = Map.class, responseContainer = "List")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successfully retrieved all maps")
	})
	public ResponseEntity<List<Map>> getAllMaps() {
		return new ResponseEntity<>(mapService.getAllMaps(), HttpStatus.OK);
	}

	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "A method to get a single map by its id", response = Map.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Map successfully retrieved"),
			@ApiResponse(code = 404, message = "No map with that id exists")
	})
	public ResponseEntity<Map> getMapById(@PathVariable int id) {
		Map tempMap = mapService.getMapById(id);
		if (tempMap != null && !(tempMap.equals(new Map()))) {
			return new ResponseEntity<>(tempMap, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping(value = "/types", produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "A method to get all map types", response = MapType.class, responseContainer = "List")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "MapTypes successfully retrieved")
	})
	public ResponseEntity<List<MapType>> getMapTypes() {
		List<MapType> mapTypes = new ArrayList<>(EnumSet.allOf(MapType.class));
		return new ResponseEntity<>(mapTypes, HttpStatus.OK);
	}

	@GetMapping(value = "/type/{type}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "A method to get maps by map type", response = Map.class, responseContainer = "List")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Maps successfully retrieved"),
			@ApiResponse(code = 404, message = "Type does not exist")
	})
	public ResponseEntity<List<Map>> getMapByType(@PathVariable MapType type) {
		try {
			return new ResponseEntity<>(mapService.getMapsByType(type), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping(value = "/standard", produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "A method to get all standard (non arcade) maps", response = Map.class, responseContainer = "List")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Maps successfully retrieved")
	})
	public ResponseEntity<List<Map>> getAllStandardMaps() {
		return new ResponseEntity<>(mapService.getCompMaps(), HttpStatus.OK);
	}
}
