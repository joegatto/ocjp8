package br.com.gatto.chapter5.exercises;

/**
 * 5. A resposta certa é (b). O código não compila pois o else não está aplicado
 * ao if: para ser aplicado ao if, ele deve vir imediatamente após seu bloco.
 * Como o if não possui chaves, somente a primeira linha pertence a ele.
 */
public class C54E5 {
	public static void main(String[] args) {
		String name = args[0];
		if (name.equals("guilherme"))
			System.out.println(name);
			System.out.println("good");
		// else
			System.out.println("better");
			System.out.println(name);
	}
}
