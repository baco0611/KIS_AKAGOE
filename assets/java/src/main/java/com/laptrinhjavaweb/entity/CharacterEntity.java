package com.laptrinhjavaweb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "NhanVat")
public class CharacterEntity extends BaseEntity {

	@Column(name = "description_ENG", length = 600)
	private String descriptionENG;
	@Column(name = "description_VIE", length = 600)
	private String descriptionVIE;
	@Column(name = "description_JPN", length = 600)
	private String descriptionJPN;
	@Column(name = "image_link", length = 500)
	private String imageLink;
	@Column(name = "image_type")
	private String imageType;

	public String getImageType() {
		return imageType;
	}

	public void setImageType(String imageType) {
		this.imageType = imageType;
	}

	public String getImageLink() {
		return imageLink;
	}

	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
	}

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
