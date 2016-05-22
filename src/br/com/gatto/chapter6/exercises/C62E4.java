package br.com.gatto.chapter6.exercises;

/**
 * 4. A resposta certa é (a). Nesse exemplo, é guardado um valor double em uma
 * das posições do array de int id. Isso está incorreto portanto não compila. Na
 * declaração do array de duas dimensões tb, são informados os tamanhos das
 * dimensões. Errado pois os tamanhos devem ser definidos na inicialização e não
 * na declaração. Na inicialização do array cb, não foi colocado o tamanho de
 * nenhuma das dimensões.
 */
public class C62E4 {
	public static void main(String[] args) {
		int[] id = new int[10];
		// id[0] = 1.0;
		//
		// int[10][10] tb = new int[10][10];
		//
		// int[][][] cb = new int [][][];
	}
}
