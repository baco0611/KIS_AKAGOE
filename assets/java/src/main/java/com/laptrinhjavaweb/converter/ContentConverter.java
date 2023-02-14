package com.laptrinhjavaweb.converter;

import org.springframework.stereotype.Component;

import com.laptrinhjavaweb.api.DTO.ContentDTO;
import com.laptrinhjavaweb.entity.ContentEntity;

@Component
public class ContentConverter {

	public ContentDTO toDTO_ENG(ContentEntity entity) {
		ContentDTO dto = new ContentDTO();
		dto.setContentDetails(entity.getContentDetailsENG());
		dto.setTitle(entity.getTitleNameENG());
		return dto;
	}

	public ContentDTO toDTO_VIE(ContentEntity entity) {
		ContentDTO dto = new ContentDTO();
		dto.setContentDetails(entity.getContentDetailsVIE());
		dto.setTitle(entity.getTitleNameVIE());
		return dto;
	}

	public ContentDTO toDTO_JPN(ContentEntity entity) {
		ContentDTO dto = new ContentDTO();
		dto.setContentDetails(entity.getContentDetailsJPN());
		dto.setTitle(entity.getTitleNameJPN());
		return dto;
	}
}
