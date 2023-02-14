package com.laptrinhjavaweb.output;

import java.util.ArrayList;
import java.util.List;

import com.laptrinhjavaweb.api.DTO.ExploreDTO;

public class ExploreOutput {
	private List<ExploreDTO> listResult = new ArrayList<>();

	public List<ExploreDTO> getListResult() {
		return listResult;
	}

	public void setListResult(List<ExploreDTO> listResult) {
		this.listResult = listResult;
	}
	
}
