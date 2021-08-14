package com.springboot.SpringBootAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.SpringBootAPI.entity.Truck;
import com.springboot.SpringBootAPI.services.Services;

@RestController
public class Home {

	@Autowired
	private Services services;

	@RequestMapping(value = "/home")
	public String home() {
		System.out.println("Welcome to spring boot");
		return "welcome";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(@RequestBody() Truck truck) {
		Truck add = services.add(truck);
		if (add != null) {
			return "loads details added successfully ";
		} else {
			return "loads details added failed... ";
		}
	}

	@RequestMapping(value = "/getAll")
	public List<Truck> get() {
		List<Truck> all = services.getAll();
		return all;
	}

	@RequestMapping(value = "/get/{id}")
	public Truck getById(@PathVariable() String id) {
		Truck byId = services.getById(Integer.parseInt(id));
		return byId;

	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public Truck update(@RequestBody() Truck truck) {
		Truck updated = services.updateData(truck);
		return updated;
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public Truck delete(@PathVariable() String id) {
		Truck deleted = services.deleteData(Integer.parseInt(id));
		return deleted;

	}
}
