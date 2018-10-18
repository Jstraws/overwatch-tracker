package com.straus.services;

import com.straus.beans.AppUser;
import io.swagger.annotations.ApiModel;

import java.util.List;

@ApiModel(value = "AppUser Service", description = "Provides interface for the AppUser service layer")
public interface AppUserService {
	/**
	 * Method to get a specific user by their id
	 *
	 * @param userId Id of the user to filter by
	 * @return A user with the matching id
	 */
	AppUser getUserById(int userId);

	/**
	 * Method to get all users in the system
	 *
	 * @return A list of all users
	 */
	List<AppUser> getAllUsers();

	/**
	 * Method to persist a user into the system
	 *
	 * @param user New user object to persist
	 * @return The user object, with the auto-generated id
	 */
	AppUser createUser(AppUser user);

	/**
	 * Method to update a user in the system
	 *
	 * @param user User object to update
	 */
	void updateUser(AppUser user);

	/**
	 * Method to remove a user from the system
	 *
	 * @param userId Id of the user to delete
	 */
	void deleteUser(int userId);
}
