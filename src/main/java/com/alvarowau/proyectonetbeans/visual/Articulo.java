package com.alvarowau.proyectonetbeans.visual;

public class Articulo {

	private String nombre;
	private String descripcion;
	private String material;
	private String color;
	private float precio;
	private int stock;
	private Firma firma;
	private Campania campania;

	public Articulo() {
		// TODO - implement Articulo.Articulo
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

	public String getDescripcion() {
		return this.descripcion;
	}

	/**
	 * 
	 * @param descripcion
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getMaterial() {
		return this.material;
	}

	/**
	 * 
	 * @param material
	 */
	public void setMaterial(String material) {
		this.material = material;
	}

	public String getColor() {
		return this.color;
	}

	/**
	 * 
	 * @param color
	 */
	public void setColor(String color) {
		this.color = color;
	}

	public float getPrecio() {
		return this.precio;
	}

	/**
	 * 
	 * @param precio
	 */
	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getStock() {
		return this.stock;
	}

	/**
	 * 
	 * @param stock
	 */
	public void setStock(int stock) {
		this.stock = stock;
	}

	public Firma getFirma() {
		return this.firma;
	}

	/**
	 * 
	 * @param firma
	 */
	public void setFirma(Firma firma) {
		this.firma = firma;
	}

	public Campania getCampania() {
		return this.campania;
	}

	/**
	 * 
	 * @param campania
	 */
	public void setCampania(Campania campania) {
		this.campania = campania;
	}

	/**
	 * 
	 * @param nombre
	 * @param String
	 * @param descripcion
	 * @param material
	 * @param color
	 * @param precio
	 * @param stock
	 * @param firma
	 * @param campania
	 */
	public Articulo(int nombre, int String, String descripcion, String material, String color, float precio, int stock, Firma firma, Campania campania) {
		// TODO - implement Articulo.Articulo
		throw new UnsupportedOperationException();
	}

}