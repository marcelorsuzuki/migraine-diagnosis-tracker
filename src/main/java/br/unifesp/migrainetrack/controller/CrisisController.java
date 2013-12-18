package br.unifesp.migrainetrack.controller;
import java.util.Calendar;
import java.util.List;

import javax.faces.bean.ManagedBean;

import br.unifesp.migrainetrack.dao.CrisisDao;
import br.unifesp.migrainetrack.dao.Dao;
import br.unifesp.migrainetrack.model.Crisis;
import br.unifesp.migrainetrack.model.Patient;
import br.unifesp.migrainetrack.util.FacesUtil;
import br.unifesp.migrainetrack.util.JpaUtil;

@ManagedBean(name="crisisC")
public class CrisisController {

	private Crisis crisis;
	
	public CrisisController() {
		crisis = new Crisis();
	}
	
	public String save() {
		Dao<Crisis> dao = new Dao<Crisis>(Crisis.class, new JpaUtil().getEntityManager());
		dao.insert(crisis);
		return "crisis";
	}

	public List<Crisis> getCrisisList() {
		
		LoginController loginC = (LoginController) FacesUtil.getObjectSession("#{loginC}", LoginController.class);
		CrisisDao dao = new CrisisDao(new JpaUtil().getEntityManager());
		
		return dao.listAllByPatient(loginC.getCurrentUser());
		
	}
	
	
	//Getters and Setters
	public Long getId() {
		return crisis.getId();
	}

	public void setId(Long id) {
		crisis.setId(id);
	}

	public Patient getPatient() {
		return crisis.getPatient();
	}

	public void setPatient(Patient patient) {
		crisis.setPatient(patient);
	}

	public Calendar getDate() {
		return crisis.getDate();
	}

	public void setDate(Calendar date) {
		crisis.setDate(date);
	}

	public String getTimer() {
		return crisis.getTimer();
	}

	public void setTimer(String timer) {
		crisis.setTimer(timer);
	}

	public String getIntensity() {
		return crisis.getIntensity();
	}

	public void setIntensity(String intensity) {
		crisis.setIntensity(intensity);
	}

	public String getNausea() {
		return crisis.getNausea();
	}

	public void setNausea(String nausea) {
		crisis.setNausea(nausea);
	}
	
}
