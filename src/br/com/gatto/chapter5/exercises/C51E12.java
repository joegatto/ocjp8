package br.com.gatto.chapter5.exercises;

/**
 * 2. Aresposta certa � (c). N�o compila, pois toda conta devolve no m�nimo um
 * int, e um int n�o cabe em um byte.
 */
public class C51E12 {
	public static void main(String[] args) {
		byte b1 = 127;
		byte b2 = -128;
		// byte b3 = b1 + b2;
		// System.out.println(b3);
	}
}
