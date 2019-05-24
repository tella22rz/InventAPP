package com.inventapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inventapp.dao.UsuarioService;
import com.inventapp.entity.LogIn;
import com.inventapp.entity.Registro;
import com.inventapp.entity.RespuestaApi;

@RestController
@RequestMapping("/usuarios")
public class UsuariosController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public RespuestaApi signUp(@RequestBody Registro registro){
        return usuarioService.registrar(registro);
    }

    @PostMapping(value = "/logIn", consumes = MediaType.APPLICATION_JSON_VALUE)
    public RespuestaApi logIn(@RequestBody LogIn logIn){
    	RespuestaApi respuesta = usuarioService.logIn(logIn);
    	System.out.println(respuesta.getMensaje());
    	System.out.println(respuesta.getEstado());
    	System.out.println(respuesta.getResultado());
    	return respuesta;
    }
}