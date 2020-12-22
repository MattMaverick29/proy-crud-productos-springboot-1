package com.matt.springboot.app.services;

import java.util.List;

import com.matt.springboot.app.models.Usuario;

public interface IUsuarioService {

	public abstract Usuario IdUsuario(String idUsuario);

	public abstract Usuario save(Usuario entity);

	public abstract List<Usuario> findAll();

	public abstract Usuario update(Usuario entity);

	public abstract Usuario deleteById(String idUsuario);

}
