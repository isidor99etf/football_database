package model;

import java.sql.Timestamp;

public class Match {

    private int id;
    private int leagueId;
    private int seasonId;
    private int homeClubId;
    private int awayClubId;
    private Timestamp datetime;
    private int matchday;
    private String homeClub;
    private int homeClubGoals;
    private String awayClub;
    private int awayClubGoals;
    private String league;
    private String season;

    public Match() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(int leagueId) {
        this.leagueId = leagueId;
    }

    public int getSeasonId() {
        return seasonId;
    }

    public void setSeasonId(int seasonId) {
        this.seasonId = seasonId;
    }

    public int getHomeClubId() {
        return homeClubId;
    }

    public void setHomeClubId(int homeClubId) {
        this.homeClubId = homeClubId;
    }

    public int getAwayClubId() {
        return awayClubId;
    }

    public void setAwayClubId(int awayClubId) {
        this.awayClubId = awayClubId;
    }

    public Timestamp getDatetime() {
        return datetime;
    }

    public void setDatetime(Timestamp datetime) {
        this.datetime = datetime;
    }

    public int getMatchday() {
        return matchday;
    }

    public void setMatchday(int matchday) {
        this.matchday = matchday;
    }

    public String getHomeClub() {
        return homeClub;
    }

    public void setHomeClub(String homeClub) {
        this.homeClub = homeClub;
    }

    public int getHomeClubGoals() { return homeClubGoals; }

    public void setHomeClubGoals(int homeClubGoals) { this.homeClubGoals = homeClubGoals; }

    public String getAwayClub() { return awayClub; }

    public void setAwayClub(String awayClub) { this.awayClub = awayClub; }

    public int getAwayClubGoals() { return awayClubGoals; }

    public void setAwayClubGoals(int awayClubGoals) { this.awayClubGoals = awayClubGoals; }

    public String getLeague() { return league; }

    public void setLeague(String league) { this.league = league; }

    public String getSeason() { return season; }

    public void setSeason(String season) { this.season = season; }
}
