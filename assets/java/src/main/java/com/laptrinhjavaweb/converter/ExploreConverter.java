package com.laptrinhjavaweb.converter;

import org.springframework.stereotype.Component;

import com.laptrinhjavaweb.api.DTO.ExploreDTO;
import com.laptrinhjavaweb.entity.ExploreEntity;

@Component
public class ExploreConverter {
	public ExploreDTO toDTO_ENG(ExploreEntity entity) {
		ExploreDTO dto = new ExploreDTO();
		dto.setContentExplore(entity.getContentExploreENG());
		dto.setImageLink(entity.getImageLink());
		dto.setIdName(entity.getIdName());
		return dto;
	}

	public ExploreDTO toDTO_VIE(ExploreEntity entity) {
		ExploreDTO dto = new ExploreDTO();
		dto.setContentExplore(entity.getContentExploreVIE());
		dto.setImageLink(entity.getImageLink());
		dto.setIdName(entity.getIdName());
		return dto;
	}

	public ExploreDTO toDTO_JPN(ExploreEntity entity) {
		ExploreDTO dto = new ExploreDTO();
		dto.setContentExplore(entity.getContentExploreJPN());
		dto.setImageLink(entity.getImageLink());
		dto.setIdName(entity.getIdName());
		return dto;
	}
}
