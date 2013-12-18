package br.unifesp.migrainetrack.model;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Patient {
	
	@Id @GeneratedValue
	@Column(name="id_pat")
	private Long id;
	
	private String name;
	
	@Temporal(TemporalType.DATE)
	@Column(name="dt_birth")
	private Calendar birthday;
	
	private String gender;
	
	@ManyToOne
	@JoinColumn(name="cod_ms")
	private MaritalStatus maritalStatus;
	
	private String job;
	
	private String address1;
	
	private String address2;
	
	private String address3;
	
	@Column(name="zip_code")
	private String zipCode;
	
	@ManyToOne
	@JoinColumn(name="cod_cit")
	private City city;
	
	private String phone;
	
	@Column(name="CPF")
	private String cpf;
	
	@Column(name="ID")
	private String identification;
	
	private String email;
	
	@Column(name="login")
	private String username;
	
	@Column(name="pwd")
	private String password;
	
	private String allergy;
	
	@ManyToOne
	@JoinColumn(name="cod_dis")
	private Disease disease;
	
	private String notes;
	
	@OneToMany(mappedBy="patient")
	private List<Crisis> crisiList;
	
	@OneToMany(mappedBy="patient")
	private List<Disease> diseaseList;

	@OneToMany(mappedBy="patient")
	private List<History> historyList;

	
	public Patient() {
		birthday = Calendar.getInstance();
		maritalStatus = new MaritalStatus();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Calendar getBirthday() {
		return birthday;
	}

	public void setBirthday(Calendar birthday) {
		this.birthday = birthday;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public MaritalStatus getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(MaritalStatus maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getAddress3() {
		return address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getIdentification() {
		return identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<Crisis> getCrisiList() {
		return crisiList;
	}

	public void setCrisiList(List<Crisis> crisiList) {
		this.crisiList = crisiList;
	}

	public List<Disease> getDiseaseList() {
		return diseaseList;
	}

	public void setDiseaseList(List<Disease> diseaseList) {
		this.diseaseList = diseaseList;
	}

	public List<History> getHistoryList() {
		return historyList;
	}

	public void setHistoryList(List<History> historyList) {
		this.historyList = historyList;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAllergy() {
		return allergy;
	}

	public void setAllergy(String allergy) {
		this.allergy = allergy;
	}

	public Disease getDisease() {
		return disease;
	}

	public void setDisease(Disease disease) {
		this.disease = disease;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
	
}
