package com.straus.beans;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "MAP")
@ApiModel(value = "Map", description = "Map that a match is played on")
public class Map {
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

	public Map(String name, MapType type) {
		this.name = name;
		this.type = type;
	}

	public Map() {
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

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Map map = (Map) o;
		return getMapId() == map.getMapId() &&
				Objects.equals(getName(), map.getName()) &&
				getType() == map.getType();
	}

	@Override
	public int hashCode() {
		return Objects.hash(getMapId(), getName(), getType());
	}

	@Override
	public String toString() {
		return "Map{" +
				"mapId=" + mapId +
				", name='" + name + '\'' +
				", type=" + type +
				'}';
	}
}
