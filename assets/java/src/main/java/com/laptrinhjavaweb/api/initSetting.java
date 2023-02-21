package com.laptrinhjavaweb.api;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.laptrinhjavaweb.repository.BackgroundRepository;
import com.laptrinhjavaweb.repository.CharacterRepository;
import com.laptrinhjavaweb.repository.ContentRepository;
import com.laptrinhjavaweb.repository.ExploreRepository;
import com.laptrinhjavaweb.repository.OtherRepository;
import com.laptrinhjavaweb.service.IBackgroundService;
import com.laptrinhjavaweb.service.ICharacterService;
import com.laptrinhjavaweb.service.IContentService;
import com.laptrinhjavaweb.service.IExploreService;
import com.laptrinhjavaweb.service.IOtherService;

@Component
public class initSetting implements InitializingBean {
	@Autowired
	private CharacterRepository characterRepository;
	@Autowired
	private ICharacterService characterService;
	@Autowired
	private ContentRepository contentRepository;
	@Autowired
	private IContentService contentService;
	@Autowired
	private ExploreRepository exploreRepository;
	@Autowired
	private IExploreService exploreService;
	@Autowired
	private BackgroundRepository backgroundRepository;
	@Autowired
	private IBackgroundService backgroundService;
	@Autowired
	private OtherRepository otherRepository;
	@Autowired
	private IOtherService otherService;

	@Override
	public void afterPropertiesSet() throws Exception {
		if (characterRepository.findAll() != null) {
			characterService.updateCharacter();
		}
		if (exploreRepository.findAll() != null) {
			exploreService.updateExplore();
		}
		if (contentRepository.findAll() != null) {
			contentService.updateIntroduce();
		}
		if (backgroundRepository.findAll() != null) {
			backgroundService.updateBackground();
		}
		if (otherRepository.findAll() != null) {
			otherService.updateOther();
		}
	}

}
