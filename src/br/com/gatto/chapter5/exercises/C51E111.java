package br.com.gatto.chapter5.exercises;

/**
 * 11. A resposta certa � (c). O c�digo compila e imprime positivo infinito. A
 * preced�ncia de operadores � primeiro a divis�o, por isso compila.
 */
public class C51E111 {
	public static void main(String[] args) {
		String result = "results: " + 15 / 0.0;
		System.out.println(result);
	}
}
