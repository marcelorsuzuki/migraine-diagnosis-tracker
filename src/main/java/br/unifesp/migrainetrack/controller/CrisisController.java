package br.unifesp.migrainetrack.controller;
import javax.faces.bean.ManagedBean;

import br.unifesp.migrainetrack.dao.Dao;
import br.unifesp.migrainetrack.dao.JpaUtil;
import br.unifesp.migrainetrack.model.Crisis;
import br.unifesp.migrainetrack.model.Patient;

@ManagedBean
public class CrisisController {
	
	
	public String show(Crisis crisis) {
		return "crisis";
	}
	
	
	public String save(Crisis crisis) {
		Patient p = new Patient();
		p.setId(1L);
		crisis.setPatient(p);
		
		Dao<Crisis> dao = new Dao<Crisis>(Crisis.class, new JpaUtil().getEntityManager());
		dao.adiciona(crisis);
		return "crisis";
	}
	
}