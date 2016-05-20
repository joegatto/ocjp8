package br.com.gatto.chapter5.exercises;

/**
 * 4. A resposta certa é (e). O código imprime false e true. As duas referências
 * são diferentes ( false), e o método equals não foi sobrescrito, mas está
 * sendo chamado diretamente ( true).
 */
public class C53E4 {
	public static void main(String[] args) {
		C a = new C();
		C b = new B();
		a.x = 1;
		b.x = 1;
		System.out.println(a == b);
		System.out.println(a.equals(b));
	}
}

class C {
	int x;

	public boolean equals(C c) {
		return c.x == x;
	}
}

class B extends C {

}