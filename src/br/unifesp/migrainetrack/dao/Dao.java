package br.unifesp.migrainetrack.dao;



import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;

public class Dao<T> implements Serializable {
	
	private static final long serialVersionUID = 2091671855346127476L;
	private EntityManager em;
	private final Class<T> classe;

	public Dao(Class<T> classe, EntityManager em) {
		this.em = em;
		this.classe = classe;
	}

	public void adiciona(T t) {
		//consegue a entity manager
		EntityManager em = new JpaUtil().getEntityManager();
		
		//abre transacao
		em.getTransaction().begin();

		//persiste o objeto
		em.persist(t);

		//commita a transacao
		em.getTransaction().commit();

		//fecha a entity manager
		em.close();
	}

	public void remove(T t) {
		em.remove(em.merge(t));
	}

	public void atualiza(T t) {
		em.merge(t);
	}

	public List<T> listaTodos() {
		CriteriaQuery<T> query = em.getCriteriaBuilder().createQuery(classe);
		query.select(query.from(classe));

		List<T> lista = em.createQuery(query).getResultList();
		return lista;
	}
	
	public T buscaPorId(Long id) {
		T instancia = em.find(classe, id);
		return instancia;
	}
	
	public int contaTodos() {
		long result = (Long) em.createQuery("select count(n) from " + classe.getName() + " n").getSingleResult();
		return (int) result;
	}

	public List<T> listaTodosPaginada(int firstResult, int maxResults) {
		CriteriaQuery<T> query = em.getCriteriaBuilder().createQuery(classe);
		query.select(query.from(classe));

		List<T> lista = em.createQuery(query).setFirstResult(firstResult)
				.setMaxResults(maxResults).getResultList();
		return lista;
	}
}
