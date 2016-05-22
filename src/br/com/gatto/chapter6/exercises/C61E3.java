package br.com.gatto.chapter6.exercises;

/**
 * 3. A resposta certa é (b). O programa não compila pois a segunda e a terceira
 * linha tentam redefinir uma variável já definida. Caso o nome da variável seja
 * corrigido, o código compila e imprime nada ao rodar (um array pode ter
 * tamanho zero).
 */
public class C61E3 {
	public static void main(String[] args) {
		int x[] = new int[0];
		// int x[] = new int[] { 0, 3, 5 };
		// int x[] = { 0, 3, 5 };
	}
}
