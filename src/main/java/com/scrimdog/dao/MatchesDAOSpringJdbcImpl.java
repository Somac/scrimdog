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
				+ "team_a.team_name, matches.home_score, matches.away_score, "
				+ "team_h.team_id, team_a.team_id "
				+ "FROM matches "
				+ "LEFT JOIN team AS team_h ON matches.home_team = team_h.team_id "
				+ "LEFT JOIN team AS team_a ON matches.away_team = team_a.team_id";

		RowMapper<Matches> mapper = new MatchesRowMapper();

		return jdbcTemplate.query(sql, mapper);
	}

	public void setScore(String homeScore, String awayScore, int matchId, int hTeamId, int aTeamId, boolean tie) {

		String sql = "UPDATE matches SET home_score=?, away_score=? WHERE match_id = ?";

		Object[] params = new Object[] { homeScore, awayScore, matchId };
		
		int homeScoreInt = Integer.parseInt(homeScore);
		int awayScoreInt = Integer.parseInt(awayScore);
		
		String homeTeamSql = "";
		String awayTeamSql = "";
		
		if (homeScoreInt > awayScoreInt) {
			if (tie) {
				homeTeamSql = "UPDATE team SET wins = wins + 1 WHERE team_id = ?";
				awayTeamSql = "UPDATE team SET ties = ties + 1 WHERE team_id = ?";
			} else {
				homeTeamSql = "UPDATE team SET wins = wins + 1 WHERE team_id = ?";
				awayTeamSql = "UPDATE team SET losses = losses + 1 WHERE team_id = ?";
			}
		} else if (awayScoreInt > homeScoreInt) {
			if (tie) {
				homeTeamSql = "UPDATE team SET ties = ties + 1 WHERE team_id = ?";
				awayTeamSql = "UPDATE team SET wins = wins + 1 WHERE team_id = ?";
			} else {
				homeTeamSql = "UPDATE team SET losses = losses + 1 WHERE team_id = ?";
				awayTeamSql = "UPDATE team SET wins = wins + 1 WHERE team_id = ?";
			}
		}
		
		Object[] params2 = new Object[] { hTeamId };
		Object[] params3 = new Object[] { aTeamId };

		try {
			jdbcTemplate.update(sql, params);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			return;
		}
		
		try {
			jdbcTemplate.update(homeTeamSql, params2);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			return;
		}
		
		try {
			jdbcTemplate.update(awayTeamSql, params3);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			return;
		}
		

	}
}
