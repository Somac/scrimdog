package com.scrimdog.dao;

import java.util.List;

import com.scrimdog.bean.Matches;

public interface MatchesDAO {
	
	public abstract List<Matches> getAll();
	public abstract void setScore(String homeScore, String awayScore, int matchId);

}
