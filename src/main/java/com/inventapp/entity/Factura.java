package com.inventapp.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Factura {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long codigo;
    private String codigoCliente;
    private String empleado;
    private Date fecha;
    @OneToOne
    private FormaDePago formaDePago;
    private Boolean estadoFactura;

    public Factura() {
    }

	public Factura(Long codigo, String codigoCliente, String empleado, Date fecha, FormaDePago formaDePago,
			Boolean estadoFactura) {
		this.codigo = codigo;
		this.codigoCliente = codigoCliente;
		this.empleado = empleado;
		this.fecha = fecha;
		this.formaDePago = formaDePago;
		this.estadoFactura = estadoFactura;
	}


	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(String codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public String getEmpleado() {
		return empleado;
	}

	public void setEmpleado(String empleado) {
		this.empleado = empleado;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public FormaDePago getFormaDePago() {
		return formaDePago;
	}

	public void setFormaDePago(FormaDePago formaDePago) {
		this.formaDePago = formaDePago;
	}

	public Boolean getEstadoFactura() {
		return estadoFactura;
	}

	public void setEstadoFactura(Boolean estadoFactura) {
		this.estadoFactura = estadoFactura;
	}

    

}
