package br.com.gatto.chapter12.exercises;

/**
 * 5. A resposta certa é (d). Erro de compilação na linha B.
 */
public class C121E5 {

	public static void main(String[] args) {
		int a = Short.parseShort("126"); // A
		// short s = Integer.parseInt("23").shortValue(); // B
		double h = Double.valueOf("27").floatValue(); // C
		// System.out.println(a + s);
	}

}
