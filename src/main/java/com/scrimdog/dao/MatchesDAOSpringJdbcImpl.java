package com.scrimdog.dao;

import java.util.List;

import javax.inject.Inject;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.scrimdog.bean.Matches;

@Repository
public class MatchesDAOSpringJdbcImpl implements MatchesDAO {

	@Inject
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Matches> getAll() {

		String sql = "SELECT matches.match_id, team_h.team_name, "
				+ "team_a.team_name, matches.home_score, matches.away_score " + "FROM matches "
				+ "LEFT JOIN team AS team_h ON matches.home_team = team_h.team_id "
				+ "LEFT JOIN team AS team_a ON matches.away_team = team_a.team_id";

		RowMapper<Matches> mapper = new MatchesRowMapper();

		return jdbcTemplate.query(sql, mapper);
	}

	public void setScore(String homeScore, String awayScore, int matchId) {

		String sql = "UPDATE matches SET home_score=?, away_score=? WHERE match_id = ?";

		Object[] params = new Object[] { homeScore, awayScore, matchId };

		try {
			jdbcTemplate.update(sql, params);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			return;
		}

	}
}
