package mock;

class A3 {
	A3() {
		print();
	}

	void print() {
		System.out.println("A");
	}
}

class B extends A3 {
	int i = 4;

	public static void main(String[] args) {
		A3 a = new B();
		a.print();
	}

	void print() {
		System.out.println(i);
	}
}
