package br.com.gatto.chapter4.exercises;

/**
 * 1. A resposta certa � (b). O c�digo compila e devido � regra de sempre
 * invocar omais espec�fico, ele sempre invoca om�todo sem argumentos. Portanto,
 * o resultado � vazio/vazio. Lembre-se que em Java a ordem de defini��o de
 * m�todos n�o importa para a invoca��o. J� a ordem das vari�veis pode importar,
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
