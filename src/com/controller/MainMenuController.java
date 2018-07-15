package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainMenuController {

	@RequestMapping("/")
	public String showPage() {
		return "main-menu";
	}

	@RequestMapping("/spring-mvc-demo-1")
	public String showPage2() {
		return "main-menu";
	}
}


