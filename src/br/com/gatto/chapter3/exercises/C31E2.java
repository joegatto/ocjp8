package br.com.gatto.chapter3.exercises;

/**
 * 2. A resposta certa � (a). A vari�vel i n�o pode ser acessada fora do la�o,
 * repare que o la�o n�o foi declarado com {, uma pegadinha cl�ssica da prova.
 */

public class C31E2 {
	public static void main(String[] args) {
		for (int i = 0; i < 20; i++)
			System.out.println(i);
		/* System.out.println(i); */
		System.out.println("Finished");
	}
}
