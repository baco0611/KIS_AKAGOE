package com.laptrinhjavaweb.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.laptrinhjavaweb.output.BackgroundOutput;
import com.laptrinhjavaweb.service.IBackgroundService;

@CrossOrigin
@RestController
public class BackgroundAPI {
	@Autowired
	private IBackgroundService backgroundService;

	@GetMapping(value = "background/{idName}")
	public BackgroundOutput showLink(@PathVariable("idName") String idName) {
		BackgroundOutput result = new BackgroundOutput();
		result.setBackground(backgroundService.findByIdName(idName));
		if (idName.equals("akagoe")) {
			result.setNameOfGame("赤声\r\nChildren's Voices");
			result.setUrlDownLoad("./assets/file/akagoeSetup.exe\r\n");
		}
		if (idName.equals("vot")) {
			result.setNameOfGame("VỌT\r\nFunny Game");
			result.setUrlDownLoad("./assets/file/votSetup.exe\r\n");
		}
		if (idName.equals("soulhalo")) {
			result.setNameOfGame("SOUL HALO");
			result.setUrlDownLoad(" ");
		}
		if (idName.equals("revivedknight")) {
			result.setNameOfGame(" \r\n ");
			result.setUrlDownLoad("./assets/file/revivedKnightSetup.exe\r\n");
		}
		return result;
	}
}
