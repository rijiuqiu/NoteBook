package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomepageController {
	
	@GetMapping("/homepage")
	public String getHomepage() {
		return "homepage";
		
	}
	
	
	
}