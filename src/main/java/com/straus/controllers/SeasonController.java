package com.straus.controllers;

import com.straus.beans.Season;
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

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/season")
@ApiModel(value = "SeasonController", description = "A REST controller to handle HTTP requests for season objects")
public class SeasonController {

	private final SeasonService seasonService;

	@Autowired
	public SeasonController(SeasonService seasonService) {
		this.seasonService = seasonService;
	}

	@GetMapping(value = "/{seasonId}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "A method to get a season by its id", response = Season.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Season successfully found"),
			@ApiResponse(code = 404, message = "Season could not be found")
	})
	public ResponseEntity<Season> getSeasonById(@PathVariable int seasonId) {
		Season tempSeason = seasonService.getSeasonById(seasonId);
		if (tempSeason != null && !(tempSeason.equals(new Season()))) {
			return new ResponseEntity<>(tempSeason, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "A method to retrieve all seasons", response = Season.class, responseContainer = "List")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "All seasons retrieved")
	})
	public ResponseEntity<List<Season>> getAllSeasons() {
		return new ResponseEntity<>(seasonService.getAllSeasons(), HttpStatus.OK);
	}
}
