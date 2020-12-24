package com.shahzeb.secure;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		return mv;
	}
	@RequestMapping("/login")
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("login");
		return mv;
	}
	@RequestMapping("/logout-success")
	public ModelAndView logout() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("logout");
		return mv;
	}
	@RequestMapping("/user")
	@ResponseBody
	public Principal users(Principal pr) {
		return pr;
	}
}
