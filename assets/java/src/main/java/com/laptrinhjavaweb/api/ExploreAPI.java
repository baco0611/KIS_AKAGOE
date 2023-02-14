package com.laptrinhjavaweb.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laptrinhjavaweb.output.ExploreOutput;
import com.laptrinhjavaweb.service.IExploreService;

@CrossOrigin
@RestController
public class ExploreAPI {
	@Autowired
	private IExploreService exploreService;

	@GetMapping(value = "/explore/ENG")
	public ExploreOutput showExplore_ENG() {
		ExploreOutput result = new ExploreOutput();
		result.setListResult(exploreService.findAll_ENG());
		return result;
	}

	@GetMapping(value = "/explore/VIE")
	public ExploreOutput showExplore_VIE() {
		ExploreOutput result = new ExploreOutput();
		result.setListResult(exploreService.findAll_ENG());
		return result;
	}

	@GetMapping(value = "/explore/JPN")
	public ExploreOutput showExplore_JPN() {
		ExploreOutput result = new ExploreOutput();
		result.setListResult(exploreService.findAll_JPN());
		return result;
	}
}
