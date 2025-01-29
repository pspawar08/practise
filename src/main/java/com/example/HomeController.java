package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dao.custDao;
import com.model.customer;

@Controller
public class HomeController {

	custDao cd= new custDao();
	
	@RequestMapping("/")
	public String get()
	{
		return "index";
	}
	@RequestMapping("/register")
	public String register()
	{
		return "register";
	}
	@RequestMapping("/saveinfo")
	public String saveinfo(@ModelAttribute customer cc)
	{
		
		cd.savinfo(cc);
		return "dashboard";
	}
	
}
