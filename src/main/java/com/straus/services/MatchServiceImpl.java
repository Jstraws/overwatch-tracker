package com.straus.services;

import com.straus.beans.*;
import com.straus.repositories.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

import static java.time.temporal.ChronoUnit.DAYS;

@Service
public class MatchServiceImpl implements MatchService {

    private final MatchRepository matchRepository;
    private final SeasonService seasonService;

    @Autowired
    public MatchServiceImpl(MatchRepository matchRepository, SeasonService seasonService) {
        this.matchRepository = matchRepository;
        this.seasonService = seasonService;
    }

    /**
     * Method to get a specific match by their id
     *
     * @param matchId Id of the match to filter by
     * @return A match with the matching id
     */
    @Override
    public Match getMatchById(int matchId) {
        return matchRepository.findById(matchId).orElse(null);
    }

    /**
     * Method to get all matches in the system
     *
     * @return A list of all matches
     */
    @Override
    public List<Match> getAllMatches() {
        return matchRepository.findAll();
    }

    /**
     * Method to persist a match into the system
     *
     * @param match New match object to persist
     * @return The match object, with the auto-generated id
     */
    @Override
    public Match saveMatch(Match match) {
        return matchRepository.save(match);
    }

    /**
     * Method to remove a match from the system
     *
     * @param matchId Id of the match to delete
     */
    @Override
    public void deleteMatch(int matchId) {
        matchRepository.deleteById(matchId);
    }

    /**
     * Method to get all matches for a specific user
     *
     * @param userId User to filter by
     * @return A list of matches for the specified user
     */
    @Override
    public List<Match> getMatchByUserId(int userId) {
        return matchRepository.findAllByAppUserUserIdOrderByMatchDateDesc(userId);
    }

    /**
     * Method to get all matches for a specific result
     *
     * @param result Result to filter by (WIN, LOSS)
     * @param userId UserId to filter by
     * @return A list of matches for the specific result
     */
    @Override
    public List<Match> getMatchByResultAndUserIdInSeason(Result result, int userId) {
        return matchRepository.findAllByResultAndAppUserUserIdOrderByMatchDateDesc(result, userId);
    }

    /**
     * Method to get all matches played during a season
     *
     * @param season Season to filter by
     * @param userId UserId to filter by
     * @return A list of matches
     */
    @Override
    public List<Match> getMatchBySeasonAndUserId(Season season, int userId) {
        return matchRepository.findAllByMatchDateBetweenAndAppUserUserIdOrderByMatchDateDesc(season.getStartDate(), season.getEndDate(), userId);
    }

