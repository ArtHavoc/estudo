package com.estudo.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.estudo.enums.ItemEnum;

public class Caminho {
	
	private Integer id;
	private String titulo;
	private String descricao;
	private Boolean sucesso = true;
	private ItemEnum itemNecessario;
	private List<ItemEnum> listItems;
	private Map<Integer, Caminho> mapCaminhos;

	public Caminho() {
		super();
	}

	public Caminho(Integer id, String titulo, String descricao) {
		this(id, titulo, descricao, null, true);
	}

	public Caminho(Integer id, String titulo, String descricao, ItemEnum itemNecessario) {
		this(id, titulo, descricao, itemNecessario, true);
	}

	public Caminho(Integer id, String titulo, String descricao, ItemEnum itemNecessario, Boolean sucesso) {
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.sucesso = sucesso;
		this.itemNecessario = itemNecessario;
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

	public Boolean getSucesso() {
		return sucesso;
	}

	public void setSucesso(Boolean sucesso) {
		this.sucesso = sucesso;
	}

	public List<ItemEnum> getListItems() {
		if (listItems == null) {
			listItems = new ArrayList<>();
		}

		return listItems;
	}

	public void setListItems(List<ItemEnum> listItems) {
		this.listItems = listItems;
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

	public ItemEnum getItemNecessario() {
		return itemNecessario;
	}

	public void setItemNecessario(ItemEnum itemNecessario) {
		this.itemNecessario = itemNecessario;
	}
}
