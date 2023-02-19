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
	public List<ContentDTO> findAll_ENG() {
		List<ContentDTO> results = new ArrayList<>();
		List<ContentEntity> entities = contentRepository.findAll();
		for (ContentEntity item : entities) {
			ContentDTO contentOutput = contentConverter.toDTO_ENG(item);
			results.add(contentOutput);
		}
		return results;
	}

	@Override
	public List<ContentDTO> findAll_VIE() {
		List<ContentDTO> results = new ArrayList<>();
		List<ContentEntity> entities = contentRepository.findAll();
		for (ContentEntity item : entities) {
			ContentDTO contentOutput = contentConverter.toDTO_VIE(item);
			results.add(contentOutput);
		}
		return results;
	}

	@Override
	public List<ContentDTO> findAll_JPN() {
		List<ContentDTO> results = new ArrayList<>();
		List<ContentEntity> entities = contentRepository.findAll();
		for (ContentEntity item : entities) {
			ContentDTO contentOutput = contentConverter.toDTO_JPN(item);
			results.add(contentOutput);
		}
		return results;
	}

	@Override
	public void updateIntroduce() {
		ContentEntity entity= new ContentEntity();
		String titleNameENG="What is 'Children's Voices'";
		String titleNameVIE="赤声là gì\r\n" + "“Tiếng lòng của trẻ em”" ;
		String titleNameJPN="赤声は何ですか？\r\n" + "赤ちゃんの声";
		String contentDetailsJPN="赤声は6歳以上の子供向けの教育ゲームです。この時期は子供が新しい知識を学び始める時期ですから、簡単な規律を教えると長く覚えられます。\r\n" + 
				"名前は赤ちゃんと声を組み合わせたもので、赤ちゃんの言いたい事という意味です。\r\n" + 
				"ゲームはアドベンチャーとパズルの刑をして、子供たちが自分の周りの世界について学び、ごみの分別や部屋の掃除などの簡単なスキルを学ぶことに役立つ旅です。\r\n" + 
				"チャレンジが子供たちの日常生活の様々な場所で行い、日々繰り返し、スキルを身につけていきます。\r\n" + 
				"ゲーム開発経過は部屋の装飾や服の購入のような機能を追加します。";
		String contentDetailsENG="An educational game for children aged 6 and up.\r\n" + 
				"The name is a combination of 'children' and 'sound', representing the voices of children.\r\n" + 
				"Adventure and puzzle format\r\n" + 
				"The game will be a journey to help children learn soft skills such as sorting garbage, going to the supermarket by themselves, arranging furniture, etc.\r\n" + 
				"Challenges will be repeated daily in different locations, like the children's daily lives, so they learn those skills.";
		
		String contentDetailsVIE="赤声 là một trò chơi hướng tới giáo dục dành cho trẻ em từ 6 tuổi trở lên.\r\n" + 
				"Tên kết hợp giữa 赤ちゃん (trẻ em) và 声 (âm thanh) thể hiện tiếng nói của trẻ em.\r\n" + 
				"Hình thức: Phiêu lưu và giải đố.\r\n" + 
				"Trò chơi sẽ là một hành trình giúp các em có thể học tập các kỹ năng mềm như phân loại rác, tự đi siêu thị, sắp xếp đồ đạc, …\r\n" + 
				"Các thử thách sẽ được lặp lại theo ngày ở các địa điểm khác nhau như cuộc sống thường ngày của các em nhỏ để các em học tập được các kỹ năng đó.";
		entity.setTitleNameVIE(titleNameVIE);
		entity.setTitleNameENG(titleNameENG);
		entity.setTitleNameJPN(titleNameJPN);
		entity.setContentDetailsENG(contentDetailsENG);
		entity.setContentDetailsJPN(contentDetailsJPN);
		entity.setContentDetailsVIE(contentDetailsVIE);
		contentRepository.save(entity);
	}
}
