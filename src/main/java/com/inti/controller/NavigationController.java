package com.inti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class NavigationController {
	@RequestMapping(value = "page1URL", method = RequestMethod.GET)
	public String page1(ModelMap model) {
		model.addAttribute("msg", "Je suis dans la page 1!!!");
		return "page1";
	}

	@RequestMapping(value = "page2URL", method = RequestMethod.GET)
	public String page2(ModelMap model) {
		model.addAttribute("msg", "Je suis dans la page 2!!!");
		return "page2";
	}
	@RequestMapping(value = "redirect", method = RequestMethod.GET)
	public String redirection() {
		return "redirect:page2URL";
	}
}
