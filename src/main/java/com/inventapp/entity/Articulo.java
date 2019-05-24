package com.inventapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Articulo {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long codigo;
    private String descripcion;
    private Integer stock;
    private Integer totalVendido;
    private Double precioVenta;
    private Double precioCosto;
    private Boolean borrado;
    private String tipo;
    @OneToOne(targetEntity = Proveedor.class)
    @JoinColumn(name = "cif")
    private Proveedor proveedor; 

    public Articulo() {
    }

	public Articulo(Long codigo, String descripcion, Integer stock, Integer totalVendido, Double precioVenta, Double precioCosto,
			Boolean estado, String tipo, Proveedor proveedor) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.stock = stock;
		this.precioVenta = precioVenta;
		this.precioCosto = precioCosto;
		this.borrado = estado;
		this.tipo = tipo;
		this.totalVendido = totalVendido;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public Integer getTotalVendido() {
		return totalVendido;
	}

	public void setTotalVendido(Integer totalVendido) {
		this.totalVendido = totalVendido;
	}

	public Double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(Double precioVenta) {
		this.precioVenta = precioVenta;
	}

	public Double getPrecioCosto() {
		return precioCosto;
	}

	public void setPrecioCosto(Double precioCosto) {
		this.precioCosto = precioCosto;
	}

	public Boolean getEstado() {
		return borrado;
	}

	public void setEstado(Boolean estado) {
		this.borrado = estado;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
	
	public void eliminarArticulo(Articulo articulo) {
		//articuloDao.eliminarArticulo(articulo);
	}
	
	public Articulo buscarArticulo(Articulo articulo) {
		//return articulo = articuloDao.buscarArticulo(articulo);
		return null;
	}
	
	public Articulo comprobarStock(Articulo articulo) {
		//Articulo articulo = articuloDao.buscarArticulo(articulo);
		//return articulo.getStock(articulo);
		return null;
	}

}
