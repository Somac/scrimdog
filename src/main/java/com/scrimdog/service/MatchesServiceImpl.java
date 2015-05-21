package com.scrimdog.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.scrimdog.bean.Matches;
import com.scrimdog.dao.MatchesDAO;

@Service
public class MatchesServiceImpl implements MatchesService{
	
	@Inject
	private MatchesDAO dao;

	@Override
	public List<Matches> getAll() {
		return dao.getAll();
	}
	public void setScore(String homeScore, String awayScore, int matchId) {
		dao.setScore(homeScore, awayScore, matchId);

	}

}
