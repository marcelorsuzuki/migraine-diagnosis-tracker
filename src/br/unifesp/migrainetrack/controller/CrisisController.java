package br.unifesp.migrainetrack.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.unifesp.migrainetrack.model.Crisis;

@Controller
public class CrisisController {
	
	@RequestMapping("/crisis")
	public String show(Crisis crisis) {
		return "crisis";
	}

	
}
