package com.stefa.hackathon.projeto.controller;

import com.stefa.hackathon.projeto.business.Palindromo;

public class PalindromoController {

	public String verificaPalindromo2(String p) {

		boolean rs = new Palindromo().ePalindromo2(p);

		if (rs)
			return "é palindromo";
		else
			return "não é palindromo";

	}

	public String verificaPalindromo(String p) {
		boolean rs = new Palindromo().ePalindromo(p);

		if (rs)
			return "é palindromo";
		else
			return "não é palindromo";
	}
}
