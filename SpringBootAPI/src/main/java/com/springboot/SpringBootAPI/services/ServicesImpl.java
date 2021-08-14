package com.springboot.SpringBootAPI.services;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.SpringBootAPI.dao.TruckDao;
import com.springboot.SpringBootAPI.entity.Truck;

@Service
public class ServicesImpl implements Services {

	@Autowired
	private TruckDao dao;

	@Override
	public Truck add(Truck truck) {
		return dao.save(truck);
	}

	@Override
	public List<Truck> getAll() {
		List<Truck> all = dao.findAll();
		return all;
	}

	@Override
	public Truck getById(int id) {
		Truck byId = dao.findById(id).get();
		return byId;
	}

	@Override
	public Truck updateData(Truck truck) {
		Truck updated = dao.save(truck);
		return updated;
	}

	@Override
	public Truck deleteData(int id) {
		Truck truck = dao.findById(id).get();
		dao.delete(truck);
		return truck;
	}

}
