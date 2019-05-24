package com.inventapp.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.inventapp.entity.Factura;

@Service
public interface FacturaService {
	List<Factura> listAllFacturas();
	
	Factura listFacturaByCodigo(Long codigo);
	
	Factura addNewFactura(Factura factura);
	
	void deleteFacturaByCodigo(Long factura);
	
	void deleteAll();
	
	List<Factura> saveAllFacturas(List<Factura> facturas);
	
	Factura saveFactura(Factura factura);
}
