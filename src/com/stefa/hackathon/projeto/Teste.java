package com.stefa.hackathon.projeto;

import com.stefa.hackathon.projeto.controller.PalindromoController;

public class Teste {

	public static void main(String[] a) {
		String palavra = "amoreroma";
//		String palavra = "11211";
//		String palavra = "ana";
//		String palavra = "leonardo";

		PalindromoController palindromo = new PalindromoController();

		System.out.println(palavra + ": " + palindromo.verificaPalindromo(palavra));

//		System.out.println(palavra + ": " + palindromo.verificaPalindromo2(palavra));
	}
}