package com.estudo.service;

import java.util.Scanner;

import com.estudo.model.Caminho;
import com.estudo.repository.AventuraRepository;

public class AventuraService {
	
	private Scanner scan;
	
	public AventuraService() {
		scan = new Scanner(System.in);
	}

	public void comecarAventura() {
		Caminho caminho = new AventuraRepository().carregarAventura();
		String opcao;
		
		while (true) {
			print(caminho);
			opcao = cmd();
			caminho = caminho.getMapCaminhos().get(Integer.valueOf(opcao));

			if (caminho != null && !caminho.getSucesso()) {
				System.out.println("Xiiii, se deu mal, gameOver");
				break;
			}

			if (caminho == null || caminho.getMapCaminhos().size() == 0) {
				System.out.println("Parabens, saiu do outro lado");
				break;
			}
		}
	}

	private void print(Caminho caminho) {
		System.out.println(caminho.getTitulo());
		System.out.println(caminho.getDescricao());
		
		for (Integer id : caminho.getMapCaminhos().keySet()) {
			System.out.println(id + " - " + caminho.getMapCaminhos().get(id).getTitulo());
		}
	}
	
	private String cmd() {
		return scan.next();
	}
}
