package com.inventapp.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.inventapp.entity.Articulo;

@Service
public interface ArticuloService {
	
	List<Articulo> listAllArticulos();
	
	Articulo listArticuloByCodigo(Long codigo);
	
	Articulo addNewArticulo(Articulo articulo);
	
	void deleteArticuloByCodigo(Long articulo);
	
	void deleteAll();
	
	List<Articulo> saveAllArticulos(List<Articulo> articulos);
	
	Articulo saveArticulo(Articulo articulo);
}
