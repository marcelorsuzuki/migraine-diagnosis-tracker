package br.unifesp.migrainetrack.controller;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.unifesp.migrainetrack.dao.PatientDao;
import br.unifesp.migrainetrack.model.Patient;
import br.unifesp.migrainetrack.util.JpaUtil;

/**
 * This class is used how ManagedBean to Login view
 * 
 * @author Lineu Lima
 * @author Marcelo Suzuki
 *
 */
@ManagedBean(name="loginController")
@SessionScoped
public class LoginController {
	
	private Patient currentUser;
	private String username;
	private String password;
	
	
	/**
	 * Constructor 
	 */
	public LoginController() {
		this .currentUser = null;
	}
	
	
	/**
	 * Method to execute login in the system and redirect to the next view.
	 * 
	 * @return The name to the next view.
	 */
	public String authentic() {
		
		
		PatientDao dao = new PatientDao(new JpaUtil().getEntityManager());
		currentUser = dao.authentic(username, password);
		
		
		if (currentUser != null) {
			return "dailyinfo";
		}
		else {
			return "login";
		}
	}
	

	/**
	 * Check if the user is logged in the system.
	 * 
	 * @return true: User is logged <br />
	 *          false: user is not logged
	 * 		   
	 */
	public boolean isLogged() {
		return (currentUser != null);
	}
	
	
	// Getters and Setters
	
	public Patient getCurrentUser() {
		return currentUser;
	}

	public void setPatient(Patient currentUser) {
		this.currentUser = currentUser;
	}

	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
}
