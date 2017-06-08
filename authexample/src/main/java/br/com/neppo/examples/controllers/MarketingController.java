package br.com.neppo.examples.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MarketingController {
	
	private static final Logger LOGGER = Logger.getLogger(MarketingController.class);
	
	@RequestMapping("/marketing")
	public String marketing(HttpServletRequest req, HttpServletResponse resp) {
		
		return "Ola do marketing";	
	}
	
	@RequestMapping("/marketing2")
	public String marketing2(HttpServletRequest req, HttpServletResponse resp) {
		
		return "Ola do marketing 2";	
	}
	
	@Secured({"ROLE_MARKETING"})
	@RequestMapping("/marketing3")
	public String marketing3(HttpServletRequest req, HttpServletResponse resp) {
		
		return "Ola do marketing 3";	
	}

}