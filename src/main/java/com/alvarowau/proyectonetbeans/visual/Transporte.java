package com.alvarowau.proyectonetbeans.visual;

public class Transporte extends Empresa {

	private Ruta[] rutas;

	public Transporte() {
		// TODO - implement Transporte.Transporte
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nombre
	 * @param CIF
	 * @param domicilioFiscal
	 */
	public void Transporter(String nombre, String CIF, Direccion domicilioFiscal) {
		// TODO - implement Transporte.Transporter
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param pedido
	 * @param fecha
	 * @param descripcion
	 */
	public void crearIncidencia(Pedido pedido, java.util.Date fecha, String descripcion) {
		// TODO - implement Transporte.crearIncidencia
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param destino
	 */
	public Ruta asignarRuta(String destino) {
		// TODO - implement Transporte.asignarRuta
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param pedido
	 */
	public void repartirPedido(Pedido pedido) {
		// TODO - implement Transporte.repartirPedido
		throw new UnsupportedOperationException();
	}

	public Ruta[] getRutas() {
		return this.rutas;
	}

	/**
	 * 
	 * @param rutas
	 */
	public void setRutas(Ruta[] rutas) {
		this.rutas = rutas;
	}

}