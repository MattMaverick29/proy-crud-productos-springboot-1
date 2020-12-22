package com.matt.springboot.app.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matt.springboot.app.models.Usuario;
import com.matt.springboot.app.repository.UsuarioRepository;
import com.matt.springboot.app.services.IUsuarioService;

@Service("UsuarioService")
public class UsuarioServiceImpl implements IUsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public Usuario IdUsuario(String idUsuario) {

		Usuario usuario = null;

		try {
			usuario = usuarioRepository.findById(idUsuario);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return usuario;
	}

	@Override
	public Usuario save(Usuario entity) {

		Usuario usuario = null;

		try {
			usuario = usuarioRepository.save(entity);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return usuario;
	}

	@Override
	public List<Usuario> findAll() {

		List<Usuario> lstUsuarios = new ArrayList<Usuario>();

		try {
			lstUsuarios = usuarioRepository.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return lstUsuarios;
	}

	@Override
	public Usuario update(Usuario entity) {

		Usuario usuario = null;

		try {
			usuario = usuarioRepository.save(entity);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return usuario;
	}

	@Override
	public Usuario deleteById(String idUsuario) {

		Usuario usuario = null;

		try {
			usuario = usuarioRepository.deleteById(idUsuario);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return usuario;
	}

}
