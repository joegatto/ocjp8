package br.com.gatto.chapter5.exercises;

/**
 * 3. A resposta certa é (c). Compila e imprime true, true. Por mais que
 * substring devolva uma nova String, nesse caso ele devolveu a String inteira,
 * a própria String.
 */
public class C53E3 {
	public static void main(String[] args) {
		String s1 = "s1";
		String s2 = s1.substring(0, 2);
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
}
