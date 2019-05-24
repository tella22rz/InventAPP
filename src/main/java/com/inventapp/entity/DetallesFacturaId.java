package com.inventapp.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class DetallesFacturaId implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = -4890187097969588159L;
	
	private Integer codigoFactura;
    private Integer codigoArticulo;
    
	public DetallesFacturaId() {
	}

	public DetallesFacturaId(Integer codigoFactura, Integer codigoArticulo) {
		this.codigoFactura = codigoFactura;
		this.codigoArticulo = codigoArticulo;
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
	
}
