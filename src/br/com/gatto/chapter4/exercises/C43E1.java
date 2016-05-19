package br.com.gatto.chapter4.exercises;

class C43E1 {
	public static void main(String[] args) {
		C c = new C();
		c.d=10;
		System.out.println(c.d);
		c.d(30);
		System.out.println(c.d);
	}
}

class C {
	int d;

	void d(int d) {
		d = d;
	}
}
