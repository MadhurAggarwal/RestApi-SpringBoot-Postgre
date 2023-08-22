package com.springrest.springrest.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springrest.entities.load;

public interface loadDao extends JpaRepository<load, Integer> {
	List<load> findByShipperId(int shipperId);
}
