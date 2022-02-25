package com.inti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class HelloController {
	// Les verbes http : (GET: afficher, Post : ajouter, PUT : MAJ et Delete)
	@RequestMapping(method=RequestMethod.GET) // URL : http://localhost:9090/firstSpringMVCProject/hello
	public String helloMethod(ModelMap model) {
		
		model.addAttribute("msg","Hello world");
		return "bonjour"; // le nom de la page web avec l'extention .jsp
	}
}
