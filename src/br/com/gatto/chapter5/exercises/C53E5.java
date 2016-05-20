package br.com.gatto.chapter5.exercises;

/**
 * 5. A resposta certa é (a). O código não compila pois D não é do tipo C.
 */
public class C53E5 {
	public static void main(String[] args) {
		C a = new C();
		// C b = new D();
		//
		// a.x = 1;
		// b.x = 1;
		// System.out.println(a==b);
		// System.out.println(a.equals(b));
	}
}

class D {
	int x;
}
