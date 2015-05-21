package com.scrimdog.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.scrimdog.bean.Matches;

public class MatchesRowMapper implements RowMapper<Matches> {

	@Override
	public Matches mapRow(ResultSet rs, int r) throws SQLException {
		Matches m = new Matches();

		m.setMatchId(rs.getInt("matches.match_id"));
		m.setHomeTeamName(rs.getString("team_h.team_name"));
		m.setAwayTeamName(rs.getString("team_a.team_name"));
		m.setHomeTeam(rs.getInt("team_h.team_id"));
		m.setAwayTeam(rs.getInt("team_a.team_id"));
		m.setHomeScore(rs.getString("matches.home_score"));
		m.setAwayScore(rs.getString("matches.away_score"));

		return m;
	}

}
