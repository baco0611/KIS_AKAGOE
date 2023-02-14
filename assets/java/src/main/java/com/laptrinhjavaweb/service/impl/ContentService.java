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
}
