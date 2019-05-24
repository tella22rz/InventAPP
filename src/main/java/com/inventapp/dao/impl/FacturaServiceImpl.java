package com.inventapp.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventapp.dao.FacturaService;
import com.inventapp.entity.Factura;
import com.inventapp.repository.FacturaRepository;

@Service
public class FacturaServiceImpl implements FacturaService {

	private final FacturaRepository facturaRepository;

	@Autowired
	public FacturaServiceImpl(FacturaRepository facturaRepository) {
		this.facturaRepository = facturaRepository;
	}

	@Override
	public List<Factura> listAllFacturas() {
		List<Factura> facturas = facturaRepository.findAll();
		return facturas;
	}

	@Override
	public Factura listFacturaByCodigo(Long codigo) {
		Factura articulo = facturaRepository.findByCodigo(codigo);
		return articulo;
	}

	@Override
	public Factura addNewFactura(Factura articulo) {
		List<Factura> articulos = facturaRepository.findAll();
		Factura articuloReturn = null;
		Boolean error = false;
		for (Factura articulo2 : articulos) {
			if(articulo2.getCodigo().equals(articulo.getCodigo())) {
				error = true;
			}
		}
		if(error == false) {
			articuloReturn = facturaRepository.save(articulo);
			return articuloReturn;
		}else {
			return articuloReturn;
		}
	}

	@Override
	public void deleteFacturaByCodigo(Long articulo) {
		facturaRepository.deleteByCodigo(articulo);
	}

	@Override
	public Factura saveFactura(Factura factura) {
		return facturaRepository.save(factura);
	}

	@Override
	public void deleteAll() {
		facturaRepository.deleteAll();
	}

	@Override
	public List<Factura> saveAllFacturas(List<Factura> facturas) {
		return facturaRepository.saveAll(facturas);
	}

}
