package br.com.gatto.chapter7.exercises;


/**
 * 2. A resposta certa � (d). Compila e imprime 0 at� 19, 21 at� 24, 26 at� 29.
 */
public class C75E2 {
	public static void main(String[] args) {
		outside: for (int a = 0; a < 30; a++)
		for (int b = 0; b < 1; b++)
		if(a+b==25) continue outside;
		else if (a+b==20) break;
		else System.out.println(a);
	}
}
