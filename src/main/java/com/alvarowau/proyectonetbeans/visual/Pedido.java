package com.alvarowau.proyectonetbeans.visual;

public class Pedido {

	private DetallePedido[] detalles;
	private java.util.Date fechaCreacion;
	private int total;
	private Socio socio;
	private java.util.Date fechaReparto;
	private EstadoPedido estado;
	private Incidencia[] incidencias;

	public Pedido() {
		// TODO - implement Pedido.Pedido
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param socio
	 */
	public Pedido(Socio socio) {
		// TODO - implement Pedido.Pedido
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param tarjeta
	 */
	public boolean pago(TarjetaBancaria tarjeta) {
		// TODO - implement Pedido.pago
		throw new UnsupportedOperationException();
	}

	public DetallePedido[] getDetalles() {
		return this.detalles;
	}

	/**
	 * 
	 * @param detalles
	 */
	public void setDetalles(DetallePedido[] detalles) {
		this.detalles = detalles;
	}

	public java.util.Date getFechaCreacion() {
		return this.fechaCreacion;
	}

	/**
	 * 
	 * @param fechaCreacion
	 */
	public void setFechaCreacion(java.util.Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public int getTotal() {
		return this.total;
	}

	/**
	 * 
	 * @param total
	 */
	public void setTotal(int total) {
		this.total = total;
	}

	public Socio getSocio() {
		return this.socio;
	}

	/**
	 * 
	 * @param socio
	 */
	public void setSocio(Socio socio) {
		this.socio = socio;
	}

	public java.util.Date getFechaReparto() {
		return this.fechaReparto;
	}

	/**
	 * 
	 * @param fechaReparto
	 */
	public void setFechaReparto(java.util.Date fechaReparto) {
		this.fechaReparto = fechaReparto;
	}

	public EstadoPedido getEstado() {
		return this.estado;
	}

	/**
	 * 
	 * @param estado
	 */
	public void setEstado(EstadoPedido estado) {
		this.estado = estado;
	}

	public Incidencia[] getIncidencias() {
		return this.incidencias;
	}

	/**
	 * 
	 * @param incidencias
	 */
	public void setIncidencias(Incidencia[] incidencias) {
		this.incidencias = incidencias;
	}

}