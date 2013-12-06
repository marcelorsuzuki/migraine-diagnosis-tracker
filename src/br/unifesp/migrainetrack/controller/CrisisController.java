package br.unifesp.migrainetrack.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.unifesp.migrainetrack.dao.Dao;
import br.unifesp.migrainetrack.dao.JpaUtil;
import br.unifesp.migrainetrack.model.Crisis;
import br.unifesp.migrainetrack.model.Patient;

@Controller
public class CrisisController {
	
	@RequestMapping("/crisis")
	public String show(Crisis crisis) {
		return "crisis";
	}
	
	@RequestMapping("/crisis-save")
	public String save(Crisis crisis) {
		Patient p = new Patient();
		p.setId(1L);
		crisis.setPatient(p);
		
		Dao<Crisis> dao = new Dao<>(Crisis.class, new JpaUtil().getEntityManager());
		dao.adiciona(crisis);
		return "crisis";
	}
	
}
