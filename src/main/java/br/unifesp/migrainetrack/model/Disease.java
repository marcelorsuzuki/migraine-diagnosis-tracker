package br.unifesp.migrainetrack.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Disease database table.
 * 
 */
@Entity
public class Disease implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_dis")
	private short id;

	//bi-directional many-to-one association to Patient
	@ManyToOne
	@JoinColumn(name="cod_pat")
	private Patient patient;
	
	@Column(name="desc_dis")
	private String description;

	private String genetic;

	public short getId() {
		return id;
	}

	public void setId(short id) {
		this.id = id;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getGenetic() {
		return genetic;
	}

	public void setGenetic(String genetic) {
		this.genetic = genetic;
	}

}