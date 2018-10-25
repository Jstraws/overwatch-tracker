package com.straus.controllers;

import com.straus.beans.AppUser;
import com.straus.beans.Hero;
import com.straus.beans.Season;
import com.straus.beans.Statistic;
import com.straus.services.AppUserService;
import com.straus.services.HeroService;
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

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/hero")
@ApiModel(value = "HeroController", description = "A REST controller to handle HTTP requests made for Heroes")
public class HeroController {
	private final HeroService heroService;
	private final AppUserService appUserService;
	private final MatchService matchService;
	private final SeasonService seasonService;

	@Autowired
	public HeroController(HeroService heroService, AppUserService appUserService, MatchService matchService, SeasonService seasonService) {
		this.heroService = heroService;
		this.appUserService = appUserService;
		this.matchService = matchService;
		this.seasonService = seasonService;
	}

	@GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "Get all Heroes in the system", response = Hero.class, responseContainer = "List")
	@ApiResponse(code = 200, message = "All heroes retrieved")
	public ResponseEntity<List<Hero>> getAllHeroes() {
		return new ResponseEntity<>(heroService.getAllHeroes(), HttpStatus.OK);
	}

	@GetMapping(value = "/{heroId}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "Get a hero by its id", response = Hero.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Hero successfully found"),
			@ApiResponse(code = 403, message = "Hero not found")
	})
	public ResponseEntity<Hero> getHeroById(@PathVariable int heroId) {
		Hero tempHero = heroService.getHeroById(heroId);
		if (tempHero != null && !(tempHero.equals(new Hero()))) {
			return new ResponseEntity<>(tempHero, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping(value = "/stats/{heroId}/{userId}/{seasonId}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "Get the statistics for a specific hero", response = Statistic.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Statistics successfully generated"),
			@ApiResponse(code = 404, message = "Hero not found"),
			@ApiResponse(code = 404, message = "User not found")
	})
	public ResponseEntity<Statistic> getHeroStatistic(@PathVariable int heroId, @PathVariable int userId, @PathVariable int seasonId) {
		Hero tempHero = heroService.getHeroById(heroId);
		AppUser tempUser = appUserService.getUserById(userId);
		Season tempSeason = seasonService.getSeasonById(seasonId);
		if (tempHero != null && !(tempHero.equals(new Hero()))) {
			if (tempUser != null && !(tempUser.equals(new AppUser()))) {
				Statistic statistic = matchService.getMatchStatistics(matchService.getMatchByHeroAndUserIdInSeason(tempHero, tempUser.getUserId(), tempSeason), tempHero.getName());
				statistic.setIconUrl(tempHero.getHeroUrl());
				return new ResponseEntity<>(statistic, HttpStatus.OK);
			} else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}
