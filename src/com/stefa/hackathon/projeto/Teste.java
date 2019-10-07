package com.stefa.hackathon.projeto;

public class Teste {

	public static void main(String[] a) {
		String palavra = "amoreroma";

		PalindromoController string = new PalindromoController();

		String verifica = string.verificaPalindromo(palavra);
		System.out.println(palavra + " " + verifica);

		String verifica2 = string.verificaPalindromo2(palavra);
		System.out.println(palavra + " " + verifica2);
	}
}