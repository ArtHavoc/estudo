package com.estudo.model;

import java.util.ArrayList;
import java.util.List;

import com.estudo.enums.ItemEnum;

public class Aventureiro {
	
	private String nome;
	private List<Caminho> listCaminho;
	private List<ItemEnum> listItems;

	public Aventureiro() {
		super();
	}
	
	public Aventureiro(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Caminho> getListCaminho() {
		if (listCaminho == null) {
			listCaminho = new ArrayList<>();
		}

		return listCaminho;
	}

	public void setListCaminho(List<Caminho> listCaminho) {
		this.listCaminho = listCaminho;
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
}
