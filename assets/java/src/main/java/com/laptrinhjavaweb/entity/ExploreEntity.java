package com.laptrinhjavaweb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "explore")
public class ExploreEntity extends BaseEntity {

	@Column(name = "contentexplore_ENG")
	private String contentExploreENG;
	@Column(name = "contentexplore_VIE")
	private String contentExploreVIE;
	@Column(name = "contentexplore_JPN")
	private String contentExploreJPN;

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
