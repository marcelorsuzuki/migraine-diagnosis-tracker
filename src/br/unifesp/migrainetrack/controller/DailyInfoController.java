package br.unifesp.migrainetrack.controller;
import javax.persistence.EntityManager;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.unifesp.migrainetrack.dao.Dao;
import br.unifesp.migrainetrack.dao.JpaUtil;
import br.unifesp.migrainetrack.dao.PatientDao;
import br.unifesp.migrainetrack.model.History;
import br.unifesp.migrainetrack.model.Patient;

@Controller
public class DailyInfoController {
	
	@RequestMapping("/daily-info")
	public String show(History history) {
		return "dailyinfo";
	}

	@RequestMapping("/save")
	public String save(History history) {
		Patient p = new Patient();
		p.setId(1L);
		history.setPatient(p);
		
		Dao<History> dao = new Dao<>(History.class, new JpaUtil().getEntityManager());
		dao.adiciona(history);
		return "dailyinfo";
	}
	
}
