package com.inventapp.dao;

import org.springframework.stereotype.Service;

import com.inventapp.entity.LogIn;
import com.inventapp.entity.Registro;
import com.inventapp.entity.RespuestaApi;

@Service
public interface UsuarioService {

	public RespuestaApi logIn(LogIn logIn);
	
	public RespuestaApi registrar(Registro registro);
	
}
