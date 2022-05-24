package com.shop.controller;

import java.util.Random;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	@RequestMapping("/")
	public String main(Model m) {
		m.addAttribute("center", "home/home");
		m.addAttribute("left", "home/homeleft");
		return "main";
	};

	@RequestMapping("/getchart")
	@ResponseBody
	public Object getchart() {
		JSONArray ja = new JSONArray();
		String[] ct = {"Pizza", "Music", "Customer Service", "Pasta", "Atmosphere"};
		String f = "false";

		for(int i=0; i<5; i++) {
			JSONObject jo = new JSONObject();
			
			jo.put("name", ct[i]);
			Random r = new Random();
			int p = r.nextInt(50)+1;
			jo.put("y", p);
			jo.put("selected", f);
			ja.add(jo);
		}
		return ja;
	}
	
	
	@RequestMapping("/menu")
	public String menu(Model m) {
		m.addAttribute("center", "menu/menu");
		m.addAttribute("left", "menu/menuleft");
		return "main";
	};
	
	@RequestMapping("/reserve")
	public String reserve(Model m) {
		m.addAttribute("center", "reserve/reserve");
		m.addAttribute("left", "reserve/reserveleft");
		return "main";
	};
		
	
	@RequestMapping("/reserveimpl")
	public String reserveimpl(Model m, String date, String time, Integer psize, String name, String request) {
		m.addAttribute("rdate", date);
		m.addAttribute("rtime", time);
		m.addAttribute("rpsize", psize);
		m.addAttribute("rname", name);
		m.addAttribute("rrequest", request);
		m.addAttribute("center", "reserve/reservecompl");
		m.addAttribute("left", "reserve/reserveleft");
		return "main";
	};
	
	
	@RequestMapping("/contact")
	public String contact(Model m) {
		m.addAttribute("center", "contact/contact");
		m.addAttribute("left", "contact/contactleft");
		return "main";
	};
	

}
