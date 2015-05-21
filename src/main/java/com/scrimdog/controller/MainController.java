package com.scrimdog.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.scrimdog.bean.Matches;
import com.scrimdog.bean.Team;
import com.scrimdog.service.MatchesService;
import com.scrimdog.service.StandingsService;

@Controller
public class MainController {

	@Inject
	MatchesService mService;

	@Inject
	StandingsService sService;
	
	@RequestMapping("/")
	public String mainPage() {
		return "index";
	}

	@RequestMapping("/info")
	public String infoPage() {
		return "info";
	}

	@RequestMapping(value = "/matches", method = RequestMethod.GET)
	public String matchPage(Model model, @ModelAttribute("matches") Matches matches) {

		model.addAttribute("matches", mService.getAll());

		return "matches";
	}

	@RequestMapping("/standings")
	public String standingsPage(Model model, @ModelAttribute("team") Team team) {
		
		model.addAttribute("team", sService.getAll());
		
		return "standings";
	}

	@RequestMapping(value = "/setScore-{match_id}-{away_team}-{home_team}", method = { RequestMethod.GET, RequestMethod.POST })
	public String setScore(@PathVariable int match_id, @PathVariable int away_team, @PathVariable int home_team, @ModelAttribute("matches") Matches matches, BindingResult result, Model model,
			RedirectAttributes redirectAttrs) {

		if (result.hasErrors()) {
			return "index";
		}
		
		mService.setScore(matches.getHomeScore(), matches.getAwayScore(), match_id, home_team, away_team, matches.isTie());
		
		String url = "/matches";
		return "redirect:" + url;
	}
}
