package com.stefa.hackathon.projeto;

public class PalindromoController {

	public String verificaPalindromo(String p) {

		boolean rs = new Palindromo().ePalindromo(p);

		if (rs)
			return "É Palindromo";
		else
			return "Não é Palindromo";

	}

	public String verificaPalindromo2(String p) {
		boolean rs = new Palindromo().ePalindromo2(p);

		if (rs)
			return "É Palindromo";
		else
			return "Não é Palindromo";

	}
}
