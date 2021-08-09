package com.preciosapp.home.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	
	@RequestMapping("/processFormModel")
	public String processFormModel(HttpServletRequest request, Model model) {
		String user = request.getParameter("user");
		user = user.toUpperCase();
		String result = "Hola "+user+"!";
		model.addAttribute("message", result);
		return "hello";
	}
}
