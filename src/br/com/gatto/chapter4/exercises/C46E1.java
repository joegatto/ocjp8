package br.com.gatto.chapter4.exercises;

/**
 * 1. A resposta certa � (e). O array come�a na posi��o 0, portanto, o primeiro
 * caractere removido se encontra na posi��o 2, o i. Ele remove todos os
 * caracteres at� a posi��o 3, exceto o da posi��o 3, portanto somente o i �
 * removido.
 */
public class C46E1 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("guilherme").delete(2, 3);
		System.out.println(sb);
	}
}
