package com.scrimdog.dao;

import java.util.List;

import javax.inject.Inject;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.scrimdog.bean.Team;

@Repository
public class StandingsDAOSpringJdbcImpl implements StandingsDAO {

	@Inject
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public List<Team> getAll() {

		String sql = "SELECT team_name, wins, ties, losses FROM team";

		RowMapper<Team> mapper = new StandingsRowMapper();

		return jdbcTemplate.query(sql, mapper);
	}
}
