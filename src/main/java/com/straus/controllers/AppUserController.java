package com.straus.controllers;

import com.straus.beans.AppUser;
import com.straus.beans.LoginCredentials;
import com.straus.services.AppUserService;
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
@RequestMapping(value = "/appUser")
@ApiModel(value = "AppUserController", description = "A REST controller to handle HTTP requests made for AppUsers")
public class AppUserController {

	private final AppUserService appUserService;

	@Autowired
	public AppUserController(AppUserService appUserService) {
		this.appUserService = appUserService;
	}

	@GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "Get all users within the application", response = AppUser.class, responseContainer = "List")
	@ApiResponse(code = 200, message = "All users retrieved")
	public ResponseEntity<List<AppUser>> getAllUsers() {
		return new ResponseEntity<>(appUserService.getAllUsers(), HttpStatus.OK);
	}

	@GetMapping(value = "/{userId}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "Get a single user by their id", response = AppUser.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successfully grabbed user"),
			@ApiResponse(code = 404, message = "No user with matching id")
	})
	public ResponseEntity<AppUser> getUserById(@PathVariable int userId) {
		AppUser tempUser = appUserService.getUserById(userId);
		if (tempUser != null && !(tempUser.equals(new AppUser()))) {
			return new ResponseEntity<>(appUserService.getUserById(userId), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping(value = "/new", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "Add a new user to the system", response = AppUser.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successfully created new user"),
			@ApiResponse(code = 403, message = "Bad request, user not added")
	})
	public ResponseEntity<AppUser> createUser(@Valid @RequestBody AppUser appUser) {
		AppUser tempUser = appUserService.createUser(appUser);
		if (tempUser != null) {
			return new ResponseEntity<>(tempUser, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

	@PutMapping(value = "/update", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "Update a user in the system", response = AppUser.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "User successfully updated"),
			@ApiResponse(code = 403, message = "Bad request, user not updated")
	})
	public ResponseEntity<AppUser> updateUser(@Valid @RequestBody AppUser appUser) {
		AppUser tempUser = appUserService.updateUser(appUser);
		if (tempUser != null) {
			return new ResponseEntity<>(tempUser, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

	@PostMapping(value = "/login", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "Validate that a user exists, and return user if found", response = AppUser.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "User successfully found"),
			@ApiResponse(code = 404, message = "User does not exist")
	})
	public ResponseEntity<AppUser> login(@Valid @RequestBody LoginCredentials loginCredentials) {
		AppUser tempUser = appUserService.getUserByNamePass(loginCredentials.getUsername().toLowerCase(), loginCredentials.getPassword());
		if (tempUser != null) {
			return new ResponseEntity<>(tempUser, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

}
