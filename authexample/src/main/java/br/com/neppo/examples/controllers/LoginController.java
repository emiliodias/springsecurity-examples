package br.com.neppo.examples.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class LoginController {
	
	private static final Logger LOGGER = Logger.getLogger(LoginController.class);
	
	@RequestMapping("/login")
	public ModelAndView loginForm(HttpServletRequest req, HttpServletResponse resp) {
		
		return new ModelAndView("login");	
	}

}