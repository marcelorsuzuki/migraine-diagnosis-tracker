package br.unifesp.migrainetrack.model;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the History database table.
 * 
 */
@Entity
public class History implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue
	@Column(name="id_his")
	private int id;

	@Column(name="dt_his")
	@Temporal(TemporalType.DATE)
	private Calendar dateHistory;

	private String breakfast;

	private String lunch;
	
	private String dinner;

	private String others;
	
	@Column(name="daily_act")
	private String dailyActivities;
	
	//bi-directional many-to-one association to Patient
	@ManyToOne
	@JoinColumn(name="cod_pat")
	private Patient patient;

	public History() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBreakfast() {
		return breakfast;
	}

	public void setBreakfast(String breakfast) {
		this.breakfast = breakfast;
	}

	public String getDailyActivities() {
		return dailyActivities;
	}

	public void setDailyActivities(String dailyActivities) {
		this.dailyActivities = dailyActivities;
	}

	public String getDinner() {
		return dinner;
	}

	public void setDinner(String dinner) {
		this.dinner = dinner;
	}

	public Calendar getDateHistory() {
		return dateHistory;
	}

	public void setDateHistory(Calendar dateHistory) {
		this.dateHistory = dateHistory;
	}

	public String getLunch() {
		return lunch;
	}

	public void setLunch(String lunch) {
		this.lunch = lunch;
	}

	public String getOthers() {
		return others;
	}

	public void setOthers(String others) {
		this.others = others;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}


}