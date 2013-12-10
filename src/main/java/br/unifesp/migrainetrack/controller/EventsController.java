package br.unifesp.migrainetrack.controller;
import javax.faces.bean.ManagedBean;

import br.unifesp.migrainetrack.model.Crisis;

@ManagedBean
public class EventsController {
	

	public String show(Crisis crisis) {
		return "events"; 
	}

	
}
