package com.laptrinhjavaweb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.laptrinhjavaweb.entity.FeedbackEntity;

public interface FeedbackRepository extends JpaRepository<FeedbackEntity, Long> {
	@Query("FROM FeedbackEntity ORDER BY time ASC")
	List<FeedbackEntity> findAllOrderByTimeAsc();

	@Query("FROM FeedbackEntity ORDER BY star ASC")
	List<FeedbackEntity> findAllOrderByStarAsc();

	@Query("FROM FeedbackEntity ORDER BY time DESC")
	List<FeedbackEntity> findAllOrderByTimeDesc();

	@Query("FROM FeedbackEntity ORDER BY star DESC")
	List<FeedbackEntity> findAllOrderByStarDesc();

	@Query("SELECT SUM(star) FROM FeedbackEntity")
	Long StarNumber();
}
