package com.rtj.dealer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import com.rtj.dealer.service.HomeService;

@Controller
@RequestMapping({ "/common", "/" })
@SessionAttributes("roles")
public class Home {

	@Autowired
	private HomeService homeService;


	@Autowired
	MessageSource messageSource;

	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
	public String homePage(ModelMap model) {
		model.addAttribute("greeting", "Hi, Welcome to mysite. ");
		return "Home";
	}

	

	@RequestMapping(value = { "/loginpage" }, method = RequestMethod.GET)
	public String loginpage(ModelMap model) {
		model.addAttribute("greeting", "Hi, Welcome to mysite. ");
		return "Login";
	}

	
}
