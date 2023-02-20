package com.laptrinhjavaweb.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptrinhjavaweb.entity.ContentEntity;

public interface ContentRepository extends JpaRepository<ContentEntity, Long>{
	ArrayList<ContentEntity> findByIdName(String idName);

}
