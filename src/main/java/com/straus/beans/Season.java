package com.straus.beans;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "SEASON")
@ApiModel(value = "Season", description = "A chunk of time for competitive matches")
public class Season {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "SEASON_ID")
	@ApiModelProperty(value = "Id of the season")
	private int seasonId;

	@Column(name = "NAME")
	@ApiModelProperty(value = "Name of the season")
	private String name;

	@Column(name = "START_DATE")
	@ApiModelProperty(value = "Date season started")
	private Timestamp startDate;

	@Column(name = "END_DATE")
	@ApiModelProperty(value = "Date season ended")
	private Timestamp endDate;

	public Season(String name, Timestamp startDate, Timestamp endDate) {
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public Season() {
	}

	public int getSeasonId() {
		return seasonId;
	}

	public void setSeasonId(int seasonId) {
		this.seasonId = seasonId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Timestamp getStartDate() {
		return startDate;
	}

	public void setStartDate(Timestamp startDate) {
		this.startDate = startDate;
	}

	public Timestamp getEndDate() {
		return endDate;
	}

	public void setEndDate(Timestamp endDate) {
		this.endDate = endDate;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Season season = (Season) o;
		return getSeasonId() == season.getSeasonId() &&
				Objects.equals(getName(), season.getName()) &&
				Objects.equals(getStartDate(), season.getStartDate()) &&
				Objects.equals(getEndDate(), season.getEndDate());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getSeasonId(), getName(), getStartDate(), getEndDate());
	}

	@Override
	public String toString() {
		return "Season{" +
				"seasonId=" + seasonId +
				", name='" + name + '\'' +
				", startDate=" + startDate +
				", endDate=" + endDate +
				'}';
	}
}
