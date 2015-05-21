package com.scrimdog.bean;

public class Team {

	private int teamId;
	private String teamName;
	private int wins;
	private int ties;
	private int losses;
	private int tournamentId;

	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Team(int teamId, String teamName, int wins, int ties, int losses, int tournamentId) {
		super();
		this.teamId = teamId;
		this.teamName = teamName;
		this.wins = wins;
		this.ties = ties;
		this.losses = losses;
		this.tournamentId = tournamentId;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public int getTies() {
		return ties;
	}

	public void setTies(int ties) {
		this.ties = ties;
	}

	public int getLosses() {
		return losses;
	}

	public void setLosses(int losses) {
		this.losses = losses;
	}

	public int getTournamentId() {
		return tournamentId;
	}

	public void setTournamentId(int tournamentId) {
		this.tournamentId = tournamentId;
	}

	@Override
	public String toString() {
		return "Team [teamId=" + teamId + ", teamName=" + teamName + ", wins="
				+ wins + ", ties=" + ties + ", losses=" + losses
				+ ", tournamentId=" + tournamentId + "]";
	}

}
