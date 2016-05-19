package br.com.gatto.chapter4.exercises;

/**
 * 4. A resposta certa é (e). O código compila e imprime 2. Esse é o caso
 * absurdo onde o array é tanto um Object quanto um array de Object. Por padrão o
 * Java tratará como um array de Object.
 */
class C45E4 {
	public static void main(String[] args) {
		new H().x(new Object[] { 23789, 673482 });
	}
}

class H {
	void x(Object... x) {
		System.out.println(x.length);
	}
}
