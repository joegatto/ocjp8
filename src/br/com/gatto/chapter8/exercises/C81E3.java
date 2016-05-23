package br.com.gatto.chapter8.exercises;

/**
 * 3. A resposta certa é (b). O código não compila porque o método c retorna um
 * long, e esse long é utilizado como retorno no método a e no método b. Ambos
 * precisam de um retorno do tipo int, que não tem conversão automática.
 */
public class C81E3 {
	// public static void main(String[] args) {
	// System.out.println(a(args.length));
	// }
	//
	// static int a(int l) {
	// if (l < 10)
	// return b(1);
	// else
	// return c();
	// }
	//
	// static int b(int l) {
	// if (l < 10)
	// return b(l);
	// else
	// return c();
	// }
	//
	// static long c() {
	// return 3;
	// }
}
