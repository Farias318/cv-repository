package com.practicas.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.practicas.app.repository.GestorUser;

@Service
public class UsuarioService implements UserDetailsService {

	@Autowired
	@Qualifier("gestorUsuario")
	private GestorUser repo;


	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<GrantedAuthority> buildgrante(byte rol){
		return null;
	}




}
