package br.com.gatto.chapter4.exercises;

/**
 * 2. A resposta certa � (a). Os dois m�todos retornam -1 quando n�o encontram
 * nada, portanto, o segundo resultado � -2. Como a posi��o come�a em 0, o
 * resultado das letras e s�o 5 e 8, totalizando 13.
 */
public class C46E2 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("guilherme");
		System.out.println(sb.indexOf("e") + sb.lastIndexOf("e"));
		System.out.println(sb.indexOf("k") + sb.lastIndexOf("k"));
	}
}
