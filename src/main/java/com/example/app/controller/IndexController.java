package com.example.app.controller;

import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.app.service.UserService;

@Controller
//@RequestMapping("/")
public class IndexController {
	@Autowired
	private UserService userService;

	@RequestMapping("/")
	public String index(Model model) {
		return "index";
	}
}
