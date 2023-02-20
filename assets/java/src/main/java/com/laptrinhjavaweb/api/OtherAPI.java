package com.laptrinhjavaweb.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laptrinhjavaweb.output.OtherOutput;
import com.laptrinhjavaweb.service.IOtherService;

@CrossOrigin
@RestController
public class OtherAPI {
	@Autowired
	private IOtherService otherService;

	@GetMapping(value = "/other")
	public OtherOutput showLink() {
		OtherOutput result = new OtherOutput();
		result.setOther(otherService.findAll());
		return result;
	}
}
