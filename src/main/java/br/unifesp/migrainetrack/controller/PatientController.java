package br.unifesp.migrainetrack.controller;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;

import br.unifesp.migrainetrack.dao.Dao;
import br.unifesp.migrainetrack.dao.PatientDao;
import br.unifesp.migrainetrack.model.City;
import br.unifesp.migrainetrack.model.Disease;
import br.unifesp.migrainetrack.model.MaritalStatus;
import br.unifesp.migrainetrack.model.Patient;
import br.unifesp.migrainetrack.util.JpaUtil;

@ManagedBean(name="patientC")
public class PatientController {
	
	private Patient patient;
	
	public PatientController() {
		patient = new Patient(); 
	}
	
	public String save() {
		System.out.println("Ola");
		PatientDao dao = new PatientDao(new JpaUtil().getEntityManager());
		dao.insert(patient);
		return "login?faces-redirect=true";
	}
	
	public List<MaritalStatus> getMaritalList() {
		Dao<MaritalStatus> dao = new Dao<>(MaritalStatus.class, new JpaUtil().getEntityManager());
		return dao.listAll();
	}
	
	public Long getId() {
		return patient.getId();
	}

	public void setId(Long id) {
		patient.setId(id);
	}

	public String getName() {
		return patient.getName();
	}

	public void setName(String name) {
		patient.setName(name);
	}

	public Date getBirthday() {
		return patient.getBirthday().getTime();
	}

	public void setBirthday(Date birthday) {
		patient.getBirthday().setTime(birthday);;
	}

	public String getGender() {
		return patient.getGender();
	}

	public void setGender(String gender) {
		patient.setGender(gender);
	}

	public String getJob() {
		return patient.getJob();
	}

	public void setJob(String job) {
		patient.setJob(job);
	}

	public String getAddress1() {
		return patient.getAddress1();
	}

	public void setAddress1(String address1) {
		patient.setAddress1(address1);
	}

	public String getAddress2() {
		return patient.getAddress2();
	}

	public void setAddress2(String address2) {
		patient.setAddress2(address2);
	}

	public String getAddress3() {
		return patient.getAddress3();
	}

	public void setAddress3(String address3) {
		patient.setAddress3(address3);
	}

	public String getZipCode() {
		return patient.getZipCode();
	}

	public void setZipCode(String zipCode) {
		patient.setZipCode(zipCode);
	}

	public MaritalStatus getMaritalStatus() {
		return patient.getMaritalStatus();
	}

	public void setMaritalStatus(MaritalStatus maritalStatus) {
		patient.setMaritalStatus(maritalStatus);
	}

	public long getMaritalId() {
		return patient.getMaritalStatus().getId();
	}
 
	public void setMaritalId(long id) {
		Dao<MaritalStatus> dao = new Dao<>(MaritalStatus.class, new JpaUtil().getEntityManager());
		MaritalStatus m = dao.loadById(id);
		patient.setMaritalStatus(m);
	}
	
	public City getCity() {
		return patient.getCity();
	}

	public void setCity(City city) {
		patient.setCity(city);
	}

	public String getPhone() {
		return patient.getPhone();
	}

	public void setPhone(String phone) {
		patient.setPhone(phone);
	}

	public String getCpf() {
		return patient.getCpf();
	}

	public void setCpf(String cpf) {
		patient.setCpf(cpf);
	}

	public String getIdentification() {
		return patient.getIdentification();
	}

	public void setIdentification(String identification) {
		patient.setIdentification(identification);
	}

	public String getEmail() {
		return patient.getEmail();
	}

	public void setEmail(String email) {
		patient.setEmail(email);
	}


	public String getUsername() {
		return patient.getUsername();
	}

	public void setUsername(String username) {
		patient.setUsername(username);
	}


	public String getPassword() {
		return patient.getPassword();
	}

	public void setPassword(String password) {
		patient.setPassword(password);
	}

	public String getAllergy() {
		return patient.getAllergy();
	}

	public void setAllergy(String allergy) {
		patient.setAllergy(allergy);
	}

	public Disease getDisease() {
		return patient.getDisease();
	}

	public void setDisease(Disease disease) {
		patient.setDisease(disease);
	}

	public String getNotes() {
		return patient.getNotes();
	}

	public void setNotes(String notes) {
		patient.setNotes(notes);
	}
	
}
