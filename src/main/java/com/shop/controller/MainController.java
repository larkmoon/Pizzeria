package com.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping("/")
	public String main(Model m) {
		m.addAttribute("center", "home");
		return "main";
	};
	
	@RequestMapping("/menu")
	public String menu(Model m) {
		m.addAttribute("center", "menu");
		return "main";
	};
	
	@RequestMapping("/reserve")
	public String reserve(Model m) {
		m.addAttribute("center", "reserve/reserve");
		return "main";
	};
	
	@RequestMapping("/reserveimpl")
	public String reserveimpl(Model m, String date, String time, double psize, String name, String request) {
		m.addAttribute("center", "reserve/reservecompl");
		return "main";
	};
}
