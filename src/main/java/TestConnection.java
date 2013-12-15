import java.util.List;

import javax.persistence.EntityManager;

import br.unifesp.migrainetrack.dao.Dao;
import br.unifesp.migrainetrack.model.Patient;
import br.unifesp.migrainetrack.util.JpaUtil;


public class TestConnection {

	public static void main(String[] args) {
		EntityManager em = new JpaUtil().getEntityManager();
		Dao<Patient> daoPatient = new Dao<Patient>(Patient.class, em);
		
		List<Patient> patientList = daoPatient.listAll();
		
		
		for (Patient p : patientList) {
			System.out.println(p.getUsername() + " - " + p.getPassword());
		}
		

	}

}
