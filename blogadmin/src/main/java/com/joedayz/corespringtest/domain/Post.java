package com.joedayz.corespringtest.domain;

import java.util.Date;

/**
 * Post generated by @author Susan Inga (susan.inga@joedayz.pe)
 */
public class Post implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -101263275800486838L;
	private Long id;
	private Tema tema = new Tema();
	private String titulo;
	private String descripcion;
	private Date fechaCreacion;

	public Post() {
	}

	public Post(Tema tema, String titulo, String descripcion, Date fechaCreacion) {
		this.tema = tema;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.fechaCreacion = fechaCreacion;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Tema getTema() {
		return this.tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", tema=" + tema + ", titulo=" + titulo
				+ ", fechaCreacion=" + fechaCreacion + "]";
	}
}