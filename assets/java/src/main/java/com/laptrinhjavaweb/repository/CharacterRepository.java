package com.laptrinhjavaweb.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptrinhjavaweb.entity.CharacterEntity;

public interface CharacterRepository extends JpaRepository<CharacterEntity, Long> {
	ArrayList<CharacterEntity> findByIdName(String idName);
}
