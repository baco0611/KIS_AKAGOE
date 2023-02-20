package com.laptrinhjavaweb.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laptrinhjavaweb.api.DTO.ExploreDTO;
import com.laptrinhjavaweb.converter.ExploreConverter;
import com.laptrinhjavaweb.entity.ExploreEntity;
import com.laptrinhjavaweb.repository.ExploreRepository;
import com.laptrinhjavaweb.service.IExploreService;

@Service
public class ExploreService implements IExploreService {
	@Autowired
	private ExploreRepository exploreRepository;

	@Autowired
	private ExploreConverter exploreConverter;

	@Override
	public List<ExploreDTO> findAll_ENG() {
		List<ExploreDTO> results = new ArrayList<>();
		List<ExploreEntity> entities = exploreRepository.findAll();
		for (ExploreEntity item : entities) {
			ExploreDTO exploreOutput = exploreConverter.toDTO_ENG(item);
			results.add(exploreOutput);
		}
		return results;
	}

	@Override
	public List<ExploreDTO> findAll_VIE() {
		List<ExploreDTO> results = new ArrayList<>();
		List<ExploreEntity> entities = exploreRepository.findAll();
		for (ExploreEntity item : entities) {
			ExploreDTO exploreOutput = exploreConverter.toDTO_VIE(item);
			results.add(exploreOutput);
		}
		return results;
	}

	@Override
	public List<ExploreDTO> findAll_JPN() {
		List<ExploreDTO> results = new ArrayList<>();
		List<ExploreEntity> entities = exploreRepository.findAll();
		for (ExploreEntity item : entities) {
			ExploreDTO exploreOutput = exploreConverter.toDTO_JPN(item);
			results.add(exploreOutput);
		}
		return results;
	}

	@Override
	public void updateExplore() {
		ExploreEntity entity1= new ExploreEntity();
		String contentExploreENG1="The neighborhood is inspired by Doraemon comics and suitable for children.";
		String contentExploreVIE1="Khu phố được lấy ý tưởng từ truyện tranh Doraemon và phù hợp với trẻ em.";
		String contentExploreJPN1="近所は「ドラえもん」の漫画に触発され、子供に適しています。";
		String imageLink1="../assets/img/akagoe/explore/Picture1.png";
		entity1.setContentExploreENG(contentExploreENG1);
		entity1.setContentExploreJPN(contentExploreJPN1);
		entity1.setContentExploreVIE(contentExploreVIE1);
		entity1.setImageLink(imageLink1);
		exploreRepository.save(entity1);
		ExploreEntity entity2= new ExploreEntity();
		String contentExploreENG2="Doing challenges in the neighborhood itself will form good habits in children.";
		String contentExploreVIE2="Thực hiện thử thách trên chính khu phố sẽ hình thành thói quen tốt cho trẻ em.";
		String contentExploreJPN2="近所でそのチャレンジをすることは、子どもたちの良い習慣になります。";
		String imageLink2="../assets/img/akagoe/explore/Picture2.png";
		entity2.setContentExploreENG(contentExploreENG2);
		entity2.setContentExploreJPN(contentExploreJPN2);
		entity2.setContentExploreVIE(contentExploreVIE2);
		entity2.setImageLink(imageLink2);
		exploreRepository.save(entity2);
		ExploreEntity entity3= new ExploreEntity();
		String contentExploreENG3="3D games will make children enjoy playing.";
		String contentExploreVIE3="Game 3D sẽ làm cho các em thích thú khi chơi.";
		String contentExploreJPN3="3D ゲームのは子供たちを楽しく遊ばせます。";
		String imageLink3="../assets/img/akagoe/explore/Picture3.png";
		entity3.setContentExploreENG(contentExploreENG3);
		entity3.setContentExploreJPN(contentExploreJPN3);
		entity3.setContentExploreVIE(contentExploreVIE3);
		entity3.setImageLink(imageLink3);
		exploreRepository.save(entity3);
		
		
	}
}
