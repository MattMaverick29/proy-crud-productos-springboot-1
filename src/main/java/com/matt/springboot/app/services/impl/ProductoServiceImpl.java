package com.matt.springboot.app.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matt.springboot.app.models.Producto;
import com.matt.springboot.app.repository.ProductoRepository;
import com.matt.springboot.app.services.IProductoService;

@Service("ProductoService")
public class ProductoServiceImpl implements IProductoService {
	
	@Autowired
	private ProductoRepository productoRepository;

	@Override
	public Producto IdProducto(String idProducto) {
		
		Producto producto = null;
		
		try {
			
			producto = productoRepository.findById(idProducto);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
		return producto;
	}

}
