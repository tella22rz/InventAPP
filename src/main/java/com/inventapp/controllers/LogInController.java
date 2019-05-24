package com.inventapp.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.inventapp.dao.UsuarioService;
import com.inventapp.entity.LogIn;
import com.inventapp.entity.RespuestaApi;

@RestController
@RequestMapping("/")
public class LogInController {
	
	private final UsuarioService usuarioService;

	@Autowired
	public LogInController(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}
	
	@GetMapping //Get con la pagina principal
	public ModelAndView inicio(HttpSession session, HttpServletRequest request) {
		
		ModelAndView mav = new ModelAndView();
		
		
		mav.addObject("logIn", new LogIn());
		mav.setViewName("logIn");
		
		return mav;
	}
	
	@PostMapping({"/login"})
	public ModelAndView login(@ModelAttribute(value = "logIn") @Valid LogIn logIn, 
			BindingResult resultadoLogIn, HttpSession session, HttpServletRequest request){
		
		ModelAndView mav = new ModelAndView();
		
		if (resultadoLogIn.hasErrors()) {
			mav.addObject("logIn", logIn);
			mav.setViewName("logIn");
			return mav;
		} else {
			RespuestaApi respuesta = usuarioService.logIn(logIn);
			
			if(respuesta.getEstado().intValue() == 200) {
				mav.setViewName("inicio");
				return mav;
			}else {
				mav.addObject("logIn", logIn);
				mav.setViewName("logIn");
				session.setAttribute("usuario", logIn);
				return mav;
			}
			
		}
	}
	
	@GetMapping({"/inicio"})
	public ModelAndView inicio(){
		
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("inicio");
		return mav;
	}
}
