package com.laptrinhjavaweb.service;

import java.util.List;

import com.laptrinhjavaweb.api.DTO.ExploreDTO;

public interface IExploreService {
	List<ExploreDTO> findAll_ENG();

	List<ExploreDTO> findAll_VIE();

	List<ExploreDTO> findAll_JPN();

}
