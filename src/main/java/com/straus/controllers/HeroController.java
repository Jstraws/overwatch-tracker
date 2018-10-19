package com.straus.controllers;

import com.straus.beans.Hero;
import com.straus.services.HeroService;
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

	@Autowired
	public HeroController(HeroService heroService) {
		this.heroService = heroService;
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
}
