package com.laptrinhjavaweb.converter;

import org.springframework.stereotype.Component;

import com.laptrinhjavaweb.api.DTO.FeedbackDTO;
import com.laptrinhjavaweb.api.DTO.FeedbackInput;
import com.laptrinhjavaweb.entity.FeedbackEntity;

@Component
//de co the nhung converter vao service
//convert DTO thanh Entity de luu xuong db
public class FeedbackConverter {
	public FeedbackEntity toEntity(FeedbackInput input) {
		FeedbackEntity entity = new FeedbackEntity();
		entity.setContent(input.getContent());
		entity.setStar(input.getStar());
		entity.setFullName(input.getFullName());
		entity.setEmail(input.getEmail());
		entity.setPhone(input.getPhone());
		return entity;
	}

	public FeedbackDTO toDTO(FeedbackEntity entity) {
		FeedbackDTO dto = new FeedbackDTO();
		dto.setContent(entity.getContent());
		dto.setStar(entity.getStar());
		dto.setTime(entity.getTime());
		dto.setFullName(entity.getFullName());
		return dto;
	}

}
