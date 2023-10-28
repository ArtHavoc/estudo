package com.estudo;

import java.util.Scanner;

import com.estudo.service.GameMsgService;

public class AlexandrejogoApplication {
	
	private static GameMsgService gameMsgService;
	
	static String keyWord = "pikachu";
	static String personagem = "";
	static String letrasUsadas = ""; 
	static String palavraAdivinhada = "";
	static int MAX_TENTATIVAS= 10;

	public static void main(String[] args) {
		gameMsgService = new GameMsgService();
		game();
	}

	private static void game() {
		for (int i= 0; i< keyWord.length() ; i++) {
			personagem += "_ ";			
		}
		
		for (int tentativas = 0;;tentativas++) {
		   if (tentativas == MAX_TENTATIVAS) {
			   System.out.printf(gameMsgService.getLoseMsg());
			   System.exit(0);
		   }
		
		   System.out.println("Digite uma letra: ");
		   char letraTentada = new Scanner(System.in).next().charAt(0);
			
			if (letrasUsadas.indexOf(letraTentada) >= 0) {
				System.out.println(gameMsgService.getHitMissMsg(letraTentada));
			}
			else {
				letrasUsadas += letraTentada;
			
				if (keyWord.indexOf(letraTentada) >= 0) {
					palavraAdivinhada = "";
				
					for (int j = 0; j < keyWord.length(); j++) {
						palavraAdivinhada += letrasUsadas.indexOf(keyWord.charAt(j)) >= 0 ? keyWord.charAt(j) + " " : "_ ";
					}
				
					if (palavraAdivinhada.contains("_")) {
						System.out.printf(gameMsgService.getHitMsg(letraTentada));
					}
					else { 
						System.out.printf(gameMsgService.getWinMsg());
						System.exit(0);
					}
				}
			}
			
			System.out.println(palavraAdivinhada);
		}
	}
}
