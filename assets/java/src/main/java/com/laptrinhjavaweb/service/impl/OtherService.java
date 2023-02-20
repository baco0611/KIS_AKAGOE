package com.laptrinhjavaweb.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laptrinhjavaweb.api.DTO.OtherDTO;
import com.laptrinhjavaweb.converter.OtherConverter;
import com.laptrinhjavaweb.entity.OtherEntity;
import com.laptrinhjavaweb.repository.OtherRepository;
import com.laptrinhjavaweb.service.IOtherService;

@Service
public class OtherService implements IOtherService {
	@Autowired
	private OtherConverter otherConverter;
	@Autowired
	private OtherRepository otherRepository;

	@Override
	public List<OtherDTO> findAll() {
		List<OtherDTO> results = new ArrayList<>();
		List<OtherEntity> entities = otherRepository.findAll();
		for (OtherEntity item : entities) {
			OtherDTO otherDTO = otherConverter.toDTO(item);
			results.add(otherDTO);
		}
		return results;
	}

	@Override
	public void updateOther() {
		OtherEntity entity1 = new OtherEntity();
		entity1.setIdName("akagoe");
		entity1.setName("Akagoe");
		entity1.setUrlImage("../assets/img/banner/akagoe_banner.png");
		entity1.setUrlPage("/akagoe/eng.html");
		OtherEntity entity2 = new OtherEntity();
		entity2.setIdName("soulhalo");
		entity2.setName("Soul Halo");
		entity2.setUrlImage("../assets/img/banner/soulhalo_banner.png");
		entity2.setUrlPage("/soulhalo/eng.html");
		OtherEntity entity3 = new OtherEntity();
		entity3.setIdName("vot");
		entity3.setName("Vot");
		entity3.setUrlImage("../assets/img/banner/vot_banner.png");
		entity3.setUrlPage("/vot/eng.html");
		OtherEntity entity4 = new OtherEntity();
		entity4.setIdName("revivedknight");
		entity4.setName("Revived Knight");
		entity4.setUrlImage("../assets/img/banner/revivedknight_banner.png");
		entity4.setUrlPage("/revivedknight/eng.html");
		otherRepository.save(entity1);
		otherRepository.save(entity2);
		otherRepository.save(entity3);
		otherRepository.save(entity4);
	}

}
