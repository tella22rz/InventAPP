package com.inventapp.entity;

public class RespuestaApi {

	private Integer estado;
	private String mensaje;
	private Object resultado;
	
	public RespuestaApi(Integer estado, String mensaje, Object resultado) {
		this.estado = estado;
		this.mensaje = mensaje;
		this.resultado = resultado;
	}
	
	public RespuestaApi() {
		
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public Object getResultado() {
		return resultado;
	}

	public void setResultado(Object resultado) {
		this.resultado = resultado;
	}
	
}
