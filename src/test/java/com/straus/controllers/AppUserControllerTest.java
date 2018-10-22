package com.straus.controllers;

import com.straus.Application;
import io.restassured.authentication.FormAuthConfig;
import net.minidev.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

import static io.restassured.RestAssured.given;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Application.class}, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureTestDatabase
public class AppUserControllerTest {

	@LocalServerPort
	private int port;

	@Test
	public void login() {
		JSONObject requestParams = new JSONObject();
		requestParams.put("username", "Jstraus");
		requestParams.put("password", "testPass");

		given()
				.auth().form("admin", "thisIsAPass3215", FormAuthConfig.springSecurity())
				.port(port)
				.contentType("application/json")
				.body(requestParams.toJSONString())
				.when()
				.post("/appUser/login")
				.then()
				.statusCode(200);

	}
}