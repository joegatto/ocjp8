package br.com.gatto.chapter4.exercises;

/**
 * 2. A resposta certa é (e). O código compila e imprime 2.
 */
class C45E3 {
	public static void main(String[] args) {
		new G().x(new int[] { 23789, 673482 });
	}
}

class G {
	void x(int... x) {
		System.out.println(x.length);
	}
}
