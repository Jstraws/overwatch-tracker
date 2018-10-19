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

	public AppUser(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
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

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		AppUser appUser = (AppUser) o;
		return getUserId() == appUser.getUserId() &&
				Objects.equals(getFirstName(), appUser.getFirstName()) &&
				Objects.equals(getLastName(), appUser.getLastName());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getUserId(), getFirstName(), getLastName());
	}

	@Override
	public String toString() {
		return "AppUser{" +
				"userId=" + userId +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				'}';
	}
}
