package br.unifesp.migrainetrack.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class State {

	@Id @GeneratedValue
	@Column(name="id_st")
	private Long id;
	
	@Column(name="ab_st")
	private String ab;
	
	@Column(name="nm_st")
	private String name;
	
	@OneToMany(mappedBy="state")
	private List<City> cityList;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAb() {
		return ab;
	}
	public void setAb(String ab) {
		this.ab = ab;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
