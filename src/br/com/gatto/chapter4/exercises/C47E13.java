package br.com.gatto.chapter4.exercises;

/**
 * 13. A resposta certa é (a). O código não compila pois o método replace possui
 * duas maneiras de ser invocado: com dois chars ou com duas Strings.
 * Foram passados uma String e um char,método que não existe.
 */
public class C47E13 {
	public static void main(String[] args) {
		String s = "estudando para a certificação";
		//s.replace("e", 'a');
		System.out.println(s);
	}
}
