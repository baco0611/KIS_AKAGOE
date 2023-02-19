package com.laptrinhjavaweb.converter;

import org.springframework.stereotype.Component;

import com.laptrinhjavaweb.api.DTO.CharacterDTO;
import com.laptrinhjavaweb.entity.CharacterEntity;

@Component
public class CharacterConverter {
	public CharacterDTO toDTO_ENG(CharacterEntity entity) {
		CharacterDTO dto = new CharacterDTO();
		dto.setDescription(entity.getDescriptionENG());
		dto.setImageLink(entity.getImageLink());
		dto.setImageType(entity.getImageType());
		return dto;
	}

	public CharacterDTO toDTO_VIE(CharacterEntity entity) {
		CharacterDTO dto = new CharacterDTO();
		dto.setDescription(entity.getDescriptionVIE());
		dto.setImageLink(entity.getImageLink());
		dto.setImageType(entity.getImageType());
		return dto;
	}

	public CharacterDTO toDTO_JPN(CharacterEntity entity) {
		CharacterDTO dto = new CharacterDTO();
		dto.setDescription(entity.getDescriptionJPN());
		dto.setImageLink(entity.getImageLink());
		dto.setImageType(entity.getImageType());
		return dto;
	}
}
