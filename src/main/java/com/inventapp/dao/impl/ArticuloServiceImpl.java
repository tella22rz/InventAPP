package com.inventapp.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventapp.dao.ArticuloService;
import com.inventapp.entity.Articulo;
import com.inventapp.repository.ArticuloRepository;

@Service
public class ArticuloServiceImpl implements ArticuloService {

	private final ArticuloRepository articuloRepository;

	@Autowired
	public ArticuloServiceImpl(ArticuloRepository articuloRepository) {
		this.articuloRepository = articuloRepository;
	}

	@Override
	public List<Articulo> listAllArticulos() {
		List<Articulo> articulos = articuloRepository.findAll();
		return articulos;
	}

	@Override
	public Articulo listArticuloByCodigo(Long codigo) {
		Articulo articulo = articuloRepository.findByCodigo(codigo);
		return articulo;
	}

	@Override
	public Articulo addNewArticulo(Articulo articulo) {
		List<Articulo> articulos = articuloRepository.findAll();
		Articulo articuloReturn = null;
		Boolean error = false;
		for (Articulo articulo2 : articulos) {
			if(articulo2.getCodigo().equals(articulo.getCodigo())) {
				error = true;
			}
		}
		if(error == false) {
			articuloReturn = articuloRepository.save(articulo);
			return articuloReturn;
		}else {
			return articuloReturn;
		}
	}

	@Override
	public void deleteArticuloByCodigo(Long articulo) {
		articuloRepository.deleteByCodigo(articulo);
	}

	@Override
	public Articulo saveArticulo(Articulo articulo) {
		return articuloRepository.save(articulo);
	}

	@Override
	public void deleteAll() {
		articuloRepository.deleteAll();
	}

	@Override
	public List<Articulo> saveAllArticulos(List<Articulo> articulos) {
		return articuloRepository.saveAll(articulos);
	}

}
