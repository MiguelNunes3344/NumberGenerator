package com.random.randomnumber.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.random.randomnumber.dto.NumberDto;
import com.random.randomnumber.entity.NumberEntity;

public interface NumberRepository extends JpaRepository<NumberEntity, Long> {

	NumberEntity findByNumber(Long number);
}
