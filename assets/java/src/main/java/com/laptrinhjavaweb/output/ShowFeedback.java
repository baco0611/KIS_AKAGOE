package com.laptrinhjavaweb.output;

import java.util.ArrayList;
import java.util.List;

import com.laptrinhjavaweb.api.DTO.FeedbackDTO;

public class ShowFeedback {
	private List<FeedbackDTO> listFeedback = new ArrayList<>();

	public List<FeedbackDTO> getListFeedback() {
		return listFeedback;
	}

	public void setListFeedback(List<FeedbackDTO> listFeedback) {
		this.listFeedback = listFeedback;
	}
	
}
