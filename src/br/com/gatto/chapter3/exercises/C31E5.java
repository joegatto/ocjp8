package br.com.gatto.chapter3.exercises;

/**
 * 5. A resposta certa � (d). Isso porque o acesso � vari�vel est�tica pode ser
 * feito atrav�s da inst�ncia da classe ou diretamente caso seja uma vari�vel
 * est�tica sendo acessada por um m�todo est�tico.
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
