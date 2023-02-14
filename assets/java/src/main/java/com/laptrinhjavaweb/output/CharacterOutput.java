package com.laptrinhjavaweb.output;

import java.util.ArrayList;
import java.util.List;

import com.laptrinhjavaweb.api.DTO.CharacterDTO;

public class CharacterOutput {
	private List<CharacterDTO> listResult = new ArrayList<>();

	public List<CharacterDTO> getListResult() {
		return listResult;
	}

	public void setListResult(List<CharacterDTO> listResult) {
		this.listResult = listResult;
	}
	
}
