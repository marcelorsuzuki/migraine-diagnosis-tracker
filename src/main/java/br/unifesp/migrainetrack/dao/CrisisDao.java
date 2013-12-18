package br.unifesp.migrainetrack.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.unifesp.migrainetrack.model.Crisis;
import br.unifesp.migrainetrack.model.Patient;

public class CrisisDao extends Dao<Crisis> {

	private static final long serialVersionUID = -309124367876338888L;
	private EntityManager em;

	public CrisisDao(EntityManager em) {
		super(Crisis.class, em);
		this.em = em;
	}

	@SuppressWarnings("unchecked")
	public List<Crisis> listAllByPatient(Patient patient) {
		Query query = em.createQuery("select c from Crisis c " +
									 "where c.patient = :patient");
		query.setParameter("patient", patient);

		return (List<Crisis>) query.getResultList();
	}

}
