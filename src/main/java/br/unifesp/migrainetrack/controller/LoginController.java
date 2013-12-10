package br.unifesp.migrainetrack.controller;
import javax.faces.bean.ManagedBean;

import br.unifesp.migrainetrack.dao.PatientDao;
import br.unifesp.migrainetrack.model.Patient;

@ManagedBean
public class LoginController {
	
	public String show(Patient patient) {
		return "login";
	}

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
