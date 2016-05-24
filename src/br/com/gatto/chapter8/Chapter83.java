package br.com.gatto.chapter8;

public class Chapter83 {
	public static void main(String[] args) {
		new Chapter83().method(15);
		new Chapter83().method(15.0);

		new Chapter83().method("random");

		new Chapter83().method((Object) "random");
		String x = "random";
		Object y = x;
		new Chapter83().method(x);
		new Chapter83().method(y);

		new Chapter83().method("guilherme", 33.0);
		new Chapter83().method(33.0, "guilherme");

		new Chapter83().method(2.0, 3);
		new Chapter83().method(2, 3.0);

		// new Chapter83().method(2, 3);
		new Chapter83().method("string", "string");
	}

	public void method(int i) {
		System.out.println("int");
	}

	public void method(double x) {
		System.out.println("double");
	}

	void method(Object o) {
		System.out.println("object");
	}

	void method(String s) {
		System.out.println("string");
	}

	void method(String i, double x) {
		System.out.println(1);
	}

	void method(double x, String i) {
		System.out.println(2);
	}

	void method(int i, double x) { // ok
	}

	void method(double x, int i) { // ok
	}

	void method(Object o, String s) {
		System.out.println("object");
	}

	void method(String s, Object o) {
		System.out.println("string");
	}

	void method(Object o, Object o2) {
		System.out.println("object");
	}

	void method(String s, String s2) {
		System.out.println("string");
	}
}
