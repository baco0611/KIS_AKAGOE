package com.laptrinhjavaweb.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laptrinhjavaweb.api.DTO.ExploreDTO;
import com.laptrinhjavaweb.converter.ExploreConverter;
import com.laptrinhjavaweb.entity.ExploreEntity;
import com.laptrinhjavaweb.repository.ExploreRepository;
import com.laptrinhjavaweb.service.IExploreService;

@Service
public class ExploreService implements IExploreService {
	@Autowired
	private ExploreRepository exploreRepository;

	@Autowired
	private ExploreConverter exploreConverter;

	@Override
	public List<ExploreDTO> findByIdName_ENG(String idName) {
		List<ExploreDTO> results = new ArrayList<>();
		List<ExploreEntity> entities = exploreRepository.findByIdName(idName);
		for (ExploreEntity item : entities) {
			ExploreDTO exploreOutput = exploreConverter.toDTO_ENG(item);
			results.add(exploreOutput);
		}
		return results;
	}

	@Override
	public List<ExploreDTO> findByIdName_VIE(String idName) {
		List<ExploreDTO> results = new ArrayList<>();
		List<ExploreEntity> entities = exploreRepository.findByIdName(idName);
		for (ExploreEntity item : entities) {
			ExploreDTO exploreOutput = exploreConverter.toDTO_VIE(item);
			results.add(exploreOutput);
		}
		return results;
	}

	@Override
	public List<ExploreDTO> findByIdName_JPN(String idName) {
		List<ExploreDTO> results = new ArrayList<>();
		List<ExploreEntity> entities = exploreRepository.findByIdName(idName);
		for (ExploreEntity item : entities) {
			ExploreDTO exploreOutput = exploreConverter.toDTO_JPN(item);
			results.add(exploreOutput);
		}
		return results;
	}

