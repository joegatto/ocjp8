package br.com.gatto.chapter8.exercises;


/**
 * 3. Aresposta certa � (b). N�o compila na declara��o dom�todo private
public.
 *
 */
public class C86E3 {
//	private public int a(int b) {
//		return b(b) - 1;
//	}

	private static int b(int b) {
		return b - 1;
	}

	public static void main(String[] args) {
//		System.out.println(new C86E2().a(5));
	}
}

