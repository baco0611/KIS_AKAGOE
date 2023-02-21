package com.laptrinhjavaweb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.laptrinhjavaweb.entity.FeedbackEntity;

public interface FeedbackRepository extends JpaRepository<FeedbackEntity, Long> {
	@Query("FROM FeedbackEntity WHERE idName='akagoe' ORDER BY time ASC")
	List<FeedbackEntity> findAllOrderByTimeAsc_akagoe();
	@Query("FROM FeedbackEntity WHERE idName='vot' ORDER BY time ASC")
	List<FeedbackEntity> findAllOrderByTimeAsc_vot();
	@Query("FROM FeedbackEntity WHERE idName='soulhalo' ORDER BY time ASC")
	List<FeedbackEntity> findAllOrderByTimeAsc_soulhalo();
	@Query("FROM FeedbackEntity WHERE idName='revivedknight' ORDER BY time ASC")
	List<FeedbackEntity> findAllOrderByTimeAsc_revivedknight();

	@Query("FROM FeedbackEntity WHERE idName='akagoe' ORDER BY star ASC")
	List<FeedbackEntity> findAllOrderByStarAsc_akagoe();
	@Query("FROM FeedbackEntity WHERE idName='vot' ORDER BY star ASC")
	List<FeedbackEntity> findAllOrderByStarAsc_vot();
	@Query("FROM FeedbackEntity WHERE idName='soulhalo' ORDER BY star ASC")
	List<FeedbackEntity> findAllOrderByStarAsc_soulhalo();
	@Query("FROM FeedbackEntity WHERE idName='revivedknight' ORDER BY star ASC")
	List<FeedbackEntity> findAllOrderByStarAsc_revivedknight();
	
	@Query("FROM FeedbackEntity WHERE idName='akagoe' ORDER BY time DESC")
	List<FeedbackEntity> findAllOrderByTimeDesc_akagoe();
	@Query("FROM FeedbackEntity WHERE idName='vot' ORDER BY time DESC")
	List<FeedbackEntity> findAllOrderByTimeDesc_vot();
	@Query("FROM FeedbackEntity WHERE idName='soulhalo' ORDER BY time DESC")
	List<FeedbackEntity> findAllOrderByTimeDesc_soulhalo();
	@Query("FROM FeedbackEntity WHERE idName='revivedknight' ORDER BY time DESC")
	List<FeedbackEntity> findAllOrderByTimeDesc_revivedknight();

	@Query("FROM FeedbackEntity WHERE idName='akagoe' ORDER BY star DESC")
	List<FeedbackEntity> findAllOrderByStarDesc_akagoe();
	@Query("FROM FeedbackEntity WHERE idName='vot' ORDER BY star DESC")
	List<FeedbackEntity> findAllOrderByStarDesc_vot();
	@Query("FROM FeedbackEntity WHERE idName='soulhalo' ORDER BY star DESC")
	List<FeedbackEntity> findAllOrderByStarDesc_soulhalo();
	@Query("FROM FeedbackEntity WHERE idName='revivedknight' ORDER BY star DESC")
	List<FeedbackEntity> findAllOrderByStarDesc_revivedknight();

	@Query("SELECT SUM(star) FROM FeedbackEntity WHERE idName='revivedknight'")
	long StarNumber_revivedknight();
	@Query("SELECT SUM(star) FROM FeedbackEntity WHERE idName='vot'")
	long StarNumber_vot();
	@Query("SELECT SUM(star) FROM FeedbackEntity WHERE idName='soulhalo'")
	long StarNumber_soulhalo();
	@Query("SELECT SUM(star) FROM FeedbackEntity WHERE idName='akagoe'")
	long StarNumber_akagoe();
	
	@Query("SELECT COUNT(id) FROM FeedbackEntity WHERE idName='revivedknight'")
	long feedbackNumber_revivedknight();
	@Query("SELECT COUNT(id) FROM FeedbackEntity WHERE idName='vot'")
	long feedbackNumber_vot();
	@Query("SELECT COUNT(id) FROM FeedbackEntity WHERE idName='soulhalo'")
	long feedbackNumber_soulhalo();
	@Query("SELECT COUNT(id) FROM FeedbackEntity WHERE idName='akagoe'")
	long feedbackNumber_akagoe();
}
