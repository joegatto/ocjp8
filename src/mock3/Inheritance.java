package mock3;

class A {
	final int fi = 10;
}

public class Inheritance extends A {

	int fi = 15;

	public static void main(String[] args) {
		Inheritance b = new Inheritance();
		b.fi = 20;
		System.out.println(b.fi);
		System.out.println(((A) b).fi);
	}
}
