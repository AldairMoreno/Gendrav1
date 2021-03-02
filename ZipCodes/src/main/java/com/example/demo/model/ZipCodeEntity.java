package com.example.demo.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table (name = "zipcode")
@Entity
public class ZipCodeEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column (name = "zip_code")
	private int zip_code;
	
	@Column (name = "locality")
	private String locality;
	
	@Column (name = "federal_entity")
	private String federal_entity;	
	
	@JoinColumn(name = "zip_code_settlement", referencedColumnName = "zip_code", insertable = false, updatable = false)
	@OneToMany
	private List<SettlementsEntity>settlements;
	
	@Column (name = "municipality")
	private String municipality;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getZip_code() {
		return zip_code;
	}

	public void setZip_code(int zip_code) {
		this.zip_code = zip_code;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getFederal_entity() {
		return federal_entity;
	}

	public void setFederal_entity(String federal_entity) {
		this.federal_entity = federal_entity;
	}

	public List<SettlementsEntity> getSettlements() {
		return settlements;
	}

	public void setSettlements(List<SettlementsEntity> settlements) {
		this.settlements = settlements;
	}

	public String getMunicipality() {
		return municipality;
	}

	public void setMunicipality(String municipality) {
		this.municipality = municipality;
	}

	public ZipCodeEntity() {
		super();
	}

	public ZipCodeEntity(int id, int zip_code, String locality, String federal_entity,
			List<SettlementsEntity> settlements, String municipality) {
		super();
		this.id = id;
		this.zip_code = zip_code;
		this.locality = locality;
		this.federal_entity = federal_entity;
		this.settlements = settlements;
		this.municipality = municipality;
	}	
	
	
	
	
}
