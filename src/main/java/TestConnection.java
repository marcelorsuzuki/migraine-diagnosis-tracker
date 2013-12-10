import java.util.List;

import javax.persistence.EntityManager;

import br.unifesp.migrainetrack.dao.Dao;
import br.unifesp.migrainetrack.dao.JpaUtil;
import br.unifesp.migrainetrack.model.Patient;


public class TestConnection {

	public static void main(String[] args) {
		EntityManager em = new JpaUtil().getEntityManager();
		Dao<Patient> daoPatient = new Dao<Patient>(Patient.class, em);
		
		List<Patient> patientList = daoPatient.listaTodos();
		
		
		for (Patient p : patientList) {
			System.out.println(p.getLogin() + " - " + p.getPassword());
		}
		

	}

}
