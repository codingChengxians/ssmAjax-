package com.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class LController {
	@RequestMapping("/")
	public String login() {
		return "/register";
		
	}
	@RequestMapping("/remove")
	public String remove(HttpSession session) {
		session.removeAttribute("user");
		
		return "/login";
		
	}
}
