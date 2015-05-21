package com.scrimdog.bean;

public class Matches {

	private int matchId;
	private int homeTeam;
	private int awayTeam;
	private String homeScore;
	private String awayScore;
	private String homeTeamName;
	private String awayTeamName;
	private boolean tie;

	public Matches() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Matches(int matchId, int homeTeam, int awayTeam, String homeScore, String awayScore, String homeTeamName,
			String awayTeamName, boolean tie) {
		super();
		this.matchId = matchId;
		this.homeTeam = homeTeam;
		this.awayTeam = awayTeam;
		this.homeScore = homeScore;
		this.awayScore = awayScore;
		this.homeTeamName = homeTeamName;
		this.awayTeamName = awayTeamName;
		this.tie = tie;
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

	public String getHomeScore() {
		return homeScore;
	}

	public void setHomeScore(String homeScore) {
		this.homeScore = homeScore;
	}

	public String getAwayScore() {
		return awayScore;
	}

	public void setAwayScore(String awayScore) {
		this.awayScore = awayScore;
	}

	public String getHomeTeamName() {
		return homeTeamName;
	}

	public void setHomeTeamName(String homeTeamName) {
		this.homeTeamName = homeTeamName;
	}

	public String getAwayTeamName() {
		return awayTeamName;
	}

	public void setAwayTeamName(String awayTeamName) {
		this.awayTeamName = awayTeamName;
	}
	
	public boolean isTie() {
		return tie;
	}

	public void setTie(boolean tie) {
		this.tie = tie;
	}

	@Override
	public String toString() {
		return "Matches [matchId=" + matchId + ", homeTeam=" + homeTeam
				+ ", awayTeam=" + awayTeam + ", homeScore=" + homeScore
				+ ", awayScore=" + awayScore + ", homeTeamName=" + homeTeamName
				+ ", awayTeamName=" + awayTeamName + ", tie=" + tie + "]";
	}

	
	

}
