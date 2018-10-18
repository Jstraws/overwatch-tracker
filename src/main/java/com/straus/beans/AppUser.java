package com.straus.beans;

import io.swagger.annotations.ApiModel;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "APP_USER")
@ApiModel(value = "App User", description = "A user of the application that will report matches")
public class AppUser {
	private int userId;
	private String firstName;
	private String lastName;
}
