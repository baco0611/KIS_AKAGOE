package com.laptrinhjavaweb.converter;

import org.springframework.stereotype.Component;

import com.laptrinhjavaweb.api.DTO.ExploreDTO;
import com.laptrinhjavaweb.entity.ExploreEntity;

@Component
public class ExploreConverter {
	public ExploreDTO toDTO_ENG(ExploreEntity entity) {
		ExploreDTO dto = new ExploreDTO();
		dto.setContentExplore(entity.getContentExploreENG());
		return dto;
	}

	public ExploreDTO toDTO_VIE(ExploreEntity entity) {
		ExploreDTO dto = new ExploreDTO();
		dto.setContentExplore(entity.getContentExploreVIE());
		return dto;
	}

	public ExploreDTO toDTO_JPN(ExploreEntity entity) {
		ExploreDTO dto = new ExploreDTO();
		dto.setContentExplore(entity.getContentExploreJPN());
		return dto;
	}
}