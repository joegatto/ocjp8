package br.com.gatto.chapter4.exercises;

/**
 * 4. A resposta certa � (e). O c�digo compila e imprime 2. Esse � o caso
 * absurdo onde o array � tanto um Object quanto um array de Object. Por padr�o o
 * Java tratar� como um array de Object.
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
