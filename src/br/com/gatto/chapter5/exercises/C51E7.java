package br.com.gatto.chapter5.exercises;

/**
 * 7. A resposta certa � (b). O c�digo n�o compila na linha 7. O compilador n�o
 * tem certeza se a vari�vel y vai ser iniciada sempre. Como a declara��o �
 * feita e o �nico valor atribu�do � dentro do for, o compilador n�o tem certeza
 * se o for vai ser executado mesmo.
 */
public class C51E7 {
	public static void main(String[] args) {
		int y;
		for (int i = 0; i < 10; ++i) {
			y = i % 5 + 2;
		}
		// System.out.println(y);
	}
}
