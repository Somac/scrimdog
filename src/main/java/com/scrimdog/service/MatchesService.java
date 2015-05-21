package com.scrimdog.service;

import java.util.List;

import com.scrimdog.bean.Matches;

public interface MatchesService {
	
	public abstract List<Matches> getAll();
	public abstract void setScore(String homeScore, String awayScore, int matchId, int hTeamId, int aTeamId, boolean tie);

}
