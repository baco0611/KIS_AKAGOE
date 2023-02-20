package com.laptrinhjavaweb.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laptrinhjavaweb.output.CharacterOutput;
import com.laptrinhjavaweb.service.ICharacterService;

@CrossOrigin
@RestController
public class CharacterAPI {
	@Autowired
	private ICharacterService characterService;

	@GetMapping(value = "akagoe/character/ENG")
	public CharacterOutput showCharacter_ENG() {
		CharacterOutput result = new CharacterOutput();
		result.setListResult(characterService.findAll_ENG());
		return result;
	}

	@GetMapping(value = "akagoe/character/VIE")
	public CharacterOutput showCharacter_VIE() {
		CharacterOutput result = new CharacterOutput();
		result.setListResult(characterService.findAll_VIE());
		return result;
	}

	@GetMapping(value = "akagoe/character/JPN")
	public CharacterOutput showCharacter_JPN() {
		CharacterOutput result = new CharacterOutput();
		result.setListResult(characterService.findAll_JPN());
		return result;
	}
}
