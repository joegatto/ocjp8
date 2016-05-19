package br.com.gatto.chapter4.exercises;

/**
 * 1. A resposta certa é (a). Não compila, pois length() é um método de String,
 * diferente dos arrays em que length é um atributo.
 *
 */
public class C47E1 {
	public static void main(String[] args) {
		String s = "aba";
		for (int i = 0; i < 9; i++) {
			s = s + "aba";
		}
		/*
		 * System.out.println(s.length); - ERRO DE COMPILA��O - length � um
		 * metodo da classe String, n�o um atributo.
		 */
	}
}
