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
	public List<BackgroundDTO> findAll() {
		List<BackgroundDTO> results = new ArrayList<>();
		List<BackgroundEntity> entities = backgroundRepository.findAll();
		for (BackgroundEntity item : entities) {
			BackgroundDTO backgroundDTO = backgroundConverter.toDTO(item);
			results.add(backgroundDTO);
		}
		return results;
	}

	@Override
	public void updateBackground() {
		BackgroundEntity entity1 = new BackgroundEntity();
		entity1.setPageName("main");
		entity1.setImagelink("../assets/img/akagoe/header/headerBackground.png");
		BackgroundEntity entity2 = new BackgroundEntity();
		entity2.setPageName("introduce");
		entity2.setImagelink("../assets/img/akagoe/introduce/introduceBackground.png");
		BackgroundEntity entity3 = new BackgroundEntity();
		entity3.setPageName("explore");
		entity3.setImagelink("../assets/img/akagoe/explore/exploreBackground.png");
		BackgroundEntity entity4 = new BackgroundEntity();
		entity4.setPageName("character");
		entity4.setImagelink("#E08181");
		BackgroundEntity entity5 = new BackgroundEntity();
		entity5.setPageName("review");
		entity5.setImagelink("../assets/img/akagoe/review/Backgound.png");
		BackgroundEntity entity6 = new BackgroundEntity();
		entity6.setPageName("other");
		entity6.setImagelink("#6FB5CF");
		backgroundRepository.save(entity1);
		backgroundRepository.save(entity2);
		backgroundRepository.save(entity3);
		backgroundRepository.save(entity4);
		backgroundRepository.save(entity5);
		backgroundRepository.save(entity6);
		
	}

}
