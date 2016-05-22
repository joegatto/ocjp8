package br.com.gatto.chapter6.exercises;

/**
 * 4. A resposta certa é (c). O programa inicializa i para o tamanho do array,
 * acessando uma posição inexistente. Portanto dá erro em execução (exception).
 */
public class C61E4 {
	public static void main(String[] args) {
		int x[] = new int[3];
		for (int i = x.length; i >= 0; i--)
			x[i] = i * 2;
		System.out.println("end!");
	}
}
