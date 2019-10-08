package com.stefa.hackathon.projeto;

import javax.swing.JOptionPane;

import com.stefa.hackathon.projeto.controller.PalindromoController;

public class Teste {

	public static void main(String[] a) {

		String palavra = JOptionPane.showInputDialog("Informe a palara:");

		String palindromo = new PalindromoController().verificaPalindromo2(palavra);

		JOptionPane.showMessageDialog(null, palavra + ": " + palindromo);

	}
}