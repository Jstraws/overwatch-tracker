package com.straus.controllers;

import com.straus.beans.*;
import com.straus.services.AppUserService;
import com.straus.services.MapService;
import com.straus.services.MatchService;
import com.straus.services.SeasonService;
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
	private final MatchService matchService;
	private final AppUserService appUserService;
	private final SeasonService seasonService;

	@Autowired
	public MapController(MapService mapService, MatchService matchService, AppUserService appUserService, SeasonService seasonService) {
		this.mapService = mapService;
		this.matchService = matchService;
		this.appUserService = appUserService;
		this.seasonService = seasonService;
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

	@GetMapping(value = "/stats/type/{type}/{userId}/{seasonId}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "A method to get statistics for a MapType", response = Statistic.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Statistics successfully generated"),
			@ApiResponse(code = 400, message = "MapType does not exist, could not parse"),
			@ApiResponse(code = 404, message = "User not found")
	})
	public ResponseEntity<Statistic> getMapTypeStatistics(@PathVariable MapType type, @PathVariable int userId, @PathVariable int seasonId) {
		AppUser tempUser = appUserService.getUserById(userId);
		Season tempSeason = seasonService.getSeasonById(seasonId);
		if (tempUser != null && !(tempUser.equals(new AppUser()))) {
			if (tempSeason != null && !(tempSeason.equals(new Season()))) {
				Statistic stat = matchService.getMatchStatistics(matchService.getMatchByMapTypeAndUserInSeason(type, tempUser.getUserId(), tempSeason), type.toString());
				if (type.equals(MapType.ARENA)) {
					stat.setIconUrl("https://www.dropbox.com/s/lnpfxiq26ikpzfi/arcade.jpg?raw=1");
				} else if (type.equals(MapType.ASSAULT)) {
					stat.setIconUrl("https://i.imgur.com/CzzZpnS.png");
				} else if (type.equals(MapType.CONTROL)) {
					stat.setIconUrl("https://i.imgur.com/KQu7XOX.png");
				} else if (type.equals(MapType.ESCORT)) {
					stat.setIconUrl("https://i.imgur.com/NTgjGPB.png");
				} else {
					stat.setIconUrl("https://i.imgur.com/RpNDBXB.png");
				}
				return new ResponseEntity<>(stat, HttpStatus.OK);
			} else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping(value = "/stats/{id}/{userId}/{seasonId}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "A method to get statistics for a specific Map", response = Statistic.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Statistics successfuly generated"),
			@ApiResponse(code = 404, message = "Map not found"),
			@ApiResponse(code = 404, message = "User not found")
	})
	public ResponseEntity<Statistic> getMapStatistics(@PathVariable int id, @PathVariable int userId, @PathVariable int seasonId) {
		Map tempMap = mapService.getMapById(id);
		AppUser tempUser = appUserService.getUserById(userId);
		Season tempSeason = seasonService.getSeasonById(seasonId);
		if (tempMap != null && !(tempMap.equals(new Map()))) {
			if (tempUser != null && !(tempUser.equals(new AppUser()))) {
				if (tempSeason != null && !(tempSeason.equals(new Season()))) {
					Statistic stat = matchService.getMatchStatistics(matchService.getMatchByMapAndUserInSeason(tempMap, tempUser.getUserId(), tempSeason), tempMap.getName());
					stat.setIconUrl(tempMap.getIconUrl());
					return new ResponseEntity<>(stat, HttpStatus.OK);
				} else {
					return new ResponseEntity<>(HttpStatus.NOT_FOUND);
				}
			} else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}
