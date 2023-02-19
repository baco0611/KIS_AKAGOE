package com.laptrinhjavaweb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "about")
public class ContentEntity extends BaseEntity {
	@Column(name = "titlename_ENG")
	private String titleNameENG;

	@Column(name = "contentdetails_ENG",length=1000)
	private String contentDetailsENG;
	
	@Column(name = "titlename_VIE")
	private String titleNameVIE;

	@Column(name = "contentdetails_VIE",length=1000)
	private String contentDetailsVIE;
	
	@Column(name = "titlename_JPN")
	private String titleNameJPN;

	@Column(name = "contentdetails_JPN",length=1000)
	private String contentDetailsJPN;

	public String getTitleNameENG() {
		return titleNameENG;
	}

	public void setTitleNameENG(String titleNameENG) {
		this.titleNameENG = titleNameENG;
	}

	public String getContentDetailsENG() {
		return contentDetailsENG;
	}

	public void setContentDetailsENG(String contentDetailsENG) {
		this.contentDetailsENG = contentDetailsENG;
	}

	public String getTitleNameVIE() {
		return titleNameVIE;
	}

	public void setTitleNameVIE(String titleNameVIE) {
		this.titleNameVIE = titleNameVIE;
	}

	public String getContentDetailsVIE() {
		return contentDetailsVIE;
	}

	public void setContentDetailsVIE(String contentDetailsVIE) {
		this.contentDetailsVIE = contentDetailsVIE;
	}

	public String getTitleNameJPN() {
		return titleNameJPN;
	}

	public void setTitleNameJPN(String titleNameJPN) {
		this.titleNameJPN = titleNameJPN;
	}

	public String getContentDetailsJPN() {
		return contentDetailsJPN;
	}

	public void setContentDetailsJPN(String contentDetailsJPN) {
		this.contentDetailsJPN = contentDetailsJPN;
	}

	
}
