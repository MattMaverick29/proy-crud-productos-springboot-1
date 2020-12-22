package com.matt.springboot.app.models;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@MongoId(value = FieldType.OBJECT_ID)
	private String id;
	private String nombre;
	private String apellido;
	private String usuario;
	private String correo;
	private String contraseña;

}
