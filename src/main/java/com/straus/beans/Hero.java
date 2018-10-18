package com.straus.beans;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "HERO")
@ApiModel(value = "Hero", description = "A specific hero that was played within a match")
public class Hero {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "HERO_ID")
	@ApiModelProperty(value = "Id of the hero")
	private int heroId;

	@Column(name = "NAME")
	@ApiModelProperty(value = "Name of the hero")
	private String name;

	@Column(name = "TYPE")
	@Enumerated(EnumType.STRING)
	@ApiModelProperty("The class of the hero")
	private HeroType type;

	public Hero(String name, HeroType type) {
		this.name = name;
		this.type = type;
	}

	public Hero() {
	}

	public int getHeroId() {
		return heroId;
	}

	public void setHeroId(int heroId) {
		this.heroId = heroId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public HeroType getType() {
		return type;
	}

	public void setType(HeroType type) {
		this.type = type;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Hero hero = (Hero) o;
		return getHeroId() == hero.getHeroId() &&
				Objects.equals(getName(), hero.getName()) &&
				getType() == hero.getType();
	}

	@Override
	public int hashCode() {
		return Objects.hash(getHeroId(), getName(), getType());
	}

	@Override
	public String toString() {
		return "Hero{" +
				"heroId=" + heroId +
				", name='" + name + '\'' +
				", type=" + type +
				'}';
	}
}
