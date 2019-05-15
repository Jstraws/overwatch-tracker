package com.straus.beans;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "MAP")
@ApiModel(value = "GameMap", description = "GameMap that a match is played on")
public class GameMap {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "MAP_ID")
	@ApiModelProperty(value = "Id of the map")
	private int mapId;

	@Column(name = "NAME")
	@ApiModelProperty(value = "Name of the map")
	private String name;

	@Column(name = "TYPE")
	@Enumerated(EnumType.STRING)
	@ApiModelProperty(value = "Type of the map")
	private MapType type;

	@Column(name = "ICON_URL")
	@ApiModelProperty(value = "Icon for the GameMap")
	private String iconUrl;

	public GameMap() {
	}

	public GameMap(String name, MapType type, String iconUrl) {
		this.name = name;
		this.type = type;
		this.iconUrl = iconUrl;
	}

	public int getMapId() {
		return mapId;
	}

	public void setMapId(int mapId) {
		this.mapId = mapId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MapType getType() {
		return type;
	}

	public void setType(MapType type) {
		this.type = type;
	}

	public String getIconUrl() {
		return iconUrl;
	}

	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		GameMap gameMap = (GameMap) o;
		return getMapId() == gameMap.getMapId() &&
				Objects.equals(getName(), gameMap.getName()) &&
				getType() == gameMap.getType() &&
				Objects.equals(getIconUrl(), gameMap.getIconUrl());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getMapId(), getName(), getType(), getIconUrl());
	}

	@Override
	public String toString() {
		return "GameMap{" +
				"mapId=" + mapId +
				", name='" + name + '\'' +
				", type=" + type +
				", iconUrl='" + iconUrl + '\'' +
				'}';
	}
}
