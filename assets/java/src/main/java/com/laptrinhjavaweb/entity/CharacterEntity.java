package com.laptrinhjavaweb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "NhanVat")
public class CharacterEntity extends BaseEntity {

	@Column(name = "description_ENG")
	private String descriptionENG;
	@Column(name = "description_VIE")
	private String descriptionVIE;
	@Column(name = "description_JPN")
	private String descriptionJPN;

	public String getDescriptionENG() {
		return descriptionENG;
	}

	public void setDescriptionENG(String descriptionENG) {
		this.descriptionENG = descriptionENG;
	}

	public String getDescriptionVIE() {
		return descriptionVIE;
	}

	public void setDescriptionVIE(String descriptionVIE) {
		this.descriptionVIE = descriptionVIE;
	}

	public String getDescriptionJPN() {
		return descriptionJPN;
	}

	public void setDescriptionJPN(String descriptionJPN) {
		this.descriptionJPN = descriptionJPN;
	}

}
