package com.laptrinhjavaweb.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laptrinhjavaweb.api.DTO.FeedbackDTO;
import com.laptrinhjavaweb.api.DTO.FeedbackInput;
import com.laptrinhjavaweb.converter.FeedbackConverter;
import com.laptrinhjavaweb.entity.FeedbackEntity;
import com.laptrinhjavaweb.repository.FeedbackRepository;
import com.laptrinhjavaweb.service.IFeedbackService;

@Service
public class FeedbackService implements IFeedbackService {
	@Autowired
	private FeedbackRepository feedbackRepository;

	// @Autowired
	// private UserRepository userRepository;

	@Autowired
	private FeedbackConverter feedbackConverter;

	@Override
	public FeedbackDTO save(FeedbackInput feedbackinput) {
		FeedbackEntity feedbackEntity = feedbackConverter.toEntity(feedbackinput);
		feedbackEntity = feedbackRepository.save(feedbackEntity);
		return feedbackConverter.toDTO(feedbackEntity);
	}

	@Override
	public List<FeedbackDTO> findAllOrderByTimeAsc(String idName) {
		List<FeedbackDTO> result = new ArrayList<>();
		List<FeedbackEntity> entities = new ArrayList<>();
		if (idName.equals("akagoe")) {
			entities = feedbackRepository.findAllOrderByTimeAsc_akagoe();
		}
		if (idName.equals("vot")) {
			entities = feedbackRepository.findAllOrderByTimeAsc_vot();
		}
		if (idName.equals("revivedknight")) {
			entities = feedbackRepository.findAllOrderByTimeAsc_revivedknight();
		}
		if (idName.equals("soulhalo")) {
			entities = feedbackRepository.findAllOrderByTimeAsc_soulhalo();
		}
		for (FeedbackEntity item : entities) {
			FeedbackDTO feedbackOutput = feedbackConverter.toDTO(item);
			result.add(feedbackOutput);
		}
		return result;
	}

	@Override
	public List<FeedbackDTO> findAllOrderByStarAsc(String idName) {
		List<FeedbackDTO> result = new ArrayList<>();
		List<FeedbackEntity> entities = new ArrayList<>();
		if (idName.equals("akagoe")) {
			entities = feedbackRepository.findAllOrderByStarAsc_akagoe();
		}
		if (idName.equals("vot")) {
			entities = feedbackRepository.findAllOrderByStarAsc_vot();
		}
		if (idName.equals("revivedknight")) {
			entities = feedbackRepository.findAllOrderByStarAsc_revivedknight();
		}
		if (idName.equals("soulhalo")) {
			entities = feedbackRepository.findAllOrderByStarAsc_soulhalo();
		}
		for (FeedbackEntity item : entities) {
			FeedbackDTO feedbackOutput = feedbackConverter.toDTO(item);
			result.add(feedbackOutput);
		}
		return result;
	}

	@Override
	public List<FeedbackDTO> findAllOrderByTimeDesc(String idName) {
		List<FeedbackDTO> result = new ArrayList<>();
		List<FeedbackEntity> entities = new ArrayList<>();
		if (idName.equals("akagoe")) {
			entities = feedbackRepository.findAllOrderByTimeDesc_akagoe();
		}
		if (idName.equals("vot")) {
			entities = feedbackRepository.findAllOrderByTimeDesc_vot();
		}
		if (idName.equals("revivedknight")) {
			entities = feedbackRepository.findAllOrderByTimeDesc_revivedknight();
		}
		if (idName.equals("soulhalo")) {
			entities = feedbackRepository.findAllOrderByTimeDesc_soulhalo();
		}
		for (FeedbackEntity item : entities) {
			FeedbackDTO feedbackOutput = feedbackConverter.toDTO(item);
			result.add(feedbackOutput);
		}
		return result;
	}

	@Override
	public List<FeedbackDTO> findAllOrderByStarDesc(String idName) {
		List<FeedbackDTO> result = new ArrayList<>();
		List<FeedbackEntity> entities = new ArrayList<>();
		if (idName.equals("akagoe")) {
			entities = feedbackRepository.findAllOrderByStarDesc_akagoe();
		}
		if (idName.equals("vot")) {
			entities = feedbackRepository.findAllOrderByStarDesc_vot();
		}
		if (idName.equals("revivedknight")) {
			entities = feedbackRepository.findAllOrderByStarDesc_revivedknight();
		}
		if (idName.equals("soulhalo")) {
			entities = feedbackRepository.findAllOrderByStarDesc_soulhalo();
		}
		for (FeedbackEntity item : entities) {
			FeedbackDTO feedbackOutput = feedbackConverter.toDTO(item);
			result.add(feedbackOutput);
		}
		return result;
	}

	@Override
	public long feedbackNumber (String idName) {
		long fb=0;
		if (idName.equals("akagoe")) {
			fb= feedbackRepository.feedbackNumber_akagoe();
		}
		if (idName.equals("vot")) {
			fb= feedbackRepository.feedbackNumber_vot();
		}
		if (idName.equals("soulhalo")) {
			fb=  feedbackRepository.feedbackNumber_soulhalo();
		}
		if (idName.equals("revivedknight")) {
			fb= feedbackRepository.feedbackNumber_revivedknight();
		}
		return fb;
	}

	@Override
	public long StarNumber (String idName) {
		long star=0;
		if (idName.equals("akagoe")) {
			star= feedbackRepository.StarNumber_akagoe();
		}
		if (idName.equals("vot")) {
			star= feedbackRepository.StarNumber_vot();
		}
		if (idName.equals("soulhalo")) {
			star=  feedbackRepository.StarNumber_soulhalo();
		}
		if (idName.equals("revivedknight")) {
			star= feedbackRepository.StarNumber_revivedknight();
		}
		return star;
	}

}
