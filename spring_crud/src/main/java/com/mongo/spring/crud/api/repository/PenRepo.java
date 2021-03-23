package com.mongo.spring.crud.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongo.spring.crud.api.model.Pen;

public interface PenRepo extends MongoRepository<Pen, Integer>{

}
