package br.com.gatto.chapter8;

public class Chapter84 {
	int i;

	Chapter84() {
		System.out.println(i);
		i = 15;
		System.out.println(i);
	}

	public static void main(String[] args) {
		new A84();
		// new B84();
		new B84("CDC");
		new Chapter84();
	}
}

class A84 {

}

class B84 {
	public B84(String s) {
	}
}
