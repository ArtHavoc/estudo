package com.estudo.repository;

import static com.estudo.enums.ItemEnum.ARPAO;
import static com.estudo.enums.ItemEnum.MACHADO;

import java.util.Arrays;

import com.estudo.model.Caminho;

public class AventuraRepository {

	public String carregarApresentacao() {
		StringBuffer sb = new StringBuffer();
		sb.append("Aventureiro inicia sua aventura.\n");
		sb.append("Seu nome é:");
		
		return sb.toString();
	}
	
	public Caminho carregarAventura() {
		Caminho caminho = new Caminho(1, "Floresta", "Personagem entra na floresta e se depara com alternativas");
		Caminho caminhoAlt1 = new Caminho(1, "Praia", "Foi para a praia e trombou com um polvo. Que arma usar");
		Caminho caminhoAlt2 = new Caminho(2, "Montanha", "Foi para a montanha e trombou com um urso. Que arma usar");
		
		caminhoAlt1.setListItems(Arrays.asList(ARPAO, MACHADO));
		
		caminho.getMapCaminhos().put(1, caminhoAlt1);
		caminho.getMapCaminhos().put(2, caminhoAlt2);
		
		Caminho caminhoAlt1Arpao = new Caminho(1, "Arpao", "Atacou com arpao e deu certo", ARPAO);
		Caminho caminhoAlt1PatoBorracha = new Caminho(2, "Pato de borracha", "Atacou com pato de borracha e deu mto ruim", null, false);

		caminhoAlt1.getMapCaminhos().put(1, caminhoAlt1Arpao);
		caminhoAlt1.getMapCaminhos().put(2, caminhoAlt1PatoBorracha);

		Caminho caminhoAlt2Clava = new Caminho(1, "Clava", "Atacou com clava e deu certo");
		Caminho caminhoAlt2Pedra = new Caminho(2, "Pedra", "Atacou com pedra e deu mto ruim", null, false);

		caminhoAlt2.getMapCaminhos().put(1, caminhoAlt2Clava);
		caminhoAlt2.getMapCaminhos().put(2, caminhoAlt2Pedra);

		return caminho;
	}

}
