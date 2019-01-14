package com.straus.services;

import com.straus.beans.AppUser;
import com.straus.repositories.AppUserRepository;
import org.apache.commons.text.WordUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Service
@CrossOrigin
public class AppUserServiceImpl implements AppUserService {

	private final AppUserRepository appUserRepository;

	@Autowired
	public AppUserServiceImpl(AppUserRepository appUserRepository) {
		this.appUserRepository = appUserRepository;
	}

	/**
	 * Method to get a specific user by their id
	 *
	 * @param userId Id of the user to filter by
	 * @return A user with the matching id
	 */
	@Override
	public AppUser getUserById(int userId) {
		return appUserRepository.findById(userId).orElse(null);
	}

	/**
	 * Method to get a user by username/pass for logging in
	 *
	 * @param username Username of the user to filter by
	 * @param password Password of the user to filter by
	 * @return A user with matching username/password
	 */
	@Override
	public AppUser getUserByNamePass(String username, String password) {
		if (username != null && !(username.equals("")) && password != null && !(password.isEmpty())) {
			return appUserRepository.findAppUserByUserNameAndPassword(username.toLowerCase(), password.hashCode());
		} else {
			return null;
		}
	}

	/**
	 * Method to get all users in the system
	 *
	 * @return A list of all users
	 */
	@Override
	public List<AppUser> getAllUsers() {
		return appUserRepository.findAll();
	}

	/**
	 * Method to persist a user into the system
	 *
	 * @param user New user object to persist
	 * @return The user object, with the auto-generated id
	 */
	@Override
	public AppUser createUser(AppUser user) {
		if (user != null && !(user.equals(new AppUser()))) {
			if (appUserRepository.findAppUserByUserNameAndPassword(user.getUserName(), user.getPassword()) == null) {
				user.setUserName(user.getUserName().toLowerCase());
				user.setFirstName(WordUtils.capitalize(user.getFirstName()));
				user.setLastName(WordUtils.capitalize(user.getLastName()));
				return appUserRepository.save(user);
			} else {
				return null;
			}
		} else {
			return null;
		}
	}

	/**
	 * Method to update a user in the system
	 *
	 * @param user User object to update
	 */
	@Override
	public AppUser updateUser(AppUser user) {
		if (user != null && !(user.equals(new AppUser()))) {
			return appUserRepository.save(user);
		} else {
			return null;
		}
	}

	/**
	 * Method to remove a user from the system
	 *
	 * @param userId Id of the user to delete
	 */
	@Override
	public void deleteUser(int userId) {
		if (userId > 0) {
			appUserRepository.deleteById(userId);
		}
	}
}
