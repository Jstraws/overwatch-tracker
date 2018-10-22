package com.straus.beans;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "APP_USER")
@ApiModel(value = "App User", description = "A user of the application that will report matches")
public class AppUser {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "USER_ID")
	@ApiModelProperty(value = "Id of the User")
	private int userId;

	@Column(name = "FIRST_NAME")
	@ApiModelProperty(value = "First name of the User")
	private String firstName;

	@Column(name = "LAST_NAME")
	@ApiModelProperty(value = "Last name of the User")
	private String lastName;

	@Column(name = "USERNAME")
	@ApiModelProperty(value = "Username to log into the application")
	private String userName;

	@Column(name = "PASSWORD")
	@ApiModelProperty(value = "Password of the user")
	private int password;

	public AppUser(String firstName, String lastName, String userName, String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password.hashCode();
	}

	public AppUser() {
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password.hashCode();
	}

	public void setPassword(int password) {
		this.password = password;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		AppUser appUser = (AppUser) o;
		return getUserId() == appUser.getUserId() &&
				getPassword() == appUser.getPassword() &&
				Objects.equals(getFirstName(), appUser.getFirstName()) &&
				Objects.equals(getLastName(), appUser.getLastName()) &&
				Objects.equals(getUserName(), appUser.getUserName());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getUserId(), getFirstName(), getLastName(), getUserName(), getPassword());
	}

	@Override
	public String toString() {
		return "AppUser{" +
				"userId=" + userId +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", userName='" + userName + '\'' +
				", password=" + password +
				'}';
	}
}
