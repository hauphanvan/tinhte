package com.packt.tinhte.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
	@RequestMapping
	public String welcome(Model model) {
		model.addAttribute("greeting", "Welcome to Hau Phan Van's Site");
		model.addAttribute("tagline", "This is the most awsome website in the world");
		
		return "welcome";
	}
}
