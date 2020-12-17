package com.matt.springboot.app.repository;

import java.io.Serializable;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.matt.springboot.app.models.Producto;

@Repository("ProductoRepository")
public interface ProductoRepository extends MongoRepository<Producto, Serializable> {
	//En este bloque hago todas las consultas que necesite hacer a Mongo
	
	Producto findById(String id);
	
	Producto deleteById(String id);
}
