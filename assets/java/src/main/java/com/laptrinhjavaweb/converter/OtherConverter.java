package com.laptrinhjavaweb.converter;

import org.springframework.stereotype.Component;

import com.laptrinhjavaweb.api.DTO.OtherDTO;
import com.laptrinhjavaweb.entity.OtherEntity;
@Component
public class OtherConverter {
	public OtherDTO toDTO(OtherEntity entity) {
		OtherDTO dto = new OtherDTO();
		dto.setIdName(entity.getIdName());
		dto.setName(entity.getName());
		dto.setUrlImage(entity.getUrlImage());
		dto.setUrlPage(entity.getUrlPage());
		return dto;
	}
}
