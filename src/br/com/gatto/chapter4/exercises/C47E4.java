package br.com.gatto.chapter4.exercises;

public class C47E4 {
	public static void main(String[] args) {
		String s = "Caelum";
		s.concat(" - Ensino e Inovação");
		System.out.println(s);

		StringBuffer s1 = new StringBuffer("Caelum");
		s1.append(" - Ensino e Inovação");
		System.out.println(s1);
	}
}
