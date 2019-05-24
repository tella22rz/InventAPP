package com.inventapp.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Devolucion {

	@Id
	private Long codigo;
	private Integer codigoFactura;
	private Integer codigoArticulo;
	private Date fecha;
	private Integer cantidad;
	
	public Devolucion() {
	}
	
	public Devolucion(Long codigo, Integer codigoFactura, Integer codigoArticulo, Date fecha, Integer cantidad) {
		this.codigo = codigo;
		this.codigoFactura = codigoFactura;
		this.codigoArticulo = codigoArticulo;
		this.fecha = fecha;
		this.cantidad = cantidad;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public Integer getCodigoFactura() {
		return codigoFactura;
	}

	public void setCodigoFactura(Integer codigoFactura) {
		this.codigoFactura = codigoFactura;
	}

	public Integer getCodigoArticulo() {
		return codigoArticulo;
	}

	public void setCodigoArticulo(Integer codigoArticulo) {
		this.codigoArticulo = codigoArticulo;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
}
