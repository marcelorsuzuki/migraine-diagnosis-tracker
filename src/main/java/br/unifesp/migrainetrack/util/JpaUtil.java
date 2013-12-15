package br.unifesp.migrainetrack.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class JpaUtil {
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("migraine");

	public EntityManager getEntityManager() {
		return emf.createEntityManager();
	}
	
	public void close(EntityManager em) {
		em.close();
	}
}
