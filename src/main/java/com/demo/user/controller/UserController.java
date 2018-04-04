package com.demo.user.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.user.pojo.Users;
import com.demo.user.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/index")
	public String index(@RequestParam("username") String username, @RequestParam("password") String password,
			Model model, HttpSession session) {
		Users users = userService.selectByUsers(username, password);
		if (users != null) {
			session.setAttribute("user", users);
			System.out.println("---------" + users);
			
			return "login2";
		}
		return "login";

	}
	@RequestMapping(value = "/indexx")
	public String indexx() {
		
		return "index";
		
	}

	@RequestMapping("/listUser")
	
	public String list(Model model) {
		List<Users> list = userService.listAll();
		System.out.println(list);
		model.addAttribute("lisst", list);
		return "login2";
		
	}
	@RequestMapping("/toAddUser")
	public String toAddUaser() {
		return "/toadd";
		
	}
	@RequestMapping("/add")
	public String add(Users record) {
		int insert = userService.insert(record);
		if(insert==1) {
			return "login2";
		}
		return null;
		
	}

}
