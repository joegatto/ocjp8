package br.com.gatto.chapter5.exercises;

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
