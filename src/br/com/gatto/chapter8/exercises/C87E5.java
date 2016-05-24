package br.com.gatto.chapter8.exercises;

/**
 * 5. A resposta certa é (d). Compila e imprime 10, existe shadowing aqui no
 * setter, então não há problema de a variável ser final.
 */
class C87E5 {
	public static void main(String[] args) {
		B87E5 b = new B87E5(10);
		b.setB(5);
		System.out.println(b.getB());
	}
}

class B87E5 {
	private final int b;

	B87E5(int b) {
		this.b = b;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		b = b;
	}
}
