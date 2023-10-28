package com.estudo.model;

import java.util.HashMap;
import java.util.Map;

public class Caminho {
	
	private Integer id;
	private String titulo;
	private String descricao;
	private Boolean precisaChave = false;
	private Boolean possuiChave = false;
	private Boolean sucesso = true;
	private Map<Integer, Caminho> mapCaminhos;

	public Caminho() {
		super();
	}
	
	public Caminho(Integer id, String titulo, String descricao) {
		this(id, titulo, descricao, true);
	}

	public Caminho(Integer id, String titulo, String descricao, Boolean sucesso) {
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.sucesso = sucesso;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Boolean getPrecisaChave() {
		return precisaChave;
	}

	public void setPrecisaChave(Boolean precisaChave) {
		this.precisaChave = precisaChave;
	}

	public Boolean getPossuiChave() {
		return possuiChave;
	}

	public void setPossuiChave(Boolean possuiChave) {
		this.possuiChave = possuiChave;
	}

	public Boolean getSucesso() {
		return sucesso;
	}

	public void setSucesso(Boolean sucesso) {
		this.sucesso = sucesso;
	}

	public Map<Integer, Caminho> getMapCaminhos() {
		if (mapCaminhos == null) {
			mapCaminhos = new HashMap<>();
		}

		return mapCaminhos;
	}

	public void setMapCaminhos(Map<Integer, Caminho> mapCaminhos) {
		this.mapCaminhos = mapCaminhos;
	}
}
