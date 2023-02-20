package com.laptrinhjavaweb.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.laptrinhjavaweb.output.CharacterOutput;
import com.laptrinhjavaweb.service.ICharacterService;

@CrossOrigin
@RestController
public class CharacterAPI {
	@Autowired
	private ICharacterService characterService;

	@GetMapping(value = "/character/ENG/{idName}")
	public CharacterOutput showCharacter_ENG(@PathVariable("idName") String idName) {
		CharacterOutput result = new CharacterOutput();
		result.setListResult(characterService.findByIdName_ENG(idName));
		return result;
	}

	@GetMapping(value = "/character/VIE/{idName}")
	public CharacterOutput showCharacter_VIE(@PathVariable("idName") String idName) {
		CharacterOutput result = new CharacterOutput();
		result.setListResult(characterService.findByIdName_VIE(idName));
		return result;
	}

	@GetMapping(value = "/character/JPN/{idName}")
	public CharacterOutput showCharacter_JPN(@PathVariable("idName") String idName) {
		CharacterOutput result = new CharacterOutput();
		result.setListResult(characterService.findByIdName_JPN(idName));
		return result;
	}
}
