package com.senai.ecommerce.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_usuarios")
public class Usuarios {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String nome;
	private Long id;
	private String email;
	private String telefone;
	private String roles;
	private String senha;
	
	
	@OneToMany(mappedBy= "Cliente")
	private List<Pedido>pedidos = new ArrayList<>();
	
	public Usuarios(String nome, Long id, String email, String telefone, String roles, String senha) {
	
		this.nome = nome;
		this.id = id;
		this.email = email;
		this.telefone = telefone;
		this.roles = roles;
		this.senha = senha;
	}
	

public String getNome() {
	return nome;
}


public void setNome(String nome) {
	this.nome = nome;
}


public Long getId() {
	return id;
}


public void setId(Long id) {
	this.id = id;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


public String getTelefone() {
	return telefone;
}


public void setTelefone(String telefone) {
	this.telefone = telefone;
}


public String getRoles() {
	return roles;
}


public void setRoles(String roles) {
	
	this.roles = roles;
	
}
	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	

}
}


