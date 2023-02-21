package com.laptrinhjavaweb.service;

import java.util.List;

import com.laptrinhjavaweb.api.DTO.BackgroundDTO;

public interface IBackgroundService {
	List<BackgroundDTO> findByIdName(String idName);

	void updateBackground();
}
