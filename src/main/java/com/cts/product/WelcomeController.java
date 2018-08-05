package com.cts.product;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@RequestMapping("/")
	public String welcome(ModelMap modal) {
		modal.addAttribute("title", "NextGen AI Orchestration Layer");
        modal.addAttribute("message", "Congratulation! Application is running successfully.");
		return "welcome";
	}
}