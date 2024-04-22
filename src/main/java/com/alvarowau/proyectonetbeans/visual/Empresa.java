package com.alvarowau.proyectonetbeans.visual;

public class Empresa {

	private String nombre;
	private String CIF;
	private Direccion domicilioFiscal;

	public Empresa() {
		// TODO - implement Empresa.Empresa
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nombre
	 * @param CIF
	 * @param domicilioFiscal
	 */
	public Empresa(String nombre, String CIF, Direccion domicilioFiscal) {
		// TODO - implement Empresa.Empresa
		throw new UnsupportedOperationException();
	}

	public String getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCIF() {
		// TODO - implement Empresa.getCIF
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param CIF
	 */
	public void setCIF(String CIF) {
		// TODO - implement Empresa.setCIF
		throw new UnsupportedOperationException();
	}

	public Direccion getDomicilioFiscal() {
		return this.domicilioFiscal;
	}

	/**
	 * 
	 * @param domicilioFiscal
	 */
	public void setDomicilioFiscal(Direccion domicilioFiscal) {
		this.domicilioFiscal = domicilioFiscal;
	}

}