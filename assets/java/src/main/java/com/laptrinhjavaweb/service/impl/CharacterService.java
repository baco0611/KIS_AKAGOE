package com.laptrinhjavaweb.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laptrinhjavaweb.api.DTO.CharacterDTO;
import com.laptrinhjavaweb.converter.CharacterConverter;
import com.laptrinhjavaweb.entity.CharacterEntity;
import com.laptrinhjavaweb.repository.CharacterRepository;
import com.laptrinhjavaweb.service.ICharacterService;

@Service
public class CharacterService implements ICharacterService {
	@Autowired
	private CharacterConverter characterConverter;
	@Autowired
	private CharacterRepository characterRepository;

	@Override
	public List<CharacterDTO> findAll_ENG() {
		List<CharacterDTO> results = new ArrayList<>();
		List<CharacterEntity> entities = characterRepository.findAll();
		for (CharacterEntity item : entities) {
			CharacterDTO characterOutput = characterConverter.toDTO_ENG(item);
			results.add(characterOutput);
		}
		return results;
	}

	@Override
	public List<CharacterDTO> findAll_VIE() {
		List<CharacterDTO> results = new ArrayList<>();
		List<CharacterEntity> entities = characterRepository.findAll();
		for (CharacterEntity item : entities) {
			CharacterDTO characterOutput = characterConverter.toDTO_VIE(item);
			results.add(characterOutput);
		}
		return results;
	}

	@Override
	public List<CharacterDTO> findAll_JPN() {
		List<CharacterDTO> results = new ArrayList<>();
		List<CharacterEntity> entities = characterRepository.findAll();
		for (CharacterEntity item : entities) {
			CharacterDTO characterOutput = characterConverter.toDTO_JPN(item);
			results.add(characterOutput);
		}
		return results;
	}

	@Override
	public void updateCharacter() {
		CharacterEntity entity = new CharacterEntity();
		String descriptionJPN = "キャラクターは「シンノスケ」の登場人物の触発され、黄色い帽子とおなじみの学生服姿を着ています。\r\n"
				+ "子供たちが常にそのキャラクターを覚えて、プレイしたものを生活に適用できるように、シンプルで覚えやすいように描かれています。\r\n"
				+ "新しいスキルを学ぶ過程で、このキャラクターを赤ちゃんの仲間にしましょう。";
		String descriptionVIE = "Nhật vật được vẽ dựa trên hình tượng là các nhân vật trong truyên 'Shin cậu bé bút chì' với mũ vàng và bộ đồ học sinh quen thuộc.\r\n"
				+ "Được vẽ đơn giản, dễ nhớ giúp các em luôn nhớ về nhân vật đó và áp dụng những gì được chơi vào cuộc sống.\r\n"
				+ "Hãy để nhân vật này là một người bạn đồng hành cùng bé trong quá trình học tập những kĩ năng mới.";
		String descriptionENG = "The characters are drawn based on the images of characters from 'Pencil Boy Shin' with yellow hats and familiar school uniforms.\r\n"
				+ "They are drawn simply and easily to assist children in remembering characters and applying what is played in real life.\r\n"
				+ "Let this character be a companion to your baby in the process of learning new skills.";
		String imageLink = "./assets/img/character/puppet_kid.gltf";
		String imageType = "3D";
		entity.setDescriptionENG(descriptionENG);
		entity.setDescriptionJPN(descriptionJPN);
		entity.setDescriptionVIE(descriptionVIE);
		entity.setImageLink(imageLink);
		entity.setImageType(imageType);
		characterRepository.save(entity);
	}

}
