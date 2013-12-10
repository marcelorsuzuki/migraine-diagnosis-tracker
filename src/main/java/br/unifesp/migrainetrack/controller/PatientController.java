package br.unifesp.migrainetrack.controller;
import javax.faces.bean.ManagedBean;

import br.unifesp.migrainetrack.dao.Dao;
import br.unifesp.migrainetrack.dao.JpaUtil;
import br.unifesp.migrainetrack.model.Crisis;
import br.unifesp.migrainetrack.model.Patient;

@ManagedBean
public class PatientController {
	
	public String show(Crisis crisis) {
		return "patient";
	}
	
	
	public String save(Patient patient) {
		Dao<Patient> dao = new Dao<Patient>(Patient.class, new JpaUtil().getEntityManager());
		dao.adiciona(patient);
		return "patient";
	}

	
}
