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
		String titleNameENG_vot="What is Vot";
		String titleNameVIE_vot="Vọt là gì" ;
		String titleNameJPN_vot="Votは何ですか";
		String contentDetailsJPN_vot="Jump is a game for everyone.\r\n" + 
				"Fun and entertainment mixed with a little suspense\r\n" + 
				"Multi-platform";
		String contentDetailsENG_vot="年齢をかかわらず楽しませるゲーム。\r\n" + 
				"楽しく、リラックス、そしてちょっとしたドキドキ感じを含む。\r\n" + 
				"クロスプラットフォームのゲーム　（クロスプレイ）";
		String contentDetailsVIE_vot="Vọt là một trò chơi dành cho tất cả mọi người \r\n" + 
				"Vui vẻ, giải trí pha một tí hồi hợp\r\n" + 
				"Đa nền tảng";
		entity2.setTitleNameVIE(titleNameVIE_vot);
		entity2.setTitleNameENG(titleNameENG_vot);
		entity2.setTitleNameJPN(titleNameJPN_vot);
		entity2.setContentDetailsENG(contentDetailsENG_vot);
		entity2.setContentDetailsJPN(contentDetailsJPN_vot);
		entity2.setContentDetailsVIE(contentDetailsVIE_vot);
		entity2.setIdName("vot");
		contentRepository.save(entity2);
		
		ContentEntity entity3= new ContentEntity();
		String titleNameENG_revivedknight="Revived Knight";
		String titleNameVIE_revivedknight="Revived Knight" ;
		String titleNameJPN_revivedknight="Revived Knight";
		String contentDetailsJPN_revivedknight="陸地の暗い森に、ある城は他の世界に繋がれると言われた。そこにいる騎士が千年も寝坊したあとで、ようやく目覚めた。\r\n" + 
				"ゲーム形式：· 2D, Metroidvania.\r\n" + 
				"ボスとの戦いを通して主人公の記憶を取り戻す旅です。";
		String contentDetailsENG_revivedknight="In the dark forest of the continent, there is a castle rumored to be connected to another world. There, a knight who had been asleep for thousands of years awoke.\r\n" + 
				"Appearance: 2D, Metroidvania.\r\n" + 
				"The game will be a journey to regain memories through fierce battles with bosses.";
		String contentDetailsVIE_revivedknight="Trong khu rừng tối tăm của lục địa, có một lâu đài được đồn đại là kết nối với thế giới khác. Ở đó, một hiệp sĩ đã ngủ quên hàng ngàn năm đã tỉnh dậy.\r\n" + 
				"Hình thức: 2D, Metroidvania.\r\n" + 
				"Trò chơi sẽ là một hành trình tìm lại kí ức thông qua những trận chiến ác liệt với những con trùm.";
		entity3.setTitleNameVIE(titleNameVIE_revivedknight);
		entity3.setTitleNameENG(titleNameENG_revivedknight);
		entity3.setTitleNameJPN(titleNameJPN_revivedknight);
		entity3.setContentDetailsENG(contentDetailsENG_revivedknight);
		entity3.setContentDetailsJPN(contentDetailsJPN_revivedknight);
		entity3.setContentDetailsVIE(contentDetailsVIE_revivedknight);
		entity3.setIdName("revivedknight");
		contentRepository.save(entity3);
		
		ContentEntity entity4= new ContentEntity();
		String titleNameENG_soulhalo="Soul Halo";
		String titleNameVIE_soulhalo="Soul Halo" ;
		String titleNameJPN_soulhalo="Soul Halo";
		String contentDetailsJPN_soulhalo="SOUL HALO はRileyというキャラクターをめぐってアドベンチャー形式みたいの謎解きゲームである。\r\n" + 
				" ゲーム対象：16歳以上\r\n" + 
				"Rileyは少年少女の頃に起こった家族の衝撃で鬱病になってしまったイメージを持っている女子の高校生だ。\r\n" + 
				"そのため、元の明るく活発なRileyは短気で大人しくてコミュニケーションが苦手な女の子になった。\r\n" + 
				"SOUL HALOはRileyというキャラクターの元の自分自身に戻る旅だ。";
		String contentDetailsENG_soulhalo=" Soul Halo is a story game with a rotating puzzle adventure called Riley.\r\n" + 
				"For people aged 16 and above.\r\n" + 
				"Riley is a depiction of a high school girl suffering from social disorder as a result of early family shock, which had a great influence on her, turning her from a cheerful and lively girl into a person who was harsh and afraid of communication.\r\n" + 
				"\"Soul Halo\" is this girl's journey to find herself";
		String contentDetailsVIE_soulhalo="SOUL HALO là một tựa game cốt truyện với hình thức phiêu lưu giả đố xoay quay nhân vật có tên là Riley\r\n" + 
				"Phù hợp với lứa tuổi ≥16+\r\n" + 
				"Riley là hình ảnh một cô nữ sinh trung học bị chứng bệnh rối loạn xã hội vì một cú sốc của gia đình ở độ tuổi mới lớn.\r\n" + 
				"Nó đã gây ảnh hưởng không nhỏ biến cô từ một cô bé vui vẻ hoạt bát thành một người lầm lỳ cấu gắt và sợ giao tiếp.\r\n" + 
				"SOUL HALO chính là hành trình đi tìm lại bản thân của cô gái mang tên Riley này";
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