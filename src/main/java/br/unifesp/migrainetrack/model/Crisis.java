package br.unifesp.migrainetrack.model;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Crisis {

	@Id @GeneratedValue
	@Column(name="id_cri")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="cod_pat")
	private Patient patient;
	
	@Temporal(TemporalType.DATE)
	@Column(name="dt_cri")
	private Calendar date;
	
	@Column(name="tm_cri")
	private String timer;
	
	private String intensity;
	
	private String nausea;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	public String getTimer() {
		return timer;
	}

	public void setTimer(String timer) {
		this.timer = timer;
	}

	public String getIntensity() {
		return intensity;
	}

	public void setIntensity(String intensity) {
		this.intensity = intensity;
	}

	public String getNausea() {
		return nausea;
	}
	
	public void setNausea(String nausea) {
		this.nausea = nausea;
	}
	
	public String getNauseaYesNo() {
		if (nausea.equals("Y")) {
			return "Yes";
		}
		else {
			return "No";
		}
	}
}
