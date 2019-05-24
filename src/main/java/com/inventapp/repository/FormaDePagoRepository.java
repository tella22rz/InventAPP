package com.inventapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inventapp.entity.FormaDePago;

@Repository
public interface FormaDePagoRepository extends JpaRepository<FormaDePago, Long>{
	
	FormaDePago findByCodigo(Long codigo);
	
	List<FormaDePago> findAll();
	
	FormaDePago save(FormaDePago formaDePago);

	void deleteAll();
	
	void deleteByCodigo(Long codigo);

}
