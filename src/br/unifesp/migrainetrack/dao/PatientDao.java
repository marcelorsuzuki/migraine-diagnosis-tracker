package br.unifesp.migrainetrack.dao;



import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

import br.unifesp.migrainetrack.model.Patient;

public class PatientDao implements Serializable {
	
	private static final long serialVersionUID = 2091671855346127476L;
	private EntityManager em;

	public void adiciona(Patient patient) {
		//consegue a entity manager
		EntityManager em = new JpaUtil().getEntityManager();
		
		//abre transacao
		em.getTransaction().begin();

		//persiste o objeto
		em.persist(patient);

		//commita a transacao
		em.getTransaction().commit();

		//fecha a entity manager
		em.close();
	}

	public void remove(Patient patient) {
		em.remove(em.merge(patient));
	}

	public void atualiza(Patient patient) {
		em.merge(patient);
	}

	public List<Patient> listaTodos() {
		CriteriaQuery<Patient> query = em.getCriteriaBuilder().createQuery(Patient.class);
		query.select(query.from(Patient.class));

		List<Patient> lista = em.createQuery(query).getResultList();
		return lista;
	}
	
	public Patient buscaPorId(Long id) {
		Patient instancia = em.find(Patient.class, id);
		return instancia;
	}
	
	public int contaTodos() {
		long result = (Long) em.createQuery("select count(n) from Patient n").getSingleResult();
		return (int) result;
	}

	public List<Patient> listaTodosPaginada(int firstResult, int maxResults) {
		CriteriaQuery<Patient> query = em.getCriteriaBuilder().createQuery(Patient.class);
		query.select(query.from(Patient.class));

		List<Patient> lista = em.createQuery(query).setFirstResult(firstResult)
				.setMaxResults(maxResults).getResultList();
		return lista;
	}
	
	public boolean authentic(Patient patient) {
		
		EntityManager em = new JpaUtil().getEntityManager();
		
		
		
		Query query = em.createQuery("select p from Patient as p " +
			                         "where p.login = :login " +
				                     "and p.password = :password");
		query.setParameter("login", patient.getLogin());
		query.setParameter("password", patient.getPassword());
		List<Patient> list = (List<Patient>) query.getResultList();
		return (list.size() > 0);
	}
}
