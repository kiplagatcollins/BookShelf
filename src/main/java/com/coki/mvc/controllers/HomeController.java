package com.coki.mvc.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
	public String home() {
		return "index";
	}
	

}