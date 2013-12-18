package br.unifesp.migrainetrack.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Marital_Status database table.
 * 
 */
@Entity
@Table(name="Marital_Status")
public class MaritalStatus implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_ms")
	private long id;

	@Column(name="desc_ms")
	private String description;

	public MaritalStatus() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}