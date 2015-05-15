package com.scrimdog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
public class MainController {
 
	@RequestMapping ("/")
	public String mainPage () {
		return "index";
	}
	
	@RequestMapping ("/info")
	public String infoPage () {
		return "info";
	}
	
	@RequestMapping ("/matches")
	public String matchPage () {
		return "matches";
	}
	
	@RequestMapping ("/standings")
	public String standingsPage () {
		return "standings";
	}
}
