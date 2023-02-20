package com.laptrinhjavaweb.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laptrinhjavaweb.output.AboutOutput;
import com.laptrinhjavaweb.service.IContentService;

@CrossOrigin
@RestController
public class AboutAPI {
	@Autowired
	private IContentService contentService;

	@GetMapping(value = "akagoe/about/ENG")
	public AboutOutput showAbout_ENG() {
		AboutOutput result = new AboutOutput();
		result.setListContent(contentService.findAll_ENG());
		return result;
	}

	@GetMapping(value = "akagoe/about/VIE")
	public AboutOutput showAbout_VIE() {
		AboutOutput result = new AboutOutput();
		result.setListContent(contentService.findAll_VIE());
		return result;
	}

	@GetMapping(value = "akagoe/about/JPN")
	public AboutOutput showAbout_JPN() {
		AboutOutput result = new AboutOutput();
		result.setListContent(contentService.findAll_JPN());
		return result;
	}
}
