package com.scrimdog.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scrimdog.bean.Matches;
import com.scrimdog.service.MatchesService;
 
@Controller
public class MainController {
	
	@Inject
	MatchesService mService;
 
	@RequestMapping ("/")
	public String mainPage () {
		return "index";
	}
	
	@RequestMapping ("/info")
	public String infoPage () {
		return "info";
	}
	
	@RequestMapping (value="/matches", method=RequestMethod.GET)
	public String matchPage (Model model, @ModelAttribute("matches") Matches matches) {
		
		model.addAttribute("matches", mService.getAll());
		
		return "matches";
	}
	
	@RequestMapping ("/standings")
	public String standingsPage () {
		return "standings";
	}
}
