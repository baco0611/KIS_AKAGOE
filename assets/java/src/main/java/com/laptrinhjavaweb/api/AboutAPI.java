package com.laptrinhjavaweb.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.laptrinhjavaweb.output.AboutOutput;
import com.laptrinhjavaweb.service.IContentService;

@CrossOrigin
@RestController
public class AboutAPI {
	@Autowired
	private IContentService contentService;

	@GetMapping(value = "/about/ENG/{idName}")
	public AboutOutput showAbout_ENG(@PathVariable("idName") String idName) {
		AboutOutput result = new AboutOutput();
		result.setListContent(contentService.findByIdName_ENG(idName));
		return result;
	}

	@GetMapping(value = "/about/VIE/{idName}")
	public AboutOutput showAbout_VIE(@PathVariable("idName") String idName) {
		AboutOutput result = new AboutOutput();
		result.setListContent(contentService.findByIdName_VIE(idName));
		return result;
	}

	@GetMapping(value = "/about/JPN/{idName}")
	public AboutOutput showAbout_JPN(@PathVariable("idName") String idName) {
		AboutOutput result = new AboutOutput();
		result.setListContent(contentService.findByIdName_JPN(idName));
		return result;
	}
}
