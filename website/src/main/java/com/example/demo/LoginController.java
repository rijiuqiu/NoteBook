package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@PostMapping("/login")
	public ModelAndView login(@RequestParam("username") String username, @RequestParam("password") String password,
			ModelAndView mv) {

		mv.addObject("username", username);
		if (username.equals("admin") && password.equals("123456")) {
			mv.setViewName("homepage2");

		} else {
			mv.setViewName("fail");
		}
		return mv;
	}

}
