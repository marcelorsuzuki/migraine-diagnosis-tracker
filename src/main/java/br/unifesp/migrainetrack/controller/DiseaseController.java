package br.unifesp.migrainetrack.controller;
import javax.faces.bean.ManagedBean;

import br.unifesp.migrainetrack.model.Disease;
import br.unifesp.migrainetrack.model.Patient;

@ManagedBean(name="diseaseC")
public class DiseaseController {

	private Disease disease;
	
	public DiseaseController() {
		disease = new Disease();
	}
	
	public String save() {
		return "crisis";
	}

	
	//Getters and Setters
	public short getId() {
		return disease.getId();
	}

	public void setId(short id) {
		disease.setId(id);
	}

	public Patient getPatient() {
		return disease.getPatient();
	}

	public void setPatient(Patient patient) {
		disease.setPatient(patient);
	}

	public String getDescription() {
		return disease.getDescription();
	}

	public void setDescription(String description) {
		disease.setDescription(description);
	}

	public String getGenetic() {
		return disease.getGenetic();
	}

	public void setGenetic(String genetic) {
		disease.setGenetic(genetic);
	}
	
}
