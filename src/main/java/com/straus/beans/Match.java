package com.straus.beans;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

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
    @ApiModelProperty(value = "GameMap match was played on")
    private GameMap gameMap;

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

    @Column(name = "COMMENTS")
    @ApiModelProperty(value = "Comments regarding the match")
    private String comments;

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

    public GameMap getGameMap() {
        return gameMap;
    }

    public void setGameMap(GameMap gameMap) {
        this.gameMap = gameMap;
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

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Match match = (Match) o;

        return new EqualsBuilder()
                .append(getMatchId(), match.getMatchId())
                .append(getRank(), match.getRank())
                .append(getRankDifference(), match.getRankDifference())
                .append(getComments(), match.getComments())
                .append(getResult(), match.getResult())
                .append(getGameMap(), match.getGameMap())
                .append(getHeroes(), match.getHeroes())
                .append(getMatchDate(), match.getMatchDate())
                .append(getAppUser(), match.getAppUser())
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(getMatchId())
                .append(getResult())
                .append(getGameMap())
                .append(getHeroes())
                .append(getMatchDate())
                .append(getRank())
                .append(getRankDifference())
                .append(getAppUser())
                .append(getComments())
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("matchId", matchId)
                .append("result", result)
                .append("gameMap", gameMap)
                .append("heroes", heroes)
                .append("matchDate", matchDate)
                .append("rank", rank)
                .append("rankDifference", rankDifference)
                .append("appUser", appUser)
                .append("comments", comments)
                .toString();
    }
}
