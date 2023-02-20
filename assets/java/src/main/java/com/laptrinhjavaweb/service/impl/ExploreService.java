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
		String contentExploreENG1_vot="vot";
		String contentExploreVIE1_vot="vot1";
		String contentExploreJPN1_vot="vot2";
		String imageLink1_vot="../assets/img/akagoe/explore/Picture1.png";
		entity1_vot.setContentExploreENG(contentExploreENG1_vot);
		entity1_vot.setContentExploreJPN(contentExploreJPN1_vot);
		entity1_vot.setContentExploreVIE(contentExploreVIE1_vot);
		entity1_vot.setImageLink(imageLink1_vot);
		entity1_vot.setIdName("vot");
		exploreRepository.save(entity1_vot);
		ExploreEntity entity2_vot= new ExploreEntity();
		String contentExploreENG2_vot="vot3";
		String contentExploreVIE2_vot="vot4";
		String contentExploreJPN2_vot="vot5";
		String imageLink2_vot="../assets/img/akagoe/explore/Picture2.png";
		entity2_vot.setContentExploreENG(contentExploreENG2_vot);
		entity2_vot.setContentExploreJPN(contentExploreJPN2_vot);
		entity2_vot.setContentExploreVIE(contentExploreVIE2_vot);
		entity2_vot.setImageLink(imageLink2_vot);
		entity2_vot.setIdName("vot");
		exploreRepository.save(entity2_vot);
		ExploreEntity entity3_vot= new ExploreEntity();
		String contentExploreENG3_vot="vot6";
		String contentExploreVIE3_vot="vot7";
		String contentExploreJPN3_vot="vot8";
		String imageLink3_vot="../assets/img/akagoe/explore/Picture3.png";
		entity3_vot.setContentExploreENG(contentExploreENG3_vot);
		entity3_vot.setContentExploreJPN(contentExploreJPN3_vot);
		entity3_vot.setContentExploreVIE(contentExploreVIE3_vot);
		entity3_vot.setImageLink(imageLink3_vot);
		entity3_vot.setIdName("vot");
		exploreRepository.save(entity3_vot);
		
		ExploreEntity entity1_soulhalo= new ExploreEntity();
		String contentExploreENG1_soulhalo="halo";
		String contentExploreVIE1_soulhalo="halo1";
		String contentExploreJPN1_soulhalo="halo2";
		String imageLink1_soulhalo="../assets/img/akagoe/explore/Picture1.png";
		entity1_soulhalo.setContentExploreENG(contentExploreENG1_soulhalo);
		entity1_soulhalo.setContentExploreJPN(contentExploreJPN1_soulhalo);
		entity1_soulhalo.setContentExploreVIE(contentExploreVIE1_soulhalo);
		entity1_soulhalo.setImageLink(imageLink1_soulhalo);
		entity1_soulhalo.setIdName("soulhalo");
		exploreRepository.save(entity1_soulhalo);
		ExploreEntity entity2_soulhalo= new ExploreEntity();
		String contentExploreENG2_soulhalo="halo3";
		String contentExploreVIE2_soulhalo="halo4";
		String contentExploreJPN2_soulhalo="halo5";
		String imageLink2_soulhalo="../assets/img/akagoe/explore/Picture1.png";
		entity2_soulhalo.setContentExploreENG(contentExploreENG2_soulhalo);
		entity2_soulhalo.setContentExploreJPN(contentExploreJPN2_soulhalo);
		entity2_soulhalo.setContentExploreVIE(contentExploreVIE2_soulhalo);
		entity2_soulhalo.setImageLink(imageLink2_soulhalo);
		entity2_soulhalo.setIdName("soulhalo");
		exploreRepository.save(entity2_soulhalo);
		ExploreEntity entity3_soulhalo= new ExploreEntity();
		String contentExploreENG3_soulhalo="halo6";
		String contentExploreVIE3_soulhalo="halo7";
		String contentExploreJPN3_soulhalo="halo8";
		String imageLink3_soulhalo="../assets/img/akagoe/explore/Picture1.png";
		entity3_soulhalo.setContentExploreENG(contentExploreENG3_soulhalo);
		entity3_soulhalo.setContentExploreJPN(contentExploreJPN3_soulhalo);
		entity3_soulhalo.setContentExploreVIE(contentExploreVIE3_soulhalo);
		entity3_soulhalo.setImageLink(imageLink3_soulhalo);
		entity3_soulhalo.setIdName("soulhalo");
		exploreRepository.save(entity3_soulhalo);
		
		ExploreEntity entity1_revivedknight= new ExploreEntity();
		String contentExploreENG1_revivedknight="night";
		String contentExploreVIE1_revivedknight="night1";
		String contentExploreJPN1_revivedknight="night2";
		String imageLink1_revivedknight="../assets/img/akagoe/explore/Picture1.png";
		entity1_revivedknight.setContentExploreENG(contentExploreENG1_revivedknight);
		entity1_revivedknight.setContentExploreJPN(contentExploreJPN1_revivedknight);
		entity1_revivedknight.setContentExploreVIE(contentExploreVIE1_revivedknight);
		entity1_revivedknight.setImageLink(imageLink1_revivedknight);
		entity1_revivedknight.setIdName("revivedknight");
		exploreRepository.save(entity1_revivedknight);
		ExploreEntity entity2_revivedknight= new ExploreEntity();
		String contentExploreENG2_revivedknight="night3";
		String contentExploreVIE2_revivedknight="night4";
		String contentExploreJPN2_revivedknight="night5";
		String imageLink2_revivedknight="../assets/img/akagoe/explore/Picture1.png";
		entity2_revivedknight.setContentExploreENG(contentExploreENG2_revivedknight);
		entity2_revivedknight.setContentExploreJPN(contentExploreJPN2_revivedknight);
		entity2_revivedknight.setContentExploreVIE(contentExploreVIE2_revivedknight);
		entity2_revivedknight.setImageLink(imageLink2_revivedknight);
		entity2_revivedknight.setIdName("revivedknight");
		exploreRepository.save(entity2_revivedknight);
		ExploreEntity entity3_revivedknight= new ExploreEntity();
		String contentExploreENG3_revivedknight="night6";
		String contentExploreVIE3_revivedknight="night7";
		String contentExploreJPN3_revivedknight="night8";
		String imageLink3_revivedknight="../assets/img/akagoe/explore/Picture1.png";
		entity3_revivedknight.setContentExploreENG(contentExploreENG3_revivedknight);
		entity3_revivedknight.setContentExploreJPN(contentExploreJPN3_revivedknight);
		entity3_revivedknight.setContentExploreVIE(contentExploreVIE3_revivedknight);
		entity3_revivedknight.setImageLink(imageLink3_revivedknight);
		entity3_revivedknight.setIdName("revivedknight");
		exploreRepository.save(entity3_revivedknight);
	}
}
