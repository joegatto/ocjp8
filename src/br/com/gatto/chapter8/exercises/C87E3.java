package br.com.gatto.chapter8.exercises;

/**
 * 3. A resposta certa é (b). Compila e imprime 0, existe shadowing aqui no
 * setter.
 */
class C87E3 {
	public static void main(String[] args) {
		B87E3 b = new B87E3();
		b.setB(5);
		System.out.println(b.getB());
	}
}

class B87E3 {
	private int b;

	public int getB() {
		return b;
	}

	public void setB(int b) {
		b = b;
	}
}
