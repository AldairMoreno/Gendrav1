package com.example.demo.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Table (name = "settlements")
@Entity
public class SettlementsEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column (name = "zip_code_settlement")
	private int zip_code_settlement;
	
	@Column (name = "name")
	private String name;
	
	@Column (name = "zone_type")
	private String zone_type;
	
	@Column (name = "settlement_type")
	private String settlement_type;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getZip_code_settlement() {
		return zip_code_settlement;
	}

	public void setZip_code_settlement(int zip_code_settlement) {
		this.zip_code_settlement = zip_code_settlement;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getZone_type() {
		return zone_type;
	}

	public void setZone_type(String zone_type) {
		this.zone_type = zone_type;
	}

	public String getSettlement_type() {
		return settlement_type;
	}

	public void setSettlement_type(String settlement_type) {
		this.settlement_type = settlement_type;
	}

	public SettlementsEntity() {
		super();
	}

	public SettlementsEntity(int id, int zip_code_settlement, String name, String zone_type, String settlement_type) {
		super();
		this.id = id;
		this.zip_code_settlement = zip_code_settlement;
		this.name = name;
		this.zone_type = zone_type;
		this.settlement_type = settlement_type;
	}
	
	
	
}
