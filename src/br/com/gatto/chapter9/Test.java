package br.com.gatto.chapter9;

public class Test {
	D d = new D();

	C c = new D();
	C c2 = d;

	B b = new D();
	B b2 = d;

	A a = new D();
	A a2 = a;
}

interface A {
}

interface B {
}

class C implements A {
}

class D extends C implements B {
}