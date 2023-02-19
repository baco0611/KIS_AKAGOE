package com.laptrinhjavaweb.output;

import java.util.ArrayList;
import java.util.List;

import com.laptrinhjavaweb.api.DTO.BackgroundDTO;

public class BackgroundOutput {
	private List<BackgroundDTO> background = new ArrayList<>();
	private String nameOfGame ;
	private String urlDownLoad;

	public String getNameOfGame() {
		return nameOfGame;
	}

	public void setNameOfGame(String nameOfGame) {
		this.nameOfGame = nameOfGame;
	}

	public String getUrlDownLoad() {
		return urlDownLoad;
	}

	public void setUrlDownLoad(String urlDownLoad) {
		this.urlDownLoad = urlDownLoad;
	}

	public List<BackgroundDTO> getBackground() {
		return background;
	}

	public void setBackground(List<BackgroundDTO> background) {
		this.background = background;
	}

	
}
