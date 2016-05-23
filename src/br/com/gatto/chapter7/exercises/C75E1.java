package br.com.gatto.chapter7.exercises;

/**
 * 1. O c�digo n�o compila pois o segundo if est� fora do bloco do for e tenta
 * acessar uma vari�vel definida dentro dele. Lembre-se que o escopo de um bloco
 * for sem chaves � uma �nica instru��o, no caso o primeiro if else if.
 */
public class C75E1 {
	public static void main(String[] args) {
		outside: for (int a = 0; a < 30; a++)
			for (int b = 0; b < 1; b++)
				if (a + b == 25)
					continue outside;
				else if (a + b == 20)
					break outside;
		// if(a==0) break outside;
		// else System.out.println(a);
	}
}
