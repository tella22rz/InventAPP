package com.inventapp.repository;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inventapp.entity.Articulo;

@Repository
public interface ArticuloRepository extends JpaRepository<Articulo, Long>{
	
	Articulo findByCodigo(Long codigo);
	
	List<Articulo> findAll();
	
	Articulo save(Articulo articulo);
	
	void deleteAll();
	
	void deleteByCodigo(Long codigo);

}
