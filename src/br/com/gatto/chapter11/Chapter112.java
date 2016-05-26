package br.com.gatto.chapter11;

import java.util.Locale;

public class Chapter112 {
	public static void main(String[] args) {
		System.out.println("hello world");
		System.out.println(false);
		System.out.println(10.3);
		System.out.println("Some text");
		System.out.println('b');
		System.out.println();
		System.out.println(new Chapter112());

		System.out.printf("Hello %s, have a nice day!", "Mario");

		System.out.printf("%s %n", "foo");
		System.out.printf("%b %n", true);
		System.out.printf("%d %n", 42);
		System.out.printf("%d %n", 1024L);
		System.out.printf("%f %n", 23.9f);
		System.out.printf("%f %n", 44.0);

		System.out.printf("%s, it's %b, the result is %d", "yes", true, 100);
		System.out.printf("%2$s %1$s", "World", "Hello");
		System.out.printf("[%5d]%n", 22);
		System.out.printf("[%5s]%n", "foo");
		System.out.printf("[%5s]%n", "foofoo");

		System.out.printf("[%05d]%n", 22);
		System.out.printf("[%-5s]%n", "foo");
		System.out.printf("%+d %n", 22);
		System.out.printf("%,f %n", 1234.56);
		System.out.printf("%(f %n", -1234.56);

		Locale br = new Locale("pt", "BR");
		System.out.printf(br, "%,f %n", 22.5);
	}

	@Override
	public String toString() {
		return "teste object";
	}
}
