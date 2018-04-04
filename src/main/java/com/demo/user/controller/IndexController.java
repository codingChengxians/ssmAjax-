package com.demo.user.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.user.pojo.Users;
import com.demo.user.service.UserService;

@Controller
@RequestMapping("/user")

public class IndexController {
	@Autowired
	private UserService userService;

	@ResponseBody
	@RequestMapping("/index2")
	public Users index( @RequestBody @RequestParam("username") String username, @RequestParam("password") String password,
			Model model, HttpSession session) {
		System.out.println(username+"----"+password);
		Users users = userService.selectByUsers(username, password);
		System.out.println("---------");
		if (users != null) {
			session.setAttribute("data", users);
			System.out.println(users);
			
			return users;
		}
		return null;

	}
}
