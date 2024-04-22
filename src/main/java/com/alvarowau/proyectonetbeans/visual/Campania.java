package com.alvarowau.proyectonetbeans.visual;

public class Campania {

	private Temporada temporada;
	private int anio;
	private boolean activada;

	public Campania() {
		// TODO - implement Campania.Campania
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param temprada
	 * @param anio
	 */
	public Campania(Temporada temprada, int anio) {
		// TODO - implement Campania.Campania
		throw new UnsupportedOperationException();
	}

	public Temporada getTemporada() {
		return this.temporada;
	}

	/**
	 * 
	 * @param temporada
	 */
	public void setTemporada(Temporada temporada) {
		this.temporada = temporada;
	}

	public int getAnio() {
		return this.anio;
	}

	/**
	 * 
	 * @param anio
	 */
	public void setAnio(int anio) {
		this.anio = anio;
	}

	public boolean getActivada() {
		return this.activada;
	}

	/**
	 * 
	 * @param activada
	 */
	public void setActivada(boolean activada) {
		this.activada = activada;
	}

}