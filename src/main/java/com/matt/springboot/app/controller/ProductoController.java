package com.matt.springboot.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.matt.springboot.app.models.Producto;
import com.matt.springboot.app.services.IProductoService;

@RestController
public class ProductoController {
	
	@Autowired
	private IProductoService productoService;
	
	@GetMapping(value = "/producto/{idProducto}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Producto>findByProducto(@PathVariable String idProducto) {
		
		Producto producto = new Producto();
		
		producto = productoService.IdProducto(idProducto);
		
		return ResponseEntity.ok(producto);
		
	}
}
