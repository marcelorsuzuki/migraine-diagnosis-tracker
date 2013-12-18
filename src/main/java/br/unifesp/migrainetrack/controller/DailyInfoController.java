package br.unifesp.migrainetrack.controller;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;

import br.unifesp.migrainetrack.dao.DailyInfoDao;
import br.unifesp.migrainetrack.model.History;
import br.unifesp.migrainetrack.model.Patient;
import br.unifesp.migrainetrack.util.FacesUtil;
import br.unifesp.migrainetrack.util.JpaUtil;

@ManagedBean(name="dailyInfoC")
public class DailyInfoController {
	
	private History history;
	
	public DailyInfoController() {
		history = new History();
	}
	
	public String save() {
		DailyInfoDao dao = new DailyInfoDao(new JpaUtil().getEntityManager());
		LoginController c = (LoginController) FacesUtil.getObjectSession("#{loginC}", LoginController.class);
		history.setPatient(c.getCurrentUser());
		dao.insert(history);
		return "dailyinfo";
	}
	
	
	public List<History> getDailyInfoList() {
		LoginController loginC = (LoginController) FacesUtil.getObjectSession("#{loginC}", LoginController.class);
		DailyInfoDao dao = new DailyInfoDao(new JpaUtil().getEntityManager());
		
		return dao.listAllByPatient(loginC.getCurrentUser());
		
	}

	//Getters and Setters
	public int getId() {
		return history.getId();
	}

	public void setId(int id) {
		history.setId(id);
	}

	public String getBreakfast() {
		return history.getBreakfast();
	}

	public void setBreakfast(String breakfast) {
		history.setBreakfast(breakfast);
	}

	public String getDailyActivities() {
		return history.getDailyActivities();
	}

	public void setDailyActivities(String dailyActivities) {
		history.setDailyActivities(dailyActivities);
	}

	public String getDinner() {
		return history.getDinner();
	}

	public void setDinner(String dinner) {
		history.setDinner(dinner);
	}

	public Date getDateHistory() {
		return history.getDateHistory().getTime();
	}

	public void setDateHistory(Date dateHistory) {
		history.getDateHistory().setTime(dateHistory);
		
	}

	public String getLunch() {
		return history.getLunch();
	}

	public void setLunch(String lunch) {
		history.setLunch(lunch);
	}

	public String getOthers() {
		return history.getOthers();
	}

	public void setOthers(String others) {
		history.setOthers(others);
	}

	public Patient getPatient() {
		return history.getPatient();
	}

	public void setPatient(Patient patient) {
		history.setPatient(patient);
	}
	
	
}
