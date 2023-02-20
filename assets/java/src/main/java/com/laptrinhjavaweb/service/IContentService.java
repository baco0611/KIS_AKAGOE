package com.laptrinhjavaweb.service;

import java.util.List;

import com.laptrinhjavaweb.api.DTO.ContentDTO;

public interface IContentService {
	List<ContentDTO> findByIdName_ENG(String idName);

	List<ContentDTO> findByIdName_VIE(String idName);

	List<ContentDTO> findByIdName_JPN(String idName);

	void updateIntroduce();

}
