package com.estudo;

import com.estudo.exception.GameException;
import com.estudo.service.AventuraService;

public class AventuraApp {

	public static void main(String[] args) {
		try {
			new AventuraService().comecarAventura();
		}
		catch (GameException e) {
			System.out.println(e.getMessage());
		}
	}
}
