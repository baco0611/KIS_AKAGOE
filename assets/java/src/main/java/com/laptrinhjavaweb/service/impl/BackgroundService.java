package com.laptrinhjavaweb.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laptrinhjavaweb.api.DTO.BackgroundDTO;
import com.laptrinhjavaweb.converter.BackgroundConverter;
import com.laptrinhjavaweb.entity.BackgroundEntity;
import com.laptrinhjavaweb.repository.BackgroundRepository;
import com.laptrinhjavaweb.service.IBackgroundService;

@Service
public class BackgroundService implements IBackgroundService {
	@Autowired
	private BackgroundConverter backgroundConverter;
	@Autowired
	private BackgroundRepository backgroundRepository;

	@Override
	public List<BackgroundDTO> findByIdName(String idName) {
		List<BackgroundDTO> results = new ArrayList<>();
		List<BackgroundEntity> entities = backgroundRepository.findByIdName(idName);
		for (BackgroundEntity item : entities) {
			BackgroundDTO backgroundDTO = backgroundConverter.toDTO(item);
			results.add(backgroundDTO);
		}
		return results;
	}

	@Override
	public void updateBackground() {
		BackgroundEntity entity1_akagoe = new BackgroundEntity();
		entity1_akagoe.setPageName("main");
		entity1_akagoe.setImagelink("../assets/img/akagoe/header/headerBackground.png");
		entity1_akagoe.setIdName("akagoe");
		BackgroundEntity entity2_akagoe = new BackgroundEntity();
		entity2_akagoe.setPageName("introduce");
		entity2_akagoe.setImagelink("../assets/img/akagoe/introduce/introduceBackground.png");
		entity2_akagoe.setIdName("akagoe");
		BackgroundEntity entity3_akagoe = new BackgroundEntity();
		entity3_akagoe.setPageName("explore");
		entity3_akagoe.setImagelink("../assets/img/akagoe/explore/exploreBackground.png");
		entity3_akagoe.setIdName("akagoe");
		BackgroundEntity entity4_akagoe = new BackgroundEntity();
		entity4_akagoe.setPageName("character");
		entity4_akagoe.setImagelink("#E08181");
		entity4_akagoe.setIdName("akagoe");
		BackgroundEntity entity5_akagoe = new BackgroundEntity();
		entity5_akagoe.setPageName("review");
		entity5_akagoe.setImagelink("../assets/img/akagoe/review/Backgound.png");
		entity5_akagoe.setIdName("akagoe");
		BackgroundEntity entity6_akagoe = new BackgroundEntity();
		entity6_akagoe.setPageName("other");
		entity6_akagoe.setImagelink("#6FB5CF");
		entity6_akagoe.setIdName("akagoe");
		backgroundRepository.save(entity1_akagoe);
		backgroundRepository.save(entity2_akagoe);
		backgroundRepository.save(entity3_akagoe);
		backgroundRepository.save(entity4_akagoe);
		backgroundRepository.save(entity5_akagoe);
		backgroundRepository.save(entity6_akagoe);
		
		BackgroundEntity entity1_vot = new BackgroundEntity();
		entity1_vot.setPageName("main");
		entity1_vot.setImagelink("../assets/img/vot/header/headerBackground.png");
		entity1_vot.setIdName("vot");
		BackgroundEntity entity2_vot = new BackgroundEntity();
		entity2_vot.setPageName("introduce");
		entity2_vot.setImagelink("../assets/img/vot/introduce/introduceBackground.png");
		entity2_vot.setIdName("vot");
		BackgroundEntity entity3_vot = new BackgroundEntity();
		entity3_vot.setPageName("explore");
		entity3_vot.setImagelink("../assets/img/vot/explore/exploreBackground.png");
		entity3_vot.setIdName("vot");
		BackgroundEntity entity4_vot = new BackgroundEntity();
		entity4_vot.setPageName("character");
		entity4_vot.setImagelink("#E08181");
		entity4_vot.setIdName("vot");
		BackgroundEntity entity5_vot = new BackgroundEntity();
		entity5_vot.setPageName("review");
		entity5_vot.setImagelink("../assets/img/vot/review/Backgound.png");
		entity5_vot.setIdName("vot");
		BackgroundEntity entity6_vot = new BackgroundEntity();
		entity6_vot.setPageName("other");
		entity6_vot.setImagelink("#6FB5CF");
		entity6_vot.setIdName("vot");
		backgroundRepository.save(entity1_vot);
		backgroundRepository.save(entity2_vot);
		backgroundRepository.save(entity3_vot);
		backgroundRepository.save(entity4_vot);
		backgroundRepository.save(entity5_vot);
		backgroundRepository.save(entity6_vot);
		
		BackgroundEntity entity1_soulhalo = new BackgroundEntity();
		entity1_soulhalo.setPageName("main");
		entity1_soulhalo.setImagelink("../assets/img/soulhalo/header/headerBackground.png");
		entity1_soulhalo.setIdName("soulhalo");
		BackgroundEntity entity2_soulhalo = new BackgroundEntity();
		entity2_soulhalo.setPageName("introduce");
		entity2_soulhalo.setImagelink("../assets/img/soulhalo/introduce/introduceBackground.png");
		entity2_soulhalo.setIdName("soulhalo");
		BackgroundEntity entity3_soulhalo = new BackgroundEntity();
		entity3_soulhalo.setPageName("explore");
		entity3_soulhalo.setImagelink("../assets/img/soulhalo/explore/exploreBackground.png");
		entity3_soulhalo.setIdName("soulhalo");
		BackgroundEntity entity4_soulhalo = new BackgroundEntity();
		entity4_soulhalo.setPageName("character");
		entity4_soulhalo.setImagelink("../assets/img/soulhalo/character/characterBackground.png");
		entity4_soulhalo.setIdName("soulhalo");
		BackgroundEntity entity5_soulhalo = new BackgroundEntity();
		entity5_soulhalo.setPageName("review");
		entity5_soulhalo.setImagelink("../assets/img/soulhalo/review/Backgound.png");
		entity5_soulhalo.setIdName("soulhalo");
		BackgroundEntity entity6_soulhalo = new BackgroundEntity();
		entity6_soulhalo.setPageName("other");
		entity6_soulhalo.setImagelink("#88b7b7");
		entity6_soulhalo.setIdName("soulhalo");
		backgroundRepository.save(entity1_soulhalo);
		backgroundRepository.save(entity2_soulhalo);
		backgroundRepository.save(entity3_soulhalo);
		backgroundRepository.save(entity4_soulhalo);
		backgroundRepository.save(entity5_soulhalo);
		backgroundRepository.save(entity6_soulhalo);
		
		BackgroundEntity entity1_revivedknight = new BackgroundEntity();
		entity1_revivedknight.setPageName("main");
		entity1_revivedknight.setImagelink("../assets/img/revivedknight/header/headerBackground.png");
		entity1_revivedknight.setIdName("revivedknight");
		BackgroundEntity entity2_revivedknight = new BackgroundEntity();
		entity2_revivedknight.setPageName("introduce");
		entity2_revivedknight.setImagelink("../assets/img/revivedknight/introduce/introduceBackground.png");
		entity2_revivedknight.setIdName("revivedknight");
		BackgroundEntity entity3_revivedknight = new BackgroundEntity();
		entity3_revivedknight.setPageName("explore");
		entity3_revivedknight.setImagelink("../assets/img/revivedknight/explore/exploreBackground.png");
		entity3_revivedknight.setIdName("revivedknight");
		BackgroundEntity entity4_revivedknight = new BackgroundEntity();
		entity4_revivedknight.setPageName("character");
		entity4_revivedknight.setImagelink("#E08181");
		entity4_revivedknight.setIdName("revivedknight");
		BackgroundEntity entity5_revivedknight = new BackgroundEntity();
		entity5_revivedknight.setPageName("review");
		entity5_revivedknight.setImagelink("../assets/img/revivedknight/review/Backgound.png");
		entity5_revivedknight.setIdName("revivedknight");
		BackgroundEntity entity6_revivedknight = new BackgroundEntity();
		entity6_revivedknight.setPageName("other");
		entity6_revivedknight.setImagelink("#6FB5CF");
		entity6_revivedknight.setIdName("revivedknight");
		backgroundRepository.save(entity1_revivedknight);
		backgroundRepository.save(entity2_revivedknight);
		backgroundRepository.save(entity3_revivedknight);
		backgroundRepository.save(entity4_revivedknight);
		backgroundRepository.save(entity5_revivedknight);
		backgroundRepository.save(entity6_revivedknight);
		
	}

}
