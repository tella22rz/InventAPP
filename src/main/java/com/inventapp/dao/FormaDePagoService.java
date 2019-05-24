package com.inventapp.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.inventapp.entity.FormaDePago;

@Service
public interface FormaDePagoService {
	List<FormaDePago> listAllFormasDePago();
	
	FormaDePago listFormaDePagoByCodigo(Long codigo);
	
	FormaDePago addNewFormaDePago(FormaDePago formaDePago);
	
	void deleteFormaDePagoByCodigo(Long codigo);
	
	void deleteAll();
	
	List<FormaDePago> saveAllFormasDePago(List<FormaDePago> formasDePago);
	
	FormaDePago saveFormaDePago(FormaDePago formaDePago);
}
