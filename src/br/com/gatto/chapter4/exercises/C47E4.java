package br.com.gatto.chapter4.exercises;

/**
 * 4. A resposta certa é (a). ‘Caelum‘ e ‘Caelum - Ensino e Inovação‘.
 */
public class C47E4 {
	public static void main(String[] args) {
		String s = "Caelum";
		s.concat(" - Ensino e Inova��o");
		System.out.println(s);

		StringBuffer s1 = new StringBuffer("Caelum");
		s1.append(" - Ensino e Inova��o");
		System.out.println(s1);
	}
}
