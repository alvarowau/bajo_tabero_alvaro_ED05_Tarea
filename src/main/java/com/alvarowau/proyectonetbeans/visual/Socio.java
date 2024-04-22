package com.alvarowau.proyectonetbeans.visual;

public class Socio {

	private String nombreCompleto;
	private String correoElectronico;
	private Direccion direccion;

	public Socio() {
		// TODO - implement Socio.Socio
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nombreCompleto
	 * @param correoElectronico
	 * @param direccion
	 */
	public Socio(String nombreCompleto, String correoElectronico, Direccion direccion) {
		// TODO - implement Socio.Socio
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param detalles
	 */
	public void crearPedido(DetallePedido[] detalles) {
		// TODO - implement Socio.crearPedido
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param pedido
	 */
	public boolean pagarPedido(Pedido pedido) {
		// TODO - implement Socio.pagarPedido
		throw new UnsupportedOperationException();
	}

	public void visualizarPedidos() {
		// TODO - implement Socio.visualizarPedidos
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param pedido
	 */
	public void cancelarPedido(Pedido pedido) {
		// TODO - implement Socio.cancelarPedido
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nombreCompleto
	 * @param correoElectronico
	 * @param direccion
	 */
	public void modificarDatosPersonales(String nombreCompleto, String correoElectronico, Direccion direccion) {
		// TODO - implement Socio.modificarDatosPersonales
		throw new UnsupportedOperationException();
	}

	public String getNombreCompleto() {
		return this.nombreCompleto;
	}

	/**
	 * 
	 * @param nombreCompleto
	 */
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getCorreoElectronico() {
		return this.correoElectronico;
	}

	/**
	 * 
	 * @param correoElectronico
	 */
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public Direccion getDireccion() {
		return this.direccion;
	}

	/**
	 * 
	 * @param direccion
	 */
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

}