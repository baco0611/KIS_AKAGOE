package com.laptrinhjavaweb.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptrinhjavaweb.entity.BackgroundEntity;

public interface BackgroundRepository extends JpaRepository<BackgroundEntity, Long> {
	ArrayList<BackgroundEntity> findByIdName(String idName);
}