	@Override
	public void updateExplore() {
		ExploreEntity entity1_akagoe= new ExploreEntity();
		String contentExploreENG1_akagoe="The neighborhood is inspired by Doraemon comics and suitable for children.";
		String contentExploreVIE1_akagoe="Khu phố được lấy ý tưởng từ truyện tranh Doraemon và phù hợp với trẻ em.";
		String contentExploreJPN1_akagoe="近所は「ドラえもん」の漫画に触発され、子供に適しています。";
		String imageLink1_akagoe="../assets/img/akagoe/explore/Picture1.png";
		entity1_akagoe.setContentExploreENG(contentExploreENG1_akagoe);
		entity1_akagoe.setContentExploreJPN(contentExploreJPN1_akagoe);
		entity1_akagoe.setContentExploreVIE(contentExploreVIE1_akagoe);
		entity1_akagoe.setImageLink(imageLink1_akagoe);
		entity1_akagoe.setIdName("akagoe");
		exploreRepository.save(entity1_akagoe);
		ExploreEntity entity2_akagoe= new ExploreEntity();
		String contentExploreENG2_akagoe="Doing challenges in the neighborhood itself will form good habits in children.";
		String contentExploreVIE2_akagoe="Thực hiện thử thách trên chính khu phố sẽ hình thành thói quen tốt cho trẻ em.";
		String contentExploreJPN2_akagoe="近所でそのチャレンジをすることは、子どもたちの良い習慣になります。";
		String imageLink2_akagoe="../assets/img/akagoe/explore/Picture2.png";
		entity2_akagoe.setContentExploreENG(contentExploreENG2_akagoe);
		entity2_akagoe.setContentExploreJPN(contentExploreJPN2_akagoe);
		entity2_akagoe.setContentExploreVIE(contentExploreVIE2_akagoe);
		entity2_akagoe.setImageLink(imageLink2_akagoe);
		entity2_akagoe.setIdName("akagoe");
		exploreRepository.save(entity2_akagoe);
		ExploreEntity entity3_akagoe= new ExploreEntity();
		String contentExploreENG3_akagoe="3D games will make children enjoy playing.";
		String contentExploreVIE3_akagoe="Game 3D sẽ làm cho các em thích thú khi chơi.";
		String contentExploreJPN3_akagoe="3D ゲームのは子供たちを楽しく遊ばせます。";
		String imageLink3_akagoe="../assets/img/akagoe/explore/Picture3.png";
		entity3_akagoe.setContentExploreENG(contentExploreENG3_akagoe);
		entity3_akagoe.setContentExploreJPN(contentExploreJPN3_akagoe);
		entity3_akagoe.setContentExploreVIE(contentExploreVIE3_akagoe);
		entity3_akagoe.setImageLink(imageLink3_akagoe);
		entity3_akagoe.setIdName("akagoe");
		exploreRepository.save(entity3_akagoe);
		
		ExploreEntity entity1_vot= new ExploreEntity();
		String contentExploreENG1_vot="A colorful 2D world";
		String contentExploreVIE1_vot="Một thế giới 2D đầy màu sắc";
		String contentExploreJPN1_vot="色とりどりの２D世界";
		String imageLink1_vot="../assets/img/vot/explore/Picture1.png";
		entity1_vot.setContentExploreENG(contentExploreENG1_vot);
		entity1_vot.setContentExploreJPN(contentExploreJPN1_vot);
		entity1_vot.setContentExploreVIE(contentExploreVIE1_vot);
		entity1_vot.setImageLink(imageLink1_vot);
		entity1_vot.setIdName("vot");
		exploreRepository.save(entity1_vot);
		ExploreEntity entity2_vot= new ExploreEntity();
		String contentExploreENG2_vot="A collection of adorable 2D characters";
		String contentExploreVIE2_vot="Sự đa dạng về nhân vật 2D dễ thương";
		String contentExploreJPN2_vot="様々な可愛くキャラクター";
		String imageLink2_vot="../assets/img/vot/explore/Picture2.png";
		entity2_vot.setContentExploreENG(contentExploreENG2_vot);
		entity2_vot.setContentExploreJPN(contentExploreJPN2_vot);
		entity2_vot.setContentExploreVIE(contentExploreVIE2_vot);
		entity2_vot.setImageLink(imageLink2_vot);
		entity2_vot.setIdName("vot");
		exploreRepository.save(entity2_vot);
		ExploreEntity entity3_vot= new ExploreEntity();
		String contentExploreENG3_vot="A fun, relaxing, and a little suspenseful way";
		String contentExploreVIE3_vot="Một lối vui vẻ,thư giản và pha một chút hồi hợp";
		String contentExploreJPN3_vot="やり方がリラックスで、楽しく、少しのサスペンスが入る";
		String imageLink3_vot="../assets/img/vot/explore/Picture3.png";
		entity3_vot.setContentExploreENG(contentExploreENG3_vot);
		entity3_vot.setContentExploreJPN(contentExploreJPN3_vot);
		entity3_vot.setContentExploreVIE(contentExploreVIE3_vot);
		entity3_vot.setImageLink(imageLink3_vot);
		entity3_vot.setIdName("vot");
		exploreRepository.save(entity3_vot);
		
		ExploreEntity entity1_soulhalo= new ExploreEntity();
		String contentExploreENG1_soulhalo="The game is based on the story of Riley, a young girl.";
		String contentExploreVIE1_soulhalo="Game được xây dựng dựa trên chính câu chuyện của cô bé Riley";
		String contentExploreJPN1_soulhalo="Rileyの物語に基づいて作られたゲームだ。";
		String imageLink1_soulhalo="../assets/img/soulhalo/explore/Picture1.png";
		entity1_soulhalo.setContentExploreENG(contentExploreENG1_soulhalo);
		entity1_soulhalo.setContentExploreJPN(contentExploreJPN1_soulhalo);
		entity1_soulhalo.setContentExploreVIE(contentExploreVIE1_soulhalo);
		entity1_soulhalo.setImageLink(imageLink1_soulhalo);
		entity1_soulhalo.setIdName("soulhalo");
		exploreRepository.save(entity1_soulhalo);
		ExploreEntity entity2_soulhalo= new ExploreEntity();
		String contentExploreENG2_soulhalo="On the journey to find fun, the character must overcome difficult challenges.";
		String contentExploreVIE2_soulhalo="Trên hành trình tìm kiếm sự vui vẻ, nhân vật phải vượt quá các thử thách khó khăn";
		String contentExploreJPN2_soulhalo="楽しみを求める間に困難なチャレンジを乗り越えないといけない。";
		String imageLink2_soulhalo="../assets/img/soulhalo/explore/Picture2.png";
		entity2_soulhalo.setContentExploreENG(contentExploreENG2_soulhalo);
		entity2_soulhalo.setContentExploreJPN(contentExploreJPN2_soulhalo);
		entity2_soulhalo.setContentExploreVIE(contentExploreVIE2_soulhalo);
		entity2_soulhalo.setImageLink(imageLink2_soulhalo);
		entity2_soulhalo.setIdName("soulhalo");
		exploreRepository.save(entity2_soulhalo);
		ExploreEntity entity3_soulhalo= new ExploreEntity();
		String contentExploreENG3_soulhalo="The codes are difficult and require players to solve them to continue the journey.";
		String contentExploreVIE3_soulhalo="Những mật mã khó và bắt buộc người chơi phải giải để tiếp tục hành trình";
		String contentExploreJPN3_soulhalo="プレイヤーは次のレベルに進められるために、難しいコードを解く必要がある場合も出る。";
		String imageLink3_soulhalo="../assets/img/soulhalo/explore/Picture3.png";
		entity3_soulhalo.setContentExploreENG(contentExploreENG3_soulhalo);
		entity3_soulhalo.setContentExploreJPN(contentExploreJPN3_soulhalo);
		entity3_soulhalo.setContentExploreVIE(contentExploreVIE3_soulhalo);
		entity3_soulhalo.setImageLink(imageLink3_soulhalo);
		entity3_soulhalo.setIdName("soulhalo");
		exploreRepository.save(entity3_soulhalo);
		
		ExploreEntity entity1_revivedknight= new ExploreEntity();
		String contentExploreENG1_revivedknight="The game's setting is fantasy-themed with a medieval undertone.";
		String contentExploreVIE1_revivedknight="Bối cảnh game được xây dựng theo thiên hướng fantasy và một chút trung cổ.";
		String contentExploreJPN1_revivedknight="ゲームのコンテキストは、ファンタジー と少し中世スタイルを含まれて構成されています。";
		String imageLink1_revivedknight="../assets/img/revivedknight/explore/Picture1.png";
		entity1_revivedknight.setContentExploreENG(contentExploreENG1_revivedknight);
		entity1_revivedknight.setContentExploreJPN(contentExploreJPN1_revivedknight);
		entity1_revivedknight.setContentExploreVIE(contentExploreVIE1_revivedknight);
		entity1_revivedknight.setImageLink(imageLink1_revivedknight);
		entity1_revivedknight.setIdName("revivedknight");
		exploreRepository.save(entity1_revivedknight);
		ExploreEntity entity2_revivedknight= new ExploreEntity();
		String contentExploreENG2_revivedknight="Beautiful landscapes and melodious music will make players satisfied with what they want in a game.";
		String contentExploreVIE2_revivedknight="Những phong cảnh đẹp cùng âm nhạc du dương sẽ khiến người chơi thỏa mãn những gì họ muốn ở một tựa game.";
		String contentExploreJPN2_revivedknight="美しい風景と素敵な音楽は、プレイヤーを満足させます。";
		String imageLink2_revivedknight="../assets/img/revivedknight/explore/Picture2.png";
		entity2_revivedknight.setContentExploreENG(contentExploreENG2_revivedknight);
		entity2_revivedknight.setContentExploreJPN(contentExploreJPN2_revivedknight);
		entity2_revivedknight.setContentExploreVIE(contentExploreVIE2_revivedknight);
		entity2_revivedknight.setImageLink(imageLink2_revivedknight);
		entity2_revivedknight.setIdName("revivedknight");
		exploreRepository.save(entity2_revivedknight);
		ExploreEntity entity3_revivedknight= new ExploreEntity();
		String contentExploreENG3_revivedknight="Battling bosses with unique skills will be a difficult challenge for players.";
		String contentExploreVIE3_revivedknight="Trận chiến với những con trùm với kĩ năng độc đáo sẽ là một thử thách khó khăn với người chơi.";
		String contentExploreJPN3_revivedknight="特別なスキルを持つボスとの戦いを通して、プレイヤーにとって難しい挑戦となります。";
		String imageLink3_revivedknight="../assets/img/revivedknight/explore/Picture3.png";
		entity3_revivedknight.setContentExploreENG(contentExploreENG3_revivedknight);
		entity3_revivedknight.setContentExploreJPN(contentExploreJPN3_revivedknight);
		entity3_revivedknight.setContentExploreVIE(contentExploreVIE3_revivedknight);
		entity3_revivedknight.setImageLink(imageLink3_revivedknight);
		entity3_revivedknight.setIdName("revivedknight");
		exploreRepository.save(entity3_revivedknight);
	}
}