package com.scrimdog.bean;

public class Matches {

	private int matchId;
	private int homeTeam;
	private int awayTeam;
	private int homeGoals;
	private int awayGoals;

	public Matches() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Matches(int matchId, int homeTeam, int awayTeam, int homeGoals, int awayGoals) {
		super();
		this.matchId = matchId;
		this.homeTeam = homeTeam;
		this.awayTeam = awayTeam;
		this.homeGoals = homeGoals;
		this.awayGoals = awayGoals;
	}

	public int getMatchId() {
		return matchId;
	}

	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}

	public int getHomeTeam() {
		return homeTeam;
	}

	public void setHomeTeam(int homeTeam) {
		this.homeTeam = homeTeam;
	}

	public int getAwayTeam() {
		return awayTeam;
	}

	public void setAwayTeam(int awayTeam) {
		this.awayTeam = awayTeam;
	}

	public int getHomeGoals() {
		return homeGoals;
	}

	public void setHomeGoals(int homeGoals) {
		this.homeGoals = homeGoals;
	}

	public int getAwayGoals() {
		return awayGoals;
	}

	public void setAwayGoals(int awayGoals) {
		this.awayGoals = awayGoals;
	}

	@Override
	public String toString() {
		return "Matches [matchId=" + matchId + ", homeTeam=" + homeTeam + ", awayTeam=" + awayTeam + ", homeGoals="
				+ homeGoals + ", awayGoals=" + awayGoals + "]";
	}

}
