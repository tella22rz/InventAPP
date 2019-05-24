package com.inventapp.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.inventapp.dao.ArticuloService;
import com.inventapp.entity.Articulo;

@RestController
@RequestMapping("/articulos")
public class ArticulosController {
	
	private final ArticuloService articuloService;

	@Autowired
	public ArticulosController(ArticuloService articuloService) {
		this.articuloService = articuloService;
	}
	
	@GetMapping({"/mostrar"})
	public ModelAndView mostrarArticulos(HttpSession session, HttpServletRequest request) {
		
		ModelAndView mav = new ModelAndView();
		
		List<Articulo> articulos = articuloService.listAllArticulos();
		
		mav.addObject("articulos", articulos);
		mav.setViewName("/articulos/mostrarArticulos");
		
		return mav;
	}
}
