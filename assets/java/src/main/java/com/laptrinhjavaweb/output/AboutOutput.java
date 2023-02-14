package com.laptrinhjavaweb.output;

import java.util.ArrayList;
import java.util.List;

import com.laptrinhjavaweb.api.DTO.ContentDTO;

public class AboutOutput {
	private List<ContentDTO> listContent = new ArrayList<>();

	public List<ContentDTO> getListContent() {
		return listContent;
	}
	public void setListContent(List<ContentDTO> listContent) {
		this.listContent = listContent;
	}
	
}
