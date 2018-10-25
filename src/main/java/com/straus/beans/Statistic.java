package com.straus.beans;

import java.util.Objects;

public class Statistic {
	private String name;
	private int wins;
	private int losses;
	private int draws;
	private int srChange;
	private String iconUrl;

	public Statistic() {
	}

	public Statistic(String name) {
		this.name = name;
	}

	public Statistic(String name, int wins, int losses, int draws, int srChange, String iconUrl) {
		this.name = name;
		this.wins = wins;
		this.losses = losses;
		this.draws = draws;
		this.srChange = srChange;
		this.iconUrl = iconUrl;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public int getLosses() {
		return losses;
	}

	public void setLosses(int losses) {
		this.losses = losses;
	}

	public int getDraws() {
		return draws;
	}

	public void setDraws(int draws) {
		this.draws = draws;
	}

	public int getSrChange() {
		return srChange;
	}

	public void setSrChange(int srChange) {
		this.srChange = srChange;
	}

	public String getIconUrl() {
		return iconUrl;
	}

	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}

	public void addWin() {
		this.wins += 1;
	}

	public void addLoss() {
		this.losses += 1;
	}

	public void addDraw() {
		this.draws += 1;
	}

	public void addSr(int amount) {
		this.srChange += amount;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Statistic statistic = (Statistic) o;
		return getWins() == statistic.getWins() &&
				getLosses() == statistic.getLosses() &&
				getDraws() == statistic.getDraws() &&
				getSrChange() == statistic.getSrChange() &&
				Objects.equals(getName(), statistic.getName()) &&
				Objects.equals(getIconUrl(), statistic.getIconUrl());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getName(), getWins(), getLosses(), getDraws(), getSrChange(), getIconUrl());
	}

	@Override
	public String toString() {
		return "Statistic{" +
				"name='" + name + '\'' +
				", wins=" + wins +
				", losses=" + losses +
				", draws=" + draws +
				", srChange=" + srChange +
				", iconUrl='" + iconUrl + '\'' +
				'}';
	}
}
