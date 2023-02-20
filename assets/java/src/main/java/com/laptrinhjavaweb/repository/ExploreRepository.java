package com.laptrinhjavaweb.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptrinhjavaweb.entity.ExploreEntity;

public interface ExploreRepository extends JpaRepository<ExploreEntity, Long> {
	ArrayList<ExploreEntity> findByIdName(String idName);
}
