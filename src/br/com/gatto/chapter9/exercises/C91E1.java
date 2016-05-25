package br.com.gatto.chapter9.exercises;

/**
 * 1. Aqui não ocorre sobrescrita. Como os parâmetros são diferentes, ocorre uma
 * sobrecarga (não confundir na prova overload com overwrite). Ou seja, é um
 * overload com herança.
 */
class C91E1 {
	public void method(long l) {

	}
}

class B91E1 extends C91E1 {
	protected void method(int i) {

	}
}
