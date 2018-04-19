package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.pojo.User;
@Controller
@RequestMapping("ftl")
public class FreemarkerContoller {
	@Autowired
	private User user;
	@RequestMapping("/index")
	public String index(ModelMap map) {
		map.addAttribute("user", user);
		return "freemarker/index";
	}
	@RequestMapping("/index2")
	public String index2(ModelMap map) {
		User user = new User();
		user.setAge("12");
		user.setUsername("tom");
		map.addAttribute("user", "666");
		return "freemarker/index2";
	}
}
