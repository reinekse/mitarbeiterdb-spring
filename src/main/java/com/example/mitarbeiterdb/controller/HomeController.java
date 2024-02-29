package com.example.mitarbeiterdb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping("/home")
	public String home() {
		return "index";
	}

}
