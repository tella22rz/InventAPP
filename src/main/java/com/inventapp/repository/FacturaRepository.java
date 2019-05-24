package com.inventapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inventapp.entity.Factura;

@Repository
public interface FacturaRepository extends JpaRepository<Factura, Long>{
	
	Factura findByCodigo(Long codigo);
	
	List<Factura> findAll();
	
	Factura save(Factura factura);
	
	void deleteAll();
	
	void deleteByCodigo(Long codigo);

}
