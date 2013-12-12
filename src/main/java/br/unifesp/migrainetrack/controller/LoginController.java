package br.unifesp.migrainetrack.controller;
import javax.faces.bean.ManagedBean;

import br.unifesp.migrainetrack.dao.PatientDao;
import br.unifesp.migrainetrack.model.Patient;

@ManagedBean(name="loginController")
public class LoginController {
	
	private String username;
	private String password;
	
	public String show(Patient patient) {
		return "login";
	}

	public String authentic() {
		PatientDao dao = new PatientDao();
		Patient patient = dao.authentic(username, password);
		
		if (patient != null) {
			return "dailyinfo";
		}
		else {
			return "login";
		}
	
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
