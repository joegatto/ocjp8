package br.com.gatto.chapter8.exercises;

/**
 * 1. A resposta certa é (b). Compila e imprime 0, são duas instâncias de B!.
 */
class C87E1 {
	public static void main(String[] args) {
		new B87E1().setB(5);
		System.out.println(new B87E1().getB());
	}
}

class B87E1 {
	private int b;

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
}
