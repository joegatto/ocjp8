package br.com.gatto.chapter8;

public class Chapter81 {
	public static void main(String[] args) {
		// print("guilherme");
		// print(33);
		print("guilherme", 33);

		primitive(10);
		primitive(10l);
		primitive(10f);
		primitive((short) 10);
		primitive((byte) 10);
		primitive('Z');

		reference(new String());
		reference(new Integer(5));
	}

	static void print(String name, int age) {
		System.out.println(name + " " + age);
	}

	static void primitive(double d) {
		if (d >= 0) {
			return;
			// System.out.println(">=0");
		}
		System.out.println("<0");
	}

	static void reference(Object o) {

	}
}
