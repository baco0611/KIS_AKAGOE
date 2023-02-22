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
		String descriptionJPN_vot = "緑の忍者カエリ\r\n" + 
				"ピクセルでかく。\r\n" + 
				"面白いな身振り手振り";
		String descriptionVIE_vot = "Là một chú ếch ninja xanh lá \r\n" + 
				"Được vẽ 2d pixel \r\n" + 
				"Với một gương mặt, hành động vui nhộn\r\n";
		String descriptionENG_vot = "--> A green ninja frog\r\n" + 
				"--> Pixels drawn in two dimensions\r\n" + 
				"--> With a funny face, action";
		String imageLink_vot = "../assets/img/vot/character/character.png";
		String imageType_vot = "2D";
		entity2.setDescriptionENG(descriptionENG_vot);
		entity2.setDescriptionJPN(descriptionJPN_vot);
		entity2.setDescriptionVIE(descriptionVIE_vot);
		entity2.setImageLink(imageLink_vot);
		entity2.setImageType(imageType_vot);
		entity2.setIdName("vot");
		characterRepository.save(entity2);
		
		CharacterEntity entity3 = new CharacterEntity();
		String descriptionJPN_revivedknight = "キャラクターはホロウナイトという有名なゲームにインスパイアされています。\r\n" + 
				"シンプルな外見でキャラクターは、歩く、走る、跳ぶ、よじ登る、斬る、そして撃つなど、さまざまなアクションができます。\r\n" + 
				"反応のスピードが早いで、様々な地形で活躍できます。\r\n";
		String descriptionVIE_revivedknight = "Nhật vật được lấy cảm hứng từ tựa game nổi tiếng là Hollow Knight. \r\n" + 
				"Với ngoại hình đơn giản nên nhân vật có thể thực hiện nhiều hành động khác nhau như: đi bộ, chạy, nhảy, trèo, chém, bắn, …\r\n" + 
				"Với độ phản hồi di chuyển tốt nhân vật này có thể hoạt động trong nhiều địa hình khác nhau.\r\n";
		String descriptionENG_revivedknight = "The character is inspired by the famous video game Hollow Knight.\r\n" + 
				"With a simple appearance, the character can perform many different actions such as walking, running, jumping, climbing, slashing, shooting, etc.\r\n" + 
				"With good movement response, this character can operate in many different terrains.\r\n";
		String imageLink_revivedknight = "../assets/img/revivedknight/character/knight.glb";
		String imageType_revivedknight = "3D";
		entity3.setDescriptionENG(descriptionENG_revivedknight);
		entity3.setDescriptionJPN(descriptionJPN_revivedknight);
		entity3.setDescriptionVIE(descriptionVIE_revivedknight);
		entity3.setImageLink(imageLink_revivedknight);
		entity3.setImageType(imageType_revivedknight);
		entity3.setIdName("revivedknight");
		characterRepository.save(entity3);
		
		CharacterEntity entity4 = new CharacterEntity();
		String descriptionJPN_soulhalo = "チームのメンバーは様々な角度からよく見てこのキャラクターを選択することにした。\r\n" + 
				"明るい冒険者みたいの外見でプレイヤーはキャラクターのアドベンチャーが実感できる。\r\n" + 
				"Rileyは自分の物語を通じてプレイヤーの思春期の感情の発達過程を聞いてくれて深く分かってくれる友達になる。";
		String descriptionVIE_soulhalo = "Nhân vật được nhóm chọn lựa và xem xét từ nhiều khía cạnh khác nhau\r\n" + 
				"Với ngoại hình trẻ trung năng động và có phần phiêu lưu sẽ tạo cho người chơi cảm giác đang hòa mình vào chính hành trình của nhân vật\r\n" + 
				"Riley sẽ là người đồng hành, thấu hiểu và chia sẽ với bạn trong quá trình dậy thì và phát triển cảm xúc thông qua chính câu chuyện của cô ấy.";
		String descriptionENG_soulhalo = "Characters are selected and considered by the team from many different perspectives.\r\n" + 
				"With a youthful, dynamic, and adventurous appearance, it will give players the feeling of being immersed in the character's journey.\r\n" + 
				"Riley will be your companion, understanding and sharing her own experience with puberty and emotional development.";
		String imageLink_soulhalo = "../assets/img/soulhalo/character/characterMain.png";
		String imageType_soulhalo = "2D";
		entity4.setDescriptionENG(descriptionENG_soulhalo);
		entity4.setDescriptionJPN(descriptionJPN_soulhalo);
		entity4.setDescriptionVIE(descriptionVIE_soulhalo);
		entity4.setImageLink(imageLink_soulhalo);
		entity4.setImageType(imageType_soulhalo);
		entity4.setIdName("soulhalo");
		characterRepository.save(entity4);
		
	}

}