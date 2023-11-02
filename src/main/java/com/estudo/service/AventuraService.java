package com.estudo.service;

import java.util.List;
import java.util.Scanner;

import com.estudo.enums.ItemEnum;
import com.estudo.exception.GameEndSuccessException;
import com.estudo.exception.GameException;
import com.estudo.exception.GameItemException;
import com.estudo.exception.GameOverException;
import com.estudo.model.Aventureiro;
import com.estudo.model.Caminho;
import com.estudo.repository.AventuraRepository;

public class AventuraService {
	
	private Scanner scan;
	private AventuraRepository aventuraRepository;
	
	public AventuraService() {
		scan = new Scanner(System.in);
		aventuraRepository = new AventuraRepository();
	}

	public void comecarAventura() throws GameException {
		Aventureiro aventureiro = new Aventureiro();
		Caminho caminho = aventuraRepository.carregarAventura();
		String opcao;
		
		carregarApresentacao(aventureiro);

		while (true) {
			try {
				print(caminho, aventureiro);
				opcao = cmd();
				caminho = caminho.getMapCaminhos().get(Integer.valueOf(opcao));
				aventureiro.getListCaminho().add(caminho);

				checkGameOver(caminho);
				checkPossuiItem(caminho, aventureiro);
				checkGameSuccess(caminho);
			}
			catch (NumberFormatException e) {
				p("Opção inválida. Tente novamente.");
			}
		}
	}

	private void checkGameSuccess(Caminho caminho) throws GameException {
		if (caminho == null || caminho.getMapCaminhos().size() == 0) {
			throw new GameEndSuccessException("Parabens, saiu do outro lado");
		}
	}

	private void checkGameOver(Caminho caminho) throws GameException {
		if (caminho != null && !caminho.getSucesso()) {
			throw new GameOverException("Xiiii, se deu mal, gameOver");
		}
	}

	private void checkPossuiItem(Caminho caminho, Aventureiro aventureiro) throws GameException {
		if (caminho != null && caminho.getItemNecessario() != null && !aventureiro.getListItems().contains(caminho.getItemNecessario())) {
			throw new GameItemException(aventureiro.getNome() + " não possui " + caminho.getItemNecessario().getDesc() + " que é necessário para esse caminho!");
		}
	}

	private void print(Caminho caminho, Aventureiro aventureiro) {
		p(caminho.getTitulo());
		selectItem(caminho, aventureiro);

		p(caminho.getDescricao());
		
		for (Integer id : caminho.getMapCaminhos().keySet()) {
			p(id + " - " + caminho.getMapCaminhos().get(id).getTitulo());
		}
	}
	
	private void selectItem(Caminho caminho, Aventureiro aventureiro) {
		if (printItems(caminho, aventureiro)) {
			aventureiro.getListItems().add(opcaoItem(caminho.getListItems()));
		}
	}

	private boolean printItems(Caminho caminho, Aventureiro aventureiro) {
		if (!caminho.getListItems().isEmpty()) {
			int id = 0;
			p("No caminho, "+ aventureiro.getNome() + " encontra alguns itens.\nQual irá escolher:");

			for (ItemEnum item : caminho.getListItems()) {
				p((++id) + " - " + item.getDesc());
			}
			
			return true;
		}
		
		return false;
	}
	
	private ItemEnum opcaoItem(List<ItemEnum> listItem) {
		try {
			int idOpcao = Integer.valueOf(cmd());

			return listItem.get(idOpcao - 1);
		}
		catch (Exception e) {
			p("Opção inválida. Tente novamente.");
			return opcaoItem(listItem);
		}
	}

	private void carregarApresentacao(Aventureiro aventureiro) {
		p(aventuraRepository.carregarApresentacao());
		aventureiro.setNome(cmd());
	}
	
	private void p(String m) {
		System.out.println(m);
	}
	
	private String cmd() {
		String cmd = scan.next();

		if (cmd.equalsIgnoreCase("sair")) {
			System.exit(0);
		}

		return cmd;
	}
}
