package com.laptrinhjavaweb.service;

import java.util.List;

import com.laptrinhjavaweb.api.DTO.FeedbackDTO;
import com.laptrinhjavaweb.api.DTO.FeedbackInput;

public interface IFeedbackService {
	FeedbackDTO save(FeedbackInput feedbackinput);
	List<FeedbackDTO> findAllOrderByTimeAsc();
	List<FeedbackDTO> findAllOrderByStarAsc();
	List<FeedbackDTO> findAllOrderByTimeDesc();
	List<FeedbackDTO> findAllOrderByStarDesc();
	Long feedbackNumber();
	Long StarNumber();
}
