package com.estudo;

import java.util.Arrays;
import java.util.List;

public class TesteAle {

	static String nome = "1 fsdfljds lfs jfsjdfsd";
	static char letraA = 'A';
	static String word;
	static int[] ladosDado = {1, 2, 3, 4, 5, 6};
	
	public static void main(String[] args) {
//		int[] listIdade = {10, 12, 20};
//		
//		String[] listName2 = new String[3];
//		listName2[0] = "Ale";
//		listName2[1] = "Artur";
//		listName2[2] = "Eli";
//		
//
//		for (String obj : getListWords()) {
//			System.out.println(mask(obj));
//		}
//		
//		for (int i = 0; i < getListWords().size(); i++) {
//			System.out.println(mask(getListWords().get(i)));
//		}
		
//		String n1 = "Ale";
//		String n2 = "Ale";
		
		//System.out.println(!n1.equals(n2));
//		System.out.println(!false);
		
		//initGame();
		
		System.out.println(ladosDado[2]);
	}
	
	public static void initGame() {
		List<String> listWord = getListWords();
		int index = (int)(Math.random() * listWord.size());
		word = listWord.get(index);

		System.out.println("sua palavra é: " + mask(word));
	}

	public static String mask(String word) {
		String resultMask = "";
		
		for (Integer i = 0; i < word.length(); i++) {
			resultMask += "_ ";
		}
		
		return resultMask.trim();
	}
	
	public static List<String> getListWords() {
		return Arrays.asList("paralelepipedo", "abacaxi", "melao", "rua", "balao");
	}
}
