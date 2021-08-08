package com.preciosapp.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller	
public class HelloController {

	@RequestMapping("/showFrom")
	public String showForm() {
		return "helloForm";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "hello";
	}
}
