package br.com.gatto.chapter8.exercises;

/**
 * 4. A resposta certa é (b). Compila e imprime 0.
 */
class C87E4 {
	public static void main(String[] args) {
		B87E4 b = new B87E4();
		b.setB(5);
		System.out.println(b.b);
	}
}

class B87E4 {
	int b;

	public void setB(int b) {
		b = b;
	}
}
