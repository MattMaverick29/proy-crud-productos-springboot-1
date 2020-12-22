package com.matt.springboot.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.matt.springboot.app.models.Usuario;
import com.matt.springboot.app.services.IUsuarioService;

@CrossOrigin
@RestController
public class UsuarioController {

	@Autowired
	private IUsuarioService usuarioService;

	@PostMapping(value = "/usuario", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Usuario> save(@RequestBody Usuario usuario) {

		Usuario usuarioData = usuarioService.save(usuario);

		return ResponseEntity.ok(usuarioData);
	}

	@GetMapping(value = "/usuarios", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> findAll() {
		List<Usuario> usuarios = new ArrayList<Usuario>();

		usuarios = usuarioService.findAll();

		return ResponseEntity.ok(usuarios);
	}

	@GetMapping(value = "/usuario/{idUsuario}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Usuario> findByUsuario(@PathVariable String idUsuario) {

		Usuario usuario = new Usuario();

		usuario = usuarioService.IdUsuario(idUsuario);

		return ResponseEntity.ok(usuario);

	}

	@PutMapping(value = "/usuario", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Usuario> updateUsuario(@RequestBody Usuario usuario) {

		Usuario usuarioData = usuarioService.save(usuario);

		return ResponseEntity.ok(usuarioData);

	}

	@DeleteMapping(value = "/usuario/{idUsuario}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Usuario> deleteFindByIdUsuario(@PathVariable String idUsuario) {

		Usuario usuario = new Usuario();

		usuario = usuarioService.deleteById(idUsuario);

		return ResponseEntity.ok(usuario);
	}

}
