package br.com.gatto.chapter4.exercises;

class C42E2 {
	public static void main(String[] args) {
		B x = new B();
		B y = x;
		y.v++;
		x.v++;
		B z = y;
		z.v--;
		System.out.println(x.v + y.v + z.v);
	}
}

class B {
	int v = 15;
}
