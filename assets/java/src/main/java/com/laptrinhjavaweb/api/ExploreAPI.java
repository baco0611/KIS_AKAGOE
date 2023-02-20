package com.laptrinhjavaweb.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.laptrinhjavaweb.output.ExploreOutput;
import com.laptrinhjavaweb.service.IExploreService;

@CrossOrigin
@RestController
public class ExploreAPI {
	@Autowired
	private IExploreService exploreService;

	@GetMapping(value = "/explore/ENG/{idName}")
	public ExploreOutput showExplore_ENG(@PathVariable("idName") String idName) {
		ExploreOutput result = new ExploreOutput();
		result.setListResult(exploreService.findByIdName_ENG(idName));
		return result;
	}

	@GetMapping(value = "/explore/VIE/{idName}")
	public ExploreOutput showExplore_VIE(@PathVariable("idName") String idName) {
		ExploreOutput result = new ExploreOutput();
		result.setListResult(exploreService.findByIdName_VIE(idName));
		return result;
	}

	@GetMapping(value = "/explore/JPN/{idName}")
	public ExploreOutput showExplore_JPN(@PathVariable("idName") String idName) {
		ExploreOutput result = new ExploreOutput();
		result.setListResult(exploreService.findByIdName_JPN(idName));
		return result;
	}
}
