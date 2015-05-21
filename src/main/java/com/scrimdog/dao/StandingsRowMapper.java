package com.scrimdog.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.scrimdog.bean.Team;

public class StandingsRowMapper implements RowMapper<Team> {

	@Override
	public Team mapRow(ResultSet rs, int r) throws SQLException {
		Team t = new Team();
		
		t.setTeamName(rs.getString("team_name"));
		t.setWins(rs.getInt("wins"));
		t.setLosses(rs.getInt("losses"));
		t.setTies(rs.getInt("ties"));

		return t;
	}

}
