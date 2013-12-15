package br.unifesp.migrainetrack.controller;
import javax.faces.bean.ManagedBean;

import br.unifesp.migrainetrack.dao.PatientDao;
import br.unifesp.migrainetrack.model.Crisis;
import br.unifesp.migrainetrack.model.Patient;
import br.unifesp.migrainetrack.util.JpaUtil;

@ManagedBean
public class PatientController {
	
	public String show(Crisis crisis) {
		return "patient";
	}
	
	
	public String save(Patient patient) {
		PatientDao dao = new PatientDao(new JpaUtil().getEntityManager());
		dao.insert(patient);
		return "patient";
	}

	
}
