package br.com.gatto.chapter3.exercises;

/**
 * 5. A resposta certa é (d). Isso porque o acesso à variável estática pode ser
 * feito através da instância da classe ou diretamente caso seja uma variável
 * estática sendo acessada por um método estático.
 *
 */
public class C31E5 {
	static int i = 3;

	public static void main(String[] a) {
		for (new C31E5().i = 10; new C31E5().i < 100; new C31E5().i++) {
			System.out.println(i);
		}
	}
}
