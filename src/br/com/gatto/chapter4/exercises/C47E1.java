package br.com.gatto.chapter4.exercises;

public class C47E1 {
	public static void main(String[] args) {
		String s = "aba";
		for (int i = 0; i < 9; i++) {
			s = s + "aba";
		}
		/* System.out.println(s.length); - ERRO DE COMPILAÇÃO - length é um metodo da classe String, não um atributo. */
	}
}
