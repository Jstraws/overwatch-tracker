package com.straus.beans;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "MATCH")
@ApiModel(value = "Match", description = "A match within the game, which will contain what was played and where")
public class Match {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "MATCH_ID")
	@ApiModelProperty(value = "Id of the match")
	private int matchId;

	@Enumerated(EnumType.STRING)
	@Column(name = "RESULT")
	@ApiModelProperty(value = "Result of the match (win/loss)")
	private Result result;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "MAP_ID")
	@ApiModelProperty(value = "Map match was played on")
	private Map map;

	@ManyToMany
	@JoinTable(
			name = "MATCH_HERO",
			joinColumns = @JoinColumn(name = "MATCH_ID"),
			inverseJoinColumns = @JoinColumn(name = "HERO_ID")
	)
	@ApiModelProperty(value = "Heroes played during the match")
	private List<Hero> heroes = new ArrayList<>();

	@CreationTimestamp
	@Column(name = "MATCH_DATE")
	@ApiModelProperty(value = "Date match was played")
	private Timestamp matchDate;

	@Column(name = "RANK")
	@ApiModelProperty(value = "User's rank after the match")
	private int rank;

	@Column(name = "RANK_DIFFERENCE")
	@ApiModelProperty(value = "Change in rank from previous match")
	private int rankDifference;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "APP_USER_ID")
	@ApiModelProperty(value = "User who played the match")
	private AppUser appUser;

	public Match(Result result, Map map, List<Hero> heroes, Timestamp matchDate, int rank, int rankDifference, AppUser appUser) {
		this.result = result;
		this.map = map;
		this.heroes = heroes;
		this.matchDate = matchDate;
		this.rank = rank;
		this.rankDifference = rankDifference;
		this.appUser = appUser;
	}

	public Match() {
	}

	public int getMatchId() {
		return matchId;
	}

	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public Map getMap() {
		return map;
	}

	public void setMap(Map map) {
		this.map = map;
	}

	public List<Hero> getHeroes() {
		return heroes;
	}

	public void setHeroes(List<Hero> heroes) {
		this.heroes = heroes;
	}

	public Timestamp getMatchDate() {
		return matchDate;
	}

	public void setMatchDate(Timestamp matchDate) {
		this.matchDate = matchDate;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getRankDifference() {
		return rankDifference;
	}

	public void setRankDifference(int rankDifference) {
		this.rankDifference = rankDifference;
	}

	public AppUser getAppUser() {
		return appUser;
	}

	public void setAppUser(AppUser appUser) {
		this.appUser = appUser;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Match match = (Match) o;
		return getMatchId() == match.getMatchId() &&
				getRank() == match.getRank() &&
				getRankDifference() == match.getRankDifference() &&
				getResult() == match.getResult() &&
				Objects.equals(getMap(), match.getMap()) &&
				Objects.equals(getHeroes(), match.getHeroes()) &&
				Objects.equals(getMatchDate(), match.getMatchDate()) &&
				Objects.equals(getAppUser(), match.getAppUser());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getMatchId(), getResult(), getMap(), getHeroes(), getMatchDate(), getRank(), getRankDifference(), getAppUser());
	}

	@Override
	public String toString() {
		return "Match{" +
				"matchId=" + matchId +
				", result=" + result +
				", map=" + map +
				", heroes=" + heroes +
				", matchDate=" + matchDate +
				", rank=" + rank +
				", rankDifference=" + rankDifference +
				", appUser=" + appUser +
				'}';
	}
}
