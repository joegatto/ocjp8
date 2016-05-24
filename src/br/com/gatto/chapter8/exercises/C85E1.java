package br.com.gatto.chapter8.exercises;

/**
 * 1. A resposta certa é (a). Ocódigo não compila por causa do loop, quando um
 * construtor de um tipo chama outro construtor do mesmo tipo em loop direto.
 */
public class C85E1 {
	public static void main(String[] args) {
		new B85E1();
	}
}

class B85E1 {
	// B85E1() {
	// this(1);
	// }
	//
	// B85E1(int i) {
	// this();
	// }
}
