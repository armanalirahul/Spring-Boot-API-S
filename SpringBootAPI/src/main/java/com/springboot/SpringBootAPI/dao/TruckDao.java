package com.springboot.SpringBootAPI.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.SpringBootAPI.entity.Truck;

@Repository
public interface TruckDao extends JpaRepository<Truck, Integer> {

}
