package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Form1To2Controller {
	
	/////////////////////////////////
	////// FORM 1
	
	@RequestMapping("show-form-1")
	public String showForm() {
		return "form-1";
	}
		
	@RequestMapping("process-form-1")
	public String processForm() {
		return "main-menu";
	}
	
	//////FORM 1
	/////////////////////////////////


	
	
	/////////////////////////////////
	////// FORM 2
	
	@RequestMapping("show-form-2")
	public String showForm2() {		
		return "form-2";
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
		
		return "main-menu";
	}
	
	////// FORM 2
	/////////////////////////////////
	
}
