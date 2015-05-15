package com.scrimdog.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.scrimdog.bean.Matches;
import com.scrimdog.bean.Team;

public class MatchesRowMapper implements RowMapper<Matches> {

	@Override
	public Matches mapRow(ResultSet rs, int r) throws SQLException {
		Matches m = new Matches();
		Team t = new Team();

		m.setMatchId(rs.getInt("matches.match_id"));
		t.setHomeTeamName(rs.getString("home_team"));
		t.setAwayTeamName(rs.getString("away_team"));
		m.setHomeGoals(rs.getInt("matches.home_goals"));
		m.setAwayGoals(rs.getInt("matches.away_goals"));

		m.setTeam(t);

		return m;
	}

}
