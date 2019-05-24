package com.inventapp.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventapp.dao.FormaDePagoService;
import com.inventapp.entity.FormaDePago;
import com.inventapp.repository.FormaDePagoRepository;

@Service
public class FormaDePagoServiceImpl implements FormaDePagoService {

	private final FormaDePagoRepository formaDePagoRepository;

	@Autowired
	public FormaDePagoServiceImpl(FormaDePagoRepository formaDePagoRepository) {
		this.formaDePagoRepository = formaDePagoRepository;
	}

	@Override
	public List<FormaDePago> listAllFormasDePago() {
		List<FormaDePago> formasDePago = formaDePagoRepository.findAll();
		return formasDePago;
	}

	@Override
	public FormaDePago listFormaDePagoByCodigo(Long codigo) {
		FormaDePago formaDePago = formaDePagoRepository.findByCodigo(codigo);
		return formaDePago;
	}

	@Override
	public FormaDePago addNewFormaDePago(FormaDePago formaDePago) {
		List<FormaDePago> formasDePago = formaDePagoRepository.findAll();
		FormaDePago formaDePagoReturn = null;
		Boolean error = false;
		for (FormaDePago formaDePago2 : formasDePago) {
			if(formaDePago2.getCodigo().equals(formaDePago.getCodigo())) {
				error = true;
			}
		}
		if(error == false) {
			formaDePagoReturn = formaDePagoRepository.save(formaDePago);
			return formaDePagoReturn;
		}else {
			return formaDePagoReturn;
		}
	}

	@Override
	public void deleteFormaDePagoByCodigo(Long codigo) {
		formaDePagoRepository.deleteByCodigo(codigo);
		
	}

	@Override
	public void deleteAll() {
		formaDePagoRepository.deleteAll();
		
	}

	@Override
	public List<FormaDePago> saveAllFormasDePago(List<FormaDePago> formasDePago) {
		return formaDePagoRepository.saveAll(formasDePago);
	}

	@Override
	public FormaDePago saveFormaDePago(FormaDePago formaDePago) {
		return formaDePagoRepository.save(formaDePago);
	}

	
}
