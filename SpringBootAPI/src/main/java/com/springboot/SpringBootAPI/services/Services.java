package com.springboot.SpringBootAPI.services;

import java.util.List;

import com.springboot.SpringBootAPI.entity.Truck;

public interface Services {

	public Truck add(Truck truck);

	public List<Truck> getAll();

	public Truck getById(int id);

	public Truck updateData(Truck truck);
	
	public Truck deleteData(int id);

}
