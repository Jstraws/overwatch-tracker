package com.straus.controllers;

import com.straus.beans.Match;
import com.straus.services.MatchService;
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
@RequestMapping(value = "/match")
@ApiModel(value = "MatchController", description = "A REST controller to handle HTTP requests for match objects")
public class MatchController {

	private final MatchService matchService;

	@Autowired
	public MatchController(MatchService matchService) {
		this.matchService = matchService;
	}

	@GetMapping(value = "/user/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "A method to get all matches for a user", response = Match.class, responseContainer = "List")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successfully retrieved match history"),
			@ApiResponse(code = 404, message = "User not found in system")
	})
	public ResponseEntity<List<Match>> getMatchesForUser(@PathVariable int id) {
		try {
			return new ResponseEntity<>(matchService.getMatchByUserId(id), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}
