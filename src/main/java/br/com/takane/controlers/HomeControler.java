package br.com.takane.controlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeControler {
	
	@GetMapping("")
	public String home() {
		return "movimentar/homeTakane";
	}
	
	@GetMapping("/login")
	public String login() {
		return "movimentar/homeLogin";
	}
	
	

}
