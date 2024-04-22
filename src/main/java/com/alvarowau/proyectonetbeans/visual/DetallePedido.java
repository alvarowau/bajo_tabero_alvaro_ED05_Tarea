package com.alvarowau.proyectonetbeans.visual;

public class DetallePedido {

	private Articulo articulo;
	private int cantidad;

	public DetallePedido() {
		// TODO - implement DetallePedido.DetallePedido
		throw new UnsupportedOperationException();
	}

	public Articulo getArticulo() {
		return this.articulo;
	}

	/**
	 * 
	 * @param articulo
	 */
	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}

	public int getCantidad() {
		return this.cantidad;
	}

	/**
	 * 
	 * @param cantidad
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

}