package br.unifesp.migrainetrack.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.unifesp.migrainetrack.model.Crisis;

@Controller
public class EventsController {
	
	@RequestMapping("/events")
	public String show(Crisis crisis) {
		return "events"; 
	}

	
}
