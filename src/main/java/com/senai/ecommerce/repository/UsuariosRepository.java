package com.senai.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.ecommerce.entities.Usuarios;

public interface UsuariosRepository extends  JpaRepository <Usuarios, Long> {

}
