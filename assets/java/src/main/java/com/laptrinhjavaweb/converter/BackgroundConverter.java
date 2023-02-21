package com.laptrinhjavaweb.converter;

import org.springframework.stereotype.Component;

import com.laptrinhjavaweb.api.DTO.BackgroundDTO;
import com.laptrinhjavaweb.entity.BackgroundEntity;

@Component
public class BackgroundConverter {
	public BackgroundDTO toDTO(BackgroundEntity entity) {
		BackgroundDTO dto = new BackgroundDTO();
		dto.setPageName(entity.getPageName());
		dto.setImageLink(entity.getImagelink());
		dto.setIdName(entity.getIdName());
		return dto;
	}
}
