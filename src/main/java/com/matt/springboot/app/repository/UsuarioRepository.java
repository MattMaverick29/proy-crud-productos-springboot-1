package com.matt.springboot.app.repository;

import java.io.Serializable;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.matt.springboot.app.models.Usuario;


@Repository("UsuarioRepository")
public interface UsuarioRepository extends MongoRepository<Usuario, Serializable> {
	
	Usuario findById(String id);
	Usuario deleteById(String id);

}
