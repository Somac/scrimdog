package com.scrimdog.dao;

import java.util.List;

import com.scrimdog.bean.Team;


public interface StandingsDAO {
	
	public abstract List<Team> getAll();
}
