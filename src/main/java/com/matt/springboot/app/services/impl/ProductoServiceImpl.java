package com.matt.springboot.app.services.impl;

import java.util.ArrayList;
import java.util.List;

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
	
	@Override
	public Producto save(Producto entity) {
		
		Producto producto = null;
		
		try {
			producto = productoRepository.save(entity);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return producto;
	}
	
	@Override
	public List<Producto> findAll() {
		
		List<Producto> lstProductos = new ArrayList<Producto>();
		
		try {
			lstProductos = productoRepository.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return lstProductos;
	}
	
	@Override
	public Producto update(Producto entity) {
		Producto producto = null;
		
		try {
			producto = productoRepository.save(entity);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return producto;
	}
	
	@Override
	public Producto deleteById(String idProducto) {
		Producto producto = null;
		
		try {
			producto = productoRepository.deleteById(idProducto);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return producto;
	}

}