    /**
     * Method to get the most recent match a user played
     *
     * @param userId User id to filter by
     * @return A single match
     */
    @Override
    public Match getUsersMostRecentMatch(int userId) {
        Match tempMatch = matchRepository.findFirstByAppUserUserIdOrderByMatchDateDesc(userId);
        Season currentSeason = seasonService.getCurrentSeason();
        System.out.println(currentSeason);
        if (tempMatch != null) {
            if (tempMatch.getMatchDate().after(currentSeason.getStartDate()) && tempMatch.getMatchDate().before(currentSeason.getEndDate())) {
                return tempMatch;
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    /**
     * Method to get all matches in whi
     * ch a specific hero was played
     *
     * @param hero   Hero to filter by
     * @param userId UserId to filter by
     * @param season Season to filter by
     * @return A list of matches containing the specific hero
     */
    @Override
    public List<Match> getMatchByHeroAndUserIdInSeason(Hero hero, int userId, Season season) {
        return matchRepository.findAllByHeroesContainsAndAppUserUserIdAndMatchDateBetweenOrderByMatchDateDesc(hero, userId, season.getStartDate(), season.getEndDate());
    }

    /**
     * Method to get all matches played on a specific gameMap by a specific user
     *
     * @param gameMap GameMap to filter by
     * @param userId  UserId to filter by
     * @param season  Season to filter by
     * @return A list of matches
     */
    @Override
    public List<Match> getMatchByMapAndUserInSeason(GameMap gameMap, int userId, Season season) {
        return matchRepository.findAllByGameMapAndAppUserUserIdAndMatchDateBetweenOrderByMatchDateDesc(gameMap, userId, season.getStartDate(), season.getEndDate());
    }

    /**
     * Method to get all matches played on a specific MapType by a specific user
     *
     * @param mapType Type of map to filter by
     * @param userId  UserId to filter by
     * @param season  Season to filter by
     * @return A list of matches
     */
    @Override
    public List<Match> getMatchByMapTypeAndUserInSeason(MapType mapType, int userId, Season season) {
        return matchRepository.findAllByGameMapTypeAndAppUserUserIdAndMatchDateBetweenOrderByMatchDateDesc(mapType, userId, season.getStartDate(), season.getEndDate());
    }

    /**
     * Method to calculate statistics for a given set of matches
     *
     * @param matches List of matches to calculate stats off of
     * @param name    Name of statistic being caluclated
     * @return A Statistic with all of the relevant information
     */
    @Override
    public Statistic getMatchStatistics(List<Match> matches, String name) {
        Statistic statistic = new Statistic(name);
        for (Match m : matches) {
            if (m.getResult().equals(Result.WIN)) {
                statistic.addWin();
            } else if (m.getResult().equals(Result.LOSS)) {
                statistic.addLoss();
            } else {
                statistic.addDraw();
            }

            statistic.addSr(m.getRankDifference());
        }

        return statistic;
    }

    /**
     * Method to get user's activity for past 30 days
     *
     * @param userId The user id to filter by
     * @return A list of statistics for the past 30 days
     */
    @Override
    public List<ActivityStatistic> getActivityList(int userId) {
        Map<LocalDate, ActivityStatistic> dateMap = new TreeMap<>();
        LocalDate startDate = LocalDate.now().minus(Period.ofDays(30));
        for (int i = 0; i < 30; i++) {
            LocalDate date = startDate.plusDays(i);
            DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MMMM d, YYYY");
            dateMap.put(date, new ActivityStatistic(dateFormat.format(date), 0));
        }

        Timestamp startDateTimestamp = Timestamp.valueOf(startDate.atStartOfDay());
        Timestamp endDateTimestamp = Timestamp.valueOf(LocalDate.now().atStartOfDay());
        List<Match> matches = matchRepository.findAllByMatchDateBetweenAndAppUserUserIdOrderByMatchDateDesc(startDateTimestamp, endDateTimestamp, userId);

        for (Match match : matches) {
            LocalDate date = match.getMatchDate().toLocalDateTime().toLocalDate();
            dateMap.get(date).incrementValue();
        }

        return new ArrayList<>(dateMap.values());
    }

    /**
     * Method to fetch the graph data for matches by user and date
     *
     * @param userId       The user to filter by
     * @param startingDate The starting date to filter by
     * @param endingDate   The ending date to filter by
     * @return The list of statistics
     */
    @Override
    public List<ActivityStatistic> getRankActivityList(int userId, LocalDateTime startingDate, LocalDateTime endingDate) {
        Map<LocalDate, ActivityStatistic> dateMap = new TreeMap<>();
        long daysBetween = DAYS.between(startingDate, endingDate);
        for (int i = 0; i < daysBetween; i++) {
            LocalDate date = startingDate.toLocalDate().plusDays(i);
            DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MMMM d, YYYY");
            dateMap.put(date, new ActivityStatistic(dateFormat.format(date), 0));
        }

        Timestamp startDateTimestamp = Timestamp.valueOf(startingDate.toLocalDate().atStartOfDay());
        Timestamp endDateTimestamp = Timestamp.valueOf(endingDate.toLocalDate().atStartOfDay());
        List<Match> matches = matchRepository.findAllByMatchDateBetweenAndAppUserUserIdOrderByMatchDateDesc(startDateTimestamp, endDateTimestamp, userId);

        Map<LocalDate, List<Match>> groupedMatches = matches.stream().collect(Collectors.groupingBy(match -> match.getMatchDate().toLocalDateTime().toLocalDate()));

        int tempValue;
        if (!CollectionUtils.isEmpty(matches)) {
            tempValue = matches.get(0).getRank();
        } else {
            Match tempMatch = matchRepository.findFirstByAppUserUserIdOrderByMatchDateDesc(userId);
            if (tempMatch.getMatchDate().before(Timestamp.valueOf(startingDate.toLocalDate().atStartOfDay()))) {
                tempValue = 0;
            } else {
                tempValue = tempMatch.getRank();
            }
        }

        for (Map.Entry<LocalDate, ActivityStatistic> entry : dateMap.entrySet()) {
            if (groupedMatches.containsKey(entry.getKey())) {
                groupedMatches.get(entry.getKey()).sort((o1, o2) -> o2.getMatchDate().compareTo(o1.getMatchDate()));
                tempValue = groupedMatches.get(entry.getKey()).get(0).getRank();
                entry.getValue().setValue(tempValue);
            } else {
                entry.getValue().setValue(tempValue);
            }
        }

        /*for (Map.Entry<LocalDate, List<Match>> entry : groupedMatches.entrySet()) {
            ActivityStatistic tempStat = dateMap.get(entry.getKey());
            entry.getValue().sort((o1, o2) -> o2.getMatchDate().compareTo(o1.getMatchDate()));
            if (tempStat.getValue() == 0) {
                tempStat.setValue(entry.getValue().get(0).getRank());
            } else {
                tempStat.setValue(tempStat.getValue() + entry.getValue().get(0).getRank());
            }
        }*/

        return new ArrayList<>(dateMap.values());
    }
}
