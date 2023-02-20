package com.laptrinhjavaweb.output;

import java.util.ArrayList;
import java.util.List;

import com.laptrinhjavaweb.api.DTO.OtherDTO;

public class OtherOutput {
	private List<OtherDTO> other = new ArrayList<>();

	public List<OtherDTO> getOther() {
		return other;
	}

	public void setOther(List<OtherDTO> other) {
		this.other = other;
	}
}
