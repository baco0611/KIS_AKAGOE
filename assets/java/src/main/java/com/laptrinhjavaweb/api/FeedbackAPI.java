package com.laptrinhjavaweb.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

	@GetMapping(value = "/mainbox/{idName}")
	public MainBox mainBox(@PathVariable("idName") String idName) {
		MainBox result = new MainBox();
		result.setNumberFB(feedbackService.feedbackNumber(idName));
		result.setAvgStar(feedbackService.StarNumber(idName) / feedbackService.feedbackNumber(idName));
		return result;
	}

	@GetMapping(value = "/feedback/TimeAsc/{idName}")
	public ShowFeedback TimeASC(@PathVariable("idName") String idName) {
		ShowFeedback result = new ShowFeedback();
		result.setListFeedback(feedbackService.findAllOrderByTimeAsc(idName));
		return result;
	}

	@GetMapping(value = "/feedback/StarAsc/{idName}")
	public ShowFeedback StarASC(@PathVariable("idName") String idName) {
		ShowFeedback result = new ShowFeedback();
		result.setListFeedback(feedbackService.findAllOrderByStarAsc(idName));
		return result;
	}

	@GetMapping(value = "/feedback/StarDesc/{idName}")
	public ShowFeedback StarDESC(@PathVariable("idName") String idName) {
		ShowFeedback result = new ShowFeedback();
		result.setListFeedback(feedbackService.findAllOrderByStarDesc(idName));
		return result;
	}

	@GetMapping(value = "/feedback/TimeDesc/{idName}")
	public ShowFeedback TimeDESC(@PathVariable("idName") String idName) {
		ShowFeedback result = new ShowFeedback();
		result.setListFeedback(feedbackService.findAllOrderByTimeDesc(idName));
		return result;
	}

}
