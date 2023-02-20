package com.laptrinhjavaweb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "explore")
public class ExploreEntity extends BaseEntity {

	@Column(name = "contentexplore_ENG", length = 500)
	private String contentExploreENG;
	@Column(name = "contentexplore_VIE", length = 500)
	private String contentExploreVIE;
	@Column(name = "contentexplore_JPN", length = 500)
	private String contentExploreJPN;
	@Column(name = "image_link", length = 500)
	private String imageLink;
	@Column(name = "idName")
	private String idName;


	public String getIdName() {
		return idName;
	}

	public void setIdName(String idName) {
		this.idName = idName;
	}

	public String getImageLink() {
		return imageLink;
	}

	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
	}

	public String getContentExploreENG() {
		return contentExploreENG;
	}

	public void setContentExploreENG(String contentExploreENG) {
		this.contentExploreENG = contentExploreENG;
	}

	public String getContentExploreVIE() {
		return contentExploreVIE;
	}

	public void setContentExploreVIE(String contentExploreVIE) {
		this.contentExploreVIE = contentExploreVIE;
	}

	public String getContentExploreJPN() {
		return contentExploreJPN;
	}

	public void setContentExploreJPN(String contentExploreJPN) {
		this.contentExploreJPN = contentExploreJPN;
	}

}
