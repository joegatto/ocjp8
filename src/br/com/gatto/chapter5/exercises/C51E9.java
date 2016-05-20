package br.com.gatto.chapter5.exercises;

/**
 * 9. A resposta certa é (e). Compila, roda e imprime A75. Cuidado ao compilar e
 * rodar pois alguns caracteres podem precisar ser escapados pelo seu shell ou
 * bash (não cobrado na prova).
 */
public class C51E9 {
	public static void main(String[] args) {
		int $$ = 5;
		int __ = $$++;

		if (__ < ++$$ || __-- > $$)
			System.out.print("A");
		System.out.print($$);
		System.out.print(__);

	}
}
