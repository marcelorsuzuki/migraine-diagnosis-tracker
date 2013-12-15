package br.unifesp.migrainetrack.dao;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.unifesp.migrainetrack.model.Patient;

public class PatientDao extends Dao<Patient> {
	
	private static final long serialVersionUID = 1713037372529273441L;

	private EntityManager em;
	
	public PatientDao(EntityManager em) {
		super(Patient.class, em);
		this.em = em;
	}

	
	public Patient authentic(String username, String password) {
		
		Query query = em.createQuery("select p from Patient as p " +
			                         "where p.username = :username " +
				                     "and p.password = :password");
		query.setParameter("username", username);
		query.setParameter("password", password);
		
		@SuppressWarnings("unchecked")
		List<Patient> list = (List<Patient>) query.getResultList();
		
		if (list.size() > 0) {
			return list.get(0);
		}
		else {
			return null;
		}
	}
}
