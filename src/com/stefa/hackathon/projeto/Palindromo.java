package com.stefa.hackathon.projeto;

public class Palindromo {

	/*
	 * Método com charAt
	 */
	public boolean ePalindromo(String palavra) {

		int meio = palavra.length() / 2;

		for (int i = 0; i < meio; i++) {
			if (palavra.charAt(i) != palavra.charAt(palavra.length() - 1 - i))
				return false;
		}
		return true;
	}

	/*
	 * Método com StringBuilder
	 */
	public boolean ePalindromo2(String palavra) {
		return palavra.equals(new StringBuilder(palavra).reverse().toString());
	}
}
