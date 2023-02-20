package com.laptrinhjavaweb.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laptrinhjavaweb.api.DTO.ContentDTO;
import com.laptrinhjavaweb.converter.ContentConverter;
import com.laptrinhjavaweb.entity.ContentEntity;
import com.laptrinhjavaweb.repository.ContentRepository;
import com.laptrinhjavaweb.service.IContentService;

@Service
public class ContentService implements IContentService {
	@Autowired
	private ContentRepository contentRepository;
	@Autowired
	private ContentConverter contentConverter;

	@Override
	public List<ContentDTO> findByIdName_ENG(String idName) {
		List<ContentDTO> results = new ArrayList<>();
		List<ContentEntity> entities = contentRepository.findByIdName(idName);
		for (ContentEntity item : entities) {
			ContentDTO contentOutput = contentConverter.toDTO_ENG(item);
			results.add(contentOutput);
		}
		return results;
	}

	@Override
	public List<ContentDTO> findByIdName_VIE(String idName) {
		List<ContentDTO> results = new ArrayList<>();
		List<ContentEntity> entities = contentRepository.findByIdName(idName);
		for (ContentEntity item : entities) {
			ContentDTO contentOutput = contentConverter.toDTO_VIE(item);
			results.add(contentOutput);
		}
		return results;
	}

	@Override
	public List<ContentDTO> findByIdName_JPN(String idName) {
		List<ContentDTO> results = new ArrayList<>();
		List<ContentEntity> entities = contentRepository.findByIdName(idName);
		for (ContentEntity item : entities) {
			ContentDTO contentOutput = contentConverter.toDTO_JPN(item);
			results.add(contentOutput);
		}
		return results;
	}

	@Override
	public void updateIntroduce() {
		ContentEntity entity1= new ContentEntity();
		String titleNameENG_akagoe="What is\r\n" + "'Children's Voices'";
		String titleNameVIE_akagoe="赤声là gì\r\n" + "“Tiếng lòng của trẻ em”" ;
		String titleNameJPN_akagoe="赤声は何ですか？\r\n" + "赤ちゃんの声";
		String contentDetailsJPN_akagoe="赤声は6歳以上の子供向けの教育ゲームです。この時期は子供が新しい知識を学び始める時期ですから、簡単な規律を教えると長く覚えられます。\r\n" + 
				"名前は赤ちゃんと声を組み合わせたもので、赤ちゃんの言いたい事という意味です。\r\n" + 
				"ゲームはアドベンチャーとパズルの刑をして、子供たちが自分の周りの世界について学び、ごみの分別や部屋の掃除などの簡単なスキルを学ぶことに役立つ旅です。\r\n" + 
				"チャレンジが子供たちの日常生活の様々な場所で行い、日々繰り返し、スキルを身につけていきます。\r\n" + 
				"ゲーム開発経過は部屋の装飾や服の購入のような機能を追加します。";
		String contentDetailsENG_akagoe="An educational game for children aged 6 and up.\r\n" + 
				"The name is a combination of 'children' and 'sound', representing the voices of children.\r\n" + 
				"Adventure and puzzle format\r\n" + 
				"The game will be a journey to help children learn soft skills such as sorting garbage, going to the supermarket by themselves, arranging furniture, etc.\r\n" + 
				"Challenges will be repeated daily in different locations, like the children's daily lives, so they learn those skills.";
		
		String contentDetailsVIE_akagoe="赤声 là một trò chơi hướng tới giáo dục dành cho trẻ em từ 6 tuổi trở lên.\r\n" + 
				"Tên kết hợp giữa 赤ちゃん (trẻ em) và 声 (âm thanh) thể hiện tiếng nói của trẻ em.\r\n" + 
				"Hình thức: Phiêu lưu và giải đố.\r\n" + 
				"Trò chơi sẽ là một hành trình giúp các em có thể học tập các kỹ năng mềm như phân loại rác, tự đi siêu thị, sắp xếp đồ đạc, …\r\n" + 
				"Các thử thách sẽ được lặp lại theo ngày ở các địa điểm khác nhau như cuộc sống thường ngày của các em nhỏ để các em học tập được các kỹ năng đó.";
		entity1.setTitleNameVIE(titleNameVIE_akagoe);
		entity1.setTitleNameENG(titleNameENG_akagoe);
		entity1.setTitleNameJPN(titleNameJPN_akagoe);
		entity1.setContentDetailsENG(contentDetailsENG_akagoe);
		entity1.setContentDetailsJPN(contentDetailsJPN_akagoe);
		entity1.setContentDetailsVIE(contentDetailsVIE_akagoe);
		entity1.setIdName("akagoe");
		contentRepository.save(entity1);
		
		ContentEntity entity2= new ContentEntity();
		String titleNameENG_vot="vot'";
		String titleNameVIE_vot="vot1" ;
		String titleNameJPN_vot="vot2";
		String contentDetailsJPN_vot="vot3";
		String contentDetailsENG_vot="vot4";
		String contentDetailsVIE_vot="vot5";
		entity2.setTitleNameVIE(titleNameVIE_vot);
		entity2.setTitleNameENG(titleNameENG_vot);
		entity2.setTitleNameJPN(titleNameJPN_vot);
		entity2.setContentDetailsENG(contentDetailsENG_vot);
		entity2.setContentDetailsJPN(contentDetailsJPN_vot);
		entity2.setContentDetailsVIE(contentDetailsVIE_vot);
		entity2.setIdName("vot");
		contentRepository.save(entity2);
		
		ContentEntity entity3= new ContentEntity();
		String titleNameENG_revivedknight="night";
		String titleNameVIE_revivedknight="night1" ;
		String titleNameJPN_revivedknight="night2";
		String contentDetailsJPN_revivedknight="night3";
		String contentDetailsENG_revivedknight="night4";
		String contentDetailsVIE_revivedknight="night5";
		entity3.setTitleNameVIE(titleNameVIE_revivedknight);
		entity3.setTitleNameENG(titleNameENG_revivedknight);
		entity3.setTitleNameJPN(titleNameJPN_revivedknight);
		entity3.setContentDetailsENG(contentDetailsENG_revivedknight);
		entity3.setContentDetailsJPN(contentDetailsJPN_revivedknight);
		entity3.setContentDetailsVIE(contentDetailsVIE_revivedknight);
		entity3.setIdName("revivedknight");
		contentRepository.save(entity3);
		
		ContentEntity entity4= new ContentEntity();
		String titleNameENG_soulhalo="halo";
		String titleNameVIE_soulhalo="halo1" ;
		String titleNameJPN_soulhalo="halo2";
		String contentDetailsJPN_soulhalo="halo3";
		String contentDetailsENG_soulhalo="halo4";
		String contentDetailsVIE_soulhalo="halo5";
		entity4.setTitleNameVIE(titleNameVIE_soulhalo);
		entity4.setTitleNameENG(titleNameENG_soulhalo);
		entity4.setTitleNameJPN(titleNameJPN_soulhalo);
		entity4.setContentDetailsENG(contentDetailsENG_soulhalo);
		entity4.setContentDetailsJPN(contentDetailsJPN_soulhalo);
		entity4.setContentDetailsVIE(contentDetailsVIE_soulhalo);
		entity4.setIdName("soulhalo");
		contentRepository.save(entity4);
	}
}
