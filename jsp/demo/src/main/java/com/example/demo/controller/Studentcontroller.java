package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Studentcontroller {
	
	
	@GetMapping("/")
	public String index()
	{
		return "index";
	}
	
//	@GetMapping
//	public ModelAndView getstudentlist()
//	{
//		ModelAndView mv=new ModelAndView();
//	}

}