package com.laptrinhjavaweb.service;

import java.util.List;

import com.laptrinhjavaweb.api.DTO.ContentDTO;

public interface IContentService {
	List<ContentDTO> findAll_ENG();

	List<ContentDTO> findAll_VIE();

	List<ContentDTO> findAll_JPN();

}
