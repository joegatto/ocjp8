package br.com.gatto.chapter4.exercises;

/**
 * 1. A resposta certa é (b). O código compila e devido à regra de sempre
 * invocar omais específico, ele sempre invoca ométodo sem argumentos. Portanto,
 * o resultado é vazio/vazio. Lembre-se que em Java a ordem de definição de
 * métodos não importa para a invocação. Já a ordem das variáveis pode importar,
 * caso uma dependa da outra.
 */
public class C45E1 {
	public static void main(String[] args) {
		new D().x();
		new E().x();
	}
}

class D {
	void x() {
		System.out.println("empty");
	}

	void x(String... args) {
		System.out.println(args.length);
	}
}

class E {
	void x(String... args) {
		System.out.println(args.length);
	}

	void x() {
		System.out.println("empty");
	}

}
