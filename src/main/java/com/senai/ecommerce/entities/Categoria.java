package com.senai.ecommerce.entities;
	
import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.autoconfigure.pulsar.PulsarProperties.Producer;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

	@Entity
	@Table(name = "tb_ItemDoPedido")
	public class Categoria {
		 @Id
	     @GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		private String nome;
		
		
		@ManyToMany(mappedBy = "categorias")
	private Set<Producer> produto = new HashSet<>();
		
		public Categoria() {
			
		}


		public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
		}


		public String getNome() {
			return nome;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}


		public Categoria(Long id, String nome) {
			
			this.id = id;
			this.nome = nome;
		}
		
		

	}

