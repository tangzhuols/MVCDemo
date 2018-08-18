package com.xq.mvc.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xq.mvc.pojo.User;
import com.xq.mvc.servlce.UserService;

@Controller
@RequestMapping("mvc")
public class MVCAction {
	@Resource
	private UserService userService;

	@RequestMapping("hello")
	public String hello(Model model) {
		
		List<User> users= getUsers();
		model.addAttribute("hello", users);

		return "/WEB-INF/js/index";
	}

	public List<User> getUsers(){
		return userService.getUsers();
		
	}
}
