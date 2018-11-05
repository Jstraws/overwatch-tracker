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

import javax.validation.Valid;
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

	@GetMapping(value = "/recent/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "A method to get the most recent match for a user", response = Match.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successfully retrieved match"),
			@ApiResponse(code = 404, message = "User not found in system")
	})
	public ResponseEntity<Match> getMostRecentMatchForUser(@PathVariable int id) {
		try {
			return new ResponseEntity<>(matchService.getUsersMostRecentMatch(id), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping(value = "/new", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "A method to add a new match", response = Match.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successfully added match"),
			@ApiResponse(code = 401, message = "Bad data, match not added")
	})
	public ResponseEntity<Match> addNewMatch(@Valid @RequestBody Match match) {
		try {
			return new ResponseEntity<>(matchService.createMatch(match), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "A method to get a single match", response = Match.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successfully retrieved match"),
			@ApiResponse(code = 404, message = "Match could not be found")
	})
	public ResponseEntity<Match> getMatchById(@PathVariable int id) {
		Match tempMatch = matchService.getMatchById(id);
		if (tempMatch != null && !(tempMatch.equals(new Match()))) {
			return new ResponseEntity<>(tempMatch, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping(value = "/{id}")
	@ApiOperation(value = "A method to delete a match")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successfully delete match"),
			@ApiResponse(code = 404, message = "Match not found")
	})
	public ResponseEntity<String> deleteMatchById(@PathVariable int id) {
		try {
			matchService.deleteMatch(id);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}
