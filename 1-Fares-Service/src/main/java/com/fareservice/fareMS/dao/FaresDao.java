package com.fareservice.fareMS.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fareservice.fareMS.entity.Fares;

@Repository
public interface FaresDao extends JpaRepository<Fares,Long>{
	
}
