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
	public List<CharacterDTO> findByIdName_ENG(String idName) {
		List<CharacterDTO> results = new ArrayList<>();
		List<CharacterEntity> entities = characterRepository.findByIdName(idName);
		for (CharacterEntity item : entities) {
			CharacterDTO characterOutput = characterConverter.toDTO_ENG(item);
			results.add(characterOutput);
		}
		return results;
	}

	@Override
	public List<CharacterDTO> findByIdName_VIE(String idName) {
		List<CharacterDTO> results = new ArrayList<>();
		List<CharacterEntity> entities = characterRepository.findByIdName(idName);
		for (CharacterEntity item : entities) {
			CharacterDTO characterOutput = characterConverter.toDTO_VIE(item);
			results.add(characterOutput);
		}
		return results;
	}

	@Override
	public List<CharacterDTO> findByIdName_JPN(String idName) {
		List<CharacterDTO> results = new ArrayList<>();
		List<CharacterEntity> entities = characterRepository.findByIdName(idName);
		for (CharacterEntity item : entities) {
			CharacterDTO characterOutput = characterConverter.toDTO_JPN(item);
			results.add(characterOutput);
		}
		return results;
	}

	@Override
	public void updateCharacter() {
		CharacterEntity entity1 = new CharacterEntity();
		String descriptionJPN_akagoe = "キャラクターは「シンノスケ」の登場人物の触発され、黄色い帽子とおなじみの学生服姿を着ています。\r\n"
				+ "子供たちが常にそのキャラクターを覚えて、プレイしたものを生活に適用できるように、シンプルで覚えやすいように描かれています。\r\n"
				+ "新しいスキルを学ぶ過程で、このキャラクターを赤ちゃんの仲間にしましょう。";
		String descriptionVIE_akagoe = "Nhật vật được vẽ dựa trên hình tượng là các nhân vật trong truyên 'Shin cậu bé bút chì' với mũ vàng và bộ đồ học sinh quen thuộc.\r\n"
				+ "Được vẽ đơn giản, dễ nhớ giúp các em luôn nhớ về nhân vật đó và áp dụng những gì được chơi vào cuộc sống.\r\n"
				+ "Hãy để nhân vật này là một người bạn đồng hành cùng bé trong quá trình học tập những kĩ năng mới.";
		String descriptionENG_akagoe = "The characters are drawn based on the images of characters from 'Pencil Boy Shin' with yellow hats and familiar school uniforms.\r\n"
				+ "They are drawn simply and easily to assist children in remembering characters and applying what is played in real life.\r\n"
				+ "Let this character be a companion to your baby in the process of learning new skills.";
		String imageLink_akagoe = "../assets/img/akagoe/character/puppet_kid.gltf";
		String imageType_akagoe = "3D";
		entity1.setDescriptionENG(descriptionENG_akagoe);
		entity1.setDescriptionJPN(descriptionJPN_akagoe);
		entity1.setDescriptionVIE(descriptionVIE_akagoe);
		entity1.setImageLink(imageLink_akagoe);
		entity1.setImageType(imageType_akagoe);
		entity1.setIdName("akagoe");
		characterRepository.save(entity1);
		
		CharacterEntity entity2 = new CharacterEntity();
		String descriptionJPN_vot = "vot";
		String descriptionVIE_vot = "vot1";
		String descriptionENG_vot = "vot2";
		String imageLink_vot = "../assets/img/akagoe/character/puppet_kid.gltf";
		String imageType_vot = "3D";
		entity2.setDescriptionENG(descriptionENG_vot);
		entity2.setDescriptionJPN(descriptionJPN_vot);
		entity2.setDescriptionVIE(descriptionVIE_vot);
		entity2.setImageLink(imageLink_vot);
		entity2.setImageType(imageType_vot);
		entity2.setIdName("vot");
		characterRepository.save(entity2);
		
		CharacterEntity entity3 = new CharacterEntity();
		String descriptionJPN_revivedknight = "knight";
		String descriptionVIE_revivedknight = "knight1";
		String descriptionENG_revivedknight = "knight2";
		String imageLink_revivedknight = "../assets/img/akagoe/character/puppet_kid.gltf";
		String imageType_revivedknight = "3D";
		entity3.setDescriptionENG(descriptionENG_revivedknight);
		entity3.setDescriptionJPN(descriptionJPN_revivedknight);
		entity3.setDescriptionVIE(descriptionVIE_revivedknight);
		entity3.setImageLink(imageLink_revivedknight);
		entity3.setImageType(imageType_revivedknight);
		entity3.setIdName("revivedknight");
		characterRepository.save(entity3);
		
		CharacterEntity entity4 = new CharacterEntity();
		String descriptionJPN_soulhalo = "halo";
		String descriptionVIE_soulhalo = "halo1";
		String descriptionENG_soulhalo = "halo2";
		String imageLink_soulhalo = "../assets/img/akagoe/character/puppet_kid.gltf";
		String imageType_soulhalo = "3D";
		entity4.setDescriptionENG(descriptionENG_soulhalo);
		entity4.setDescriptionJPN(descriptionJPN_soulhalo);
		entity4.setDescriptionVIE(descriptionVIE_soulhalo);
		entity4.setImageLink(imageLink_soulhalo);
		entity4.setImageType(imageType_soulhalo);
		entity4.setIdName("soulhalo");
		characterRepository.save(entity4);
		
	}

}
