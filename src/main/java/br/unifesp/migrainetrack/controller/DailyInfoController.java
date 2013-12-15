package br.unifesp.migrainetrack.controller;
import javax.faces.bean.ManagedBean;

import br.unifesp.migrainetrack.dao.Dao;
import br.unifesp.migrainetrack.model.History;
import br.unifesp.migrainetrack.model.Patient;
import br.unifesp.migrainetrack.util.JpaUtil;

@ManagedBean
public class DailyInfoController {
	

	public String show(History history) {
		return "dailyinfo";
	}


	public String save(History history) {
		Patient p = new Patient();
		p.setId(1L);
		history.setPatient(p);
		
		Dao<History> dao = new Dao<History>(History.class, new JpaUtil().getEntityManager());
		dao.insert(history);
		return "dailyinfo";
	}
	
}
