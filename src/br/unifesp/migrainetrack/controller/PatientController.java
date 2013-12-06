package br.unifesp.migrainetrack.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.unifesp.migrainetrack.dao.Dao;
import br.unifesp.migrainetrack.dao.JpaUtil;
import br.unifesp.migrainetrack.model.Crisis;
import br.unifesp.migrainetrack.model.Patient;

@Controller
public class PatientController {
	
	@RequestMapping("/patient")
	public String show(Crisis crisis) {
		return "patient";
	}
	
	
	@RequestMapping("/patient-save")
	public String save(@RequestParam(required=false) Patient patient) {
		Dao<Patient> dao = new Dao<>(Patient.class, new JpaUtil().getEntityManager());
		dao.adiciona(patient);
		return "patient";
	}

	
}
