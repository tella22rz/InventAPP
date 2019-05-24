package com.inventapp.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class DetallesFactura {

	@EmbeddedId
    private DetallesFacturaId detallesFacturaId;
    private Integer cantidad;
    private Integer iva;
    private Double precioVenta;
    private Integer descuento;

    public DetallesFactura() {
    }

	public DetallesFactura(DetallesFacturaId detallesFacturaId, Integer cantidad, Integer iva,
			Double precioVenta, Integer descuento) {
		this.detallesFacturaId = detallesFacturaId;
		this.cantidad = cantidad;
		this.iva = iva;
		this.precioVenta = precioVenta;
		this.descuento = descuento;
	}

	public DetallesFacturaId getDetallesFacturaId() {
		return detallesFacturaId;
	}

	public void DetallesFacturaId(DetallesFacturaId  detallesFacturaId) {
		this.detallesFacturaId  = detallesFacturaId;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Integer getIva() {
		return iva;
	}

	public void setIva(Integer iva) {
		this.iva = iva;
	}

	public Double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(Double precioVenta) {
		this.precioVenta = precioVenta;
	}

	public Integer getDescuento() {
		return descuento;
	}

	public void setDescuento(Integer descuento) {
		this.descuento = descuento;
	}


}
