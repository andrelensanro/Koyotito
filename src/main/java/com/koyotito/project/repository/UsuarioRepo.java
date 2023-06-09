package com.koyotito.project.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.koyotito.project.model.Usuario;

@Repository
public interface UsuarioRepo extends JpaRepository<Usuario, Integer>{
	public abstract Optional<Usuario> findByCorreo(String email);
}
