package com.practicas.app.configuration;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Usuario {
	
	private String mail;
	
	private String password;
	
	
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
