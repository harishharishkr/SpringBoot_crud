package com.mongo.spring.crud.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.spring.crud.api.model.Pen;
import com.mongo.spring.crud.api.repository.PenRepo;

@RestController
public class PenController {

	@Autowired
	private PenRepo repo;

	@PostMapping("/penid")
	public String savePen(@RequestBody Pen pen) {

		repo.save(pen);
		return "added pen with id :  " + ((Pen) pen).getId();

	}

	@GetMapping("/findAllPens")
	public List<Pen> getpPens() {

		return repo.findAll();
	}

}
