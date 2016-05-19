package br.com.gatto.chapter4.exercises;

/**
 * 2. A resposta certa é (a). Os dois métodos retornam -1 quando não encontram
 * nada, portanto, o segundo resultado é -2. Como a posição começa em 0, o
 * resultado das letras e são 5 e 8, totalizando 13.
 */
public class C46E2 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("guilherme");
		System.out.println(sb.indexOf("e") + sb.lastIndexOf("e"));
		System.out.println(sb.indexOf("k") + sb.lastIndexOf("k"));
	}
}
