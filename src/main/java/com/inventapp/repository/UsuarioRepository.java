package com.inventapp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inventapp.entity.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
	
	Usuario findByNombreDeUsuario(String nombre);
	
	Usuario findByEmail(String email);
	
	Optional<Usuario> findById(Integer id);
	
	Usuario save(Usuario usuario);
	
}
