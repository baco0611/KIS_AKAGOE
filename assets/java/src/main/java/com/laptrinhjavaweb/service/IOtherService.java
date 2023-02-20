package com.laptrinhjavaweb.service;

import java.util.List;

import com.laptrinhjavaweb.api.DTO.OtherDTO;

public interface IOtherService {
	List<OtherDTO> findAll();

	void updateOther();
}
