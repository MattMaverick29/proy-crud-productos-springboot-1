package com.matt.springboot.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.matt.springboot.app.models.Producto;
import com.matt.springboot.app.services.IProductoService;


@RestController
public class ProductoController {
	
	@Autowired
	private IProductoService productoService;
	
	@PostMapping(value = "/producto", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Producto> save(@RequestBody Producto producto) {
		
		Producto productoData = productoService.save(producto);
		
		return ResponseEntity.ok(productoData);
	}
	
	@GetMapping(value = "/productos", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> findAll() {
		List<Producto> productos = new ArrayList<Producto>();
		
		productos = productoService.findAll();
		
		return ResponseEntity.ok(productos);
	}
	
	@GetMapping(value = "/producto/{idProducto}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Producto>findByProducto(@PathVariable String idProducto) {
		
		Producto producto = new Producto();
		
		producto = productoService.IdProducto(idProducto);
		
		return ResponseEntity.ok(producto);
		
	}
	
	@PutMapping(value = "/producto", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Producto> updateProducto(@RequestBody Producto producto) {
		
		Producto productoData = productoService.save(producto);
		
		return ResponseEntity.ok(productoData);
		
	}
	
	@DeleteMapping(value = "/producto/{idProducto}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Producto> deleteFindByIdProducto(@PathVariable String idProducto) {
		
		Producto producto = new Producto();
		
		producto = productoService.deleteById(idProducto);
		
		return ResponseEntity.ok(producto);
	}
}
