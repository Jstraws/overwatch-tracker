package com.straus.services;

import com.straus.Application;
import com.straus.beans.AppUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@AutoConfigureTestDatabase
public class AppUserServiceTest {

	@Autowired
	private AppUserService appUserService;

	@Test
	public void getUserById() {
	}

	@Test
	public void getUserByNamePass() {
		AppUser testUser = appUserService.getUserByNamePass("Jstraus", "testPass");
		assertEquals(500, testUser.getUserId());
	}

	@Test
	public void getAllUsers() {
	}

	@Test
	public void createUser() {
	}

	@Test
	public void updateUser() {
	}

	@Test
	public void deleteUser() {
	}
}