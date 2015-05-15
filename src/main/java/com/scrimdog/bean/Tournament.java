package com.scrimdog.bean;

public class Tournament {

	private int tournamentId;
	private String tournamentName;
	private String tournamentDescription;

	public Tournament() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tournament(int tournamentId, String tournamentName, String tournamentDescription) {
		super();
		this.tournamentId = tournamentId;
		this.tournamentName = tournamentName;
		this.tournamentDescription = tournamentDescription;
	}

	public int getTournamentId() {
		return tournamentId;
	}

	public void setTournamentId(int tournamentId) {
		this.tournamentId = tournamentId;
	}

	public String getTournamentName() {
		return tournamentName;
	}

	public void setTournamentName(String tournamentName) {
		this.tournamentName = tournamentName;
	}

	public String getTournamentDescription() {
		return tournamentDescription;
	}

	public void setTournamentDescription(String tournamentDescription) {
		this.tournamentDescription = tournamentDescription;
	}

	@Override
	public String toString() {
		return "Tournament [tournamentId=" + tournamentId + ", tournamentName=" + tournamentName
				+ ", tournamentDescription=" + tournamentDescription + "]";
	}

}
