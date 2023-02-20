package com.laptrinhjavaweb.service;

import java.util.List;

import com.laptrinhjavaweb.api.DTO.CharacterDTO;

public interface ICharacterService {
	List<CharacterDTO> findByIdName_ENG(String idName);

	List<CharacterDTO> findByIdName_VIE(String idName);

	List<CharacterDTO> findByIdName_JPN(String idName);

	void updateCharacter();
}
