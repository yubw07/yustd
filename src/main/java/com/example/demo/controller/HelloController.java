package com.example.demo.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
public class HelloController {

	@GetMapping("/")
	public String greeting1(Model model) {
		
		model.addAttribute("today", new Date());
		
		return "hello";
	}
	
	@PostMapping("/po")
	public String greeting2(Model model) {
		
		model.addAttribute("today", new Date());
		
		return "hello";
	}
	
	@PutMapping("/pu")
	public String greeting3(Model model) {
		
		model.addAttribute("today", new Date());
		
		return "hello";
	}

	@DeleteMapping("/de")
	public String greeting4(Model model) {
		
		model.addAttribute("today", new Date());
		
		return "hello";
	}
}
