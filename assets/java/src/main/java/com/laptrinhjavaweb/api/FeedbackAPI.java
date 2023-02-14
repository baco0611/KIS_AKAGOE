package com.laptrinhjavaweb.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.laptrinhjavaweb.api.DTO.FeedbackDTO;
import com.laptrinhjavaweb.api.DTO.FeedbackInput;
import com.laptrinhjavaweb.output.MainBox;
import com.laptrinhjavaweb.output.ShowFeedback;
import com.laptrinhjavaweb.service.IFeedbackService;

@CrossOrigin
@RestController
public class FeedbackAPI {
	@Autowired
	private IFeedbackService feedbackService;

	@PostMapping(value = "/feedback")
	public FeedbackDTO createFeedback(@RequestBody FeedbackInput model) {
		return feedbackService.save(model);
	}

	@GetMapping(value = "/mainbox")
	public MainBox mainBox() {
		MainBox result = new MainBox();
		result.setNumberFB(feedbackService.feedbackNumber());
		result.setAvgStar(feedbackService.StarNumber() / feedbackService.feedbackNumber());
		return result;
	}

	@GetMapping(value = "/feedback/TimeAsc")
	public ShowFeedback TimeASC() {
		ShowFeedback result = new ShowFeedback();
		result.setListFeedback(feedbackService.findAllOrderByTimeAsc());
		return result;
	}

	@GetMapping(value = "/feedback/StarAsc")
	public ShowFeedback StarASC() {
		ShowFeedback result = new ShowFeedback();
		result.setListFeedback(feedbackService.findAllOrderByStarAsc());
		return result;
	}

	@GetMapping(value = "/feedback/StarDesc")
	public ShowFeedback StarDESC() {
		ShowFeedback result = new ShowFeedback();
		result.setListFeedback(feedbackService.findAllOrderByStarDesc());
		return result;
	}

	@GetMapping(value = "/feedback/TimeDesc")
	public ShowFeedback TimeDESC() {
		ShowFeedback result = new ShowFeedback();
		result.setListFeedback(feedbackService.findAllOrderByTimeDesc());
		return result;
	}

}
