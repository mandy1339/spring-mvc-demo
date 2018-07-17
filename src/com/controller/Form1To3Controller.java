package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("forms1-3")
@Controller
public class Form1To3Controller {
	
	/////////////////////////////////
	////// FORM 1
	
	@RequestMapping("show-form-1")
	public String showForm() {
		return "/form-1";
	}
		
	@RequestMapping("process-form-1")
	public String processForm() {
		return "redirect:/";
	}
	
	//////FORM 1
	/////////////////////////////////


	
	
	/////////////////////////////////
	////// FORM 2
	
	@RequestMapping("show-form-2")
	public String showForm2() {		
		return "/form-2";
	}
	
	@RequestMapping("process-form-2")
	public String processForm2(HttpServletRequest request, Model model) {
		// read the request parameter from the HTML form
		String firstName = request.getParameter("firstName");
		
		// convert the data to all caps
		firstName = firstName.toUpperCase();
		
		// create the message
		String result = "Yo! " + firstName;
		
		// add message to the model
		model.addAttribute("message", result);
		
		return "redirect:/";
	}
	
	////// FORM 2
	/////////////////////////////////
	
	
	
	/////////////////////////////////
	////// FORM 3
	
	@RequestMapping("show-form-3")
	public String showForm3() {		
		return "form-3";
	}
	
	@RequestMapping("process-form-3")
	public String processForm3(
			@RequestParam("firstName") String firstName,
			Model model) {

		// convert the data to all caps
		firstName = firstName.toLowerCase();
		
		// create the message
		String result = "Custom message from form 3 " + firstName;
		
		// add message to the model
		model.addAttribute("message", result);
		
		return "redirect:/";
	}
	////// FORM 2
	/////////////////////////////////
}
