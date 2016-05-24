package br.com.gatto.chapter8.exercises;

/**
 * 7. A resposta certa é (a). Não compila, pois tem várias variáveis locais
 * (parâmetros) com o mesmo nome.
 */
public class C83E7 {
	static int a(D3 d, B3 b) {
		return 1;
	}

	// static int a(C3 c, C3 c) {
	// return 2;
	// }
	//
	// static int a(B3 b, B3 b) {
	// return 3;
	// }
	//
	// static int a(C83E7 a, C83E7 a) {
	// return 4;
	// }

	public static void main(String[] args) {
		System.out.println(a(new D3(), new D3()));
	}
}
