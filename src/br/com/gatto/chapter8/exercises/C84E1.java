package br.com.gatto.chapter8.exercises;

class A {
	final String n;

	A() {
		a();
		n = "learning";
	}

	void a() {
		System.out.println("test");
	}
}

class C84E1 extends A {
	void a() {
		System.out.println(n.length());
	}

	public static void main(String[] args) {
		new C84E1();
	}
}