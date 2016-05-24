package br.com.gatto.chapter8.exercises;

/**
 * 2. A resposta certa é (c). Compila e imprime 5.
 */
class C87E2 {
	public static void main(String[] args) {
		B87E2 b = new B87E2();
		b.setB(5);
		System.out.println(b.getB());
	}
}

class B87E2 {
	private int b;

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
}
