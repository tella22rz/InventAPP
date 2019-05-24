package com.inventapp.dao.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.inventapp.dao.UsuarioService;
import com.inventapp.entity.LogIn;
import com.inventapp.entity.Registro;
import com.inventapp.entity.RespuestaApi;
import com.inventapp.entity.Usuario;
import com.inventapp.repository.UsuarioRepository;

@Transactional
@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	 @Autowired
	 private UsuarioRepository usuarioRepository;

	@Override
	public RespuestaApi registrar(Registro registro) {
		validarRegistro(registro);
        Usuario usuario = new Usuario();
        BeanUtils.copyProperties(registro, usuario);
        usuarioRepository.save(usuario);
        return new RespuestaApi(200, "Correcto", usuario);
	}

	@Override
	public RespuestaApi logIn(LogIn logIn) {
        Usuario usuario = usuarioRepository.findByNombreDeUsuario(logIn.getNombreDeUsuario());
        if(usuario == null) {
            throw new RuntimeException("Usuario no existe.");
        }
        if(!usuario.getContrasena().equals(logIn.getContrasena())){
            throw new RuntimeException("Contraseña incorrecta.");
        }
        return new RespuestaApi(200, "Login correcto", null) ;
	}

    private void validarRegistro(Registro registro) {
    }
    
}
