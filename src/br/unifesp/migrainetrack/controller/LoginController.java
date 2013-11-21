package br.unifesp.migrainetrack.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.unifesp.migrainetrack.dao.PatientDao;
import br.unifesp.migrainetrack.model.Patient;

@Controller
public class LoginController {
	
	@RequestMapping("/login")
	public String show(Patient patient) {
		return "login";
	}

	@RequestMapping("/login-authentic")
	public String authentic(Patient patient) {
		PatientDao dao = new PatientDao();
		if (dao.authentic(patient)) {
			return "dailyinfo";
		}
		else {
			return "login";
		}
	
	}
	
}
