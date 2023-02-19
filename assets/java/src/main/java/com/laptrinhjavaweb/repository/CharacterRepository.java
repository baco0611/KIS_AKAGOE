package com.laptrinhjavaweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptrinhjavaweb.entity.CharacterEntity;

public interface CharacterRepository extends JpaRepository<CharacterEntity, Long> {
}
