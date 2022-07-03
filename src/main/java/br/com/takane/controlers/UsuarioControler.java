package br.com.takane.controlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UsuarioControler {

	@GetMapping("")
	public String user() {
		return "";
	}
}
