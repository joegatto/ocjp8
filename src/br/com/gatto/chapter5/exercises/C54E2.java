package br.com.gatto.chapter5.exercises;

/**
 * 2. A resposta certa é (a). O código não compila pois a variável valor é final
 * e não pode ser alterada, mas tentamos efetuar uma atribuição dentro do if.
 */
public class C54E2 {
	public static void main(String[] args) {
		B1 b = new B1();
		// if (b.valor = true) {
		// System.out.println("uhu true");
		// }
	}
}

class B1 {
	final boolean valor = false;
}