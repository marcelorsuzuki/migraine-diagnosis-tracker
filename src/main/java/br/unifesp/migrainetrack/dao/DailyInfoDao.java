package br.unifesp.migrainetrack.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.unifesp.migrainetrack.model.History;
import br.unifesp.migrainetrack.model.Patient;

public class DailyInfoDao extends Dao<History> {

	private static final long serialVersionUID = -309124367876338888L;
	private EntityManager em;

	public DailyInfoDao(EntityManager em) {
		super(History.class, em);
		this.em = em;
	}

	@SuppressWarnings("unchecked")
	public List<History> listAllByPatient(Patient patient) {
		Query query = em.createQuery("select h from History h " +
									 "where h.patient = :patient " +
				                     "order by h.dateHistory");
		query.setParameter("patient", patient);

		return (List<History>) query.getResultList();
	}

}
