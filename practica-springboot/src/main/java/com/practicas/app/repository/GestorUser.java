package com.practicas.app.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practicas.app.configuration.Usuario;
import com.practicas.app.entity.User;

@Repository("gestorUser")
public interface GestorUser extends JpaRepository<Usuario, Serializable>{

	public abstract User findByUsuario(String usuario);
	
}
