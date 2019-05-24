package com.inventapp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FormaDePago {

	@Id
	private Long codigo;
	private String nombre;
	
	public FormaDePago(Long codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}
	
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
		
}
