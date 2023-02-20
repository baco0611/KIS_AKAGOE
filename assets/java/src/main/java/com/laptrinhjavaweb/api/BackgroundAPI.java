package com.laptrinhjavaweb.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laptrinhjavaweb.output.BackgroundOutput;
import com.laptrinhjavaweb.service.IBackgroundService;

@CrossOrigin
@RestController
public class BackgroundAPI {
	@Autowired
	private IBackgroundService backgroundService;

	@GetMapping(value = "akagoe/background")
	public BackgroundOutput showLink() {
		BackgroundOutput result = new BackgroundOutput();
		result.setBackground(backgroundService.findAll());
		result.setNameOfGame("赤声\r\nChildren's Voices");
		result.setUrlDownLoad("./assets/file/setup.exe\r\n");
		return result;
	}
}
