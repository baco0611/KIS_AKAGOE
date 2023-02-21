package com.laptrinhjavaweb.service;

import java.util.List;

import com.laptrinhjavaweb.api.DTO.FeedbackDTO;
import com.laptrinhjavaweb.api.DTO.FeedbackInput;

public interface IFeedbackService {
	FeedbackDTO save(FeedbackInput feedbackinput);
	List<FeedbackDTO> findAllOrderByTimeAsc(String idName);
	List<FeedbackDTO> findAllOrderByStarAsc(String idName);
	List<FeedbackDTO> findAllOrderByTimeDesc(String idName);
	List<FeedbackDTO> findAllOrderByStarDesc(String idName);
	long feedbackNumber(String idName);
	long StarNumber(String idName);
}
