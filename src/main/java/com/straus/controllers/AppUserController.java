package com.straus.controllers;

import com.straus.beans.AppUser;
import com.straus.services.AppUserService;
import io.swagger.annotations.ApiModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/appUser")
@ApiModel(value = "AppUserController", description = "A REST controller to handle HTTP requests made for AppUsers")
public class AppUserController {

	private final AppUserService appUserService;

	@Autowired
	public AppUserController(AppUserService appUserService) {
		this.appUserService = appUserService;
	}

	@GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<AppUser>> getAllUsers() {
		return new ResponseEntity<>(appUserService.getAllUsers(), HttpStatus.OK);
	}
}
