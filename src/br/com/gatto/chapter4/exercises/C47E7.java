package br.com.gatto.chapter4.exercises;

/**
 * 7. Aresposta certa é (b). Não compila por outromotivo: a variável vazio não é
 * estática.
 */
class C47E7 {
	String empty;

	public static void main(String[] args) {
		/*
		 * String full = "Welcome" + empty; ERRO DE COMPILAÇÃO - metodo estatico
		 * tenta acessar uma variavel não estatica.
		 */
		// System.out.println(full);
	}
}
