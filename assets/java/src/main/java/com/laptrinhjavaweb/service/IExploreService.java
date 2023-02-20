package com.laptrinhjavaweb.service;

import java.util.List;

import com.laptrinhjavaweb.api.DTO.ExploreDTO;

public interface IExploreService {
	List<ExploreDTO> findByIdName_ENG(String idName);

	List<ExploreDTO> findByIdName_VIE(String idName);

	List<ExploreDTO> findByIdName_JPN(String idName);

	void updateExplore();
}
