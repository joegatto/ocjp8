package br.com.gatto.chapter9.exercises;

/**
 * 7. A resposta certa � (a). O c�digo n�o compila pois, ao sobrescrev�-lo,
 * tentamos definir um escopo menor. N�o compila tamb�m porque o m�todo close �
 * package protected dentro de Account.
 */
public class C93E7 {
	public static void main(String[] args) {
		// new Account().close();
	}
}
