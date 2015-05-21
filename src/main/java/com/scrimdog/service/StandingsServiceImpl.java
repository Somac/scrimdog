package com.scrimdog.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.scrimdog.bean.Team;
import com.scrimdog.dao.StandingsDAO;

@Service
public class StandingsServiceImpl implements StandingsService {

	@Inject
	private StandingsDAO sDao;
	
	@Override
	public List<Team> getAll() {
		return sDao.getAll();
	}

}
