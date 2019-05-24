package com.inventapp.entity;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Proveedor {

	@Id
	private String cif;
	private String nombre;
	private String direccion;
	private BigInteger telefono;
	private String ciudad;
	private String email;
	private String rut;
	
	public Proveedor() {
	}

	public Proveedor(String cif, String nombre, String direccion, BigInteger telefono, String cudad, String email,
			String rut) {
		this.cif = cif;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.ciudad = cudad;
		this.email = email;
		this.rut = rut;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public BigInteger getTelefono() {
		return telefono;
	}

	public void setTelefono(BigInteger telefono) {
		this.telefono = telefono;
	}

	public String getCudad() {
		return ciudad;
	}

	public void setCudad(String cudad) {
		this.ciudad = cudad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}
	
}
