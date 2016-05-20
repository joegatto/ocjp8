package br.com.gatto.chapter5;

public class Chapter53 {
	public static void main(String[] args) {
		String name1 = new String("Mario");
		String name2 = new String("Mario");
		System.out.println(name1 == name2);

		name1 = "Mario";
		name2 = "Mario";
		System.out.println(name1 == name2);

		String s1 = "string";
		String s2 = "string";
		String s3 = new String("string");
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s2));

		String ab = "a" + "b";
		System.out.println("ab" == ab);

		String a = "a";
		String ab2 = a + "b";
		System.out.println("ab" == ab2);

		String h1 = "hello ";
		String w = "world";

		System.out.println("hello ");

		System.out.println(h1 + "world");

		System.out.println("Hello " == h1);

		Client c1 = new Client("guilherme");
		Client c2 = new Client("mario");

		System.out.println(c1 == c2);
		System.out.println(c1 == c1);
	}
}

class Client {
	private String name;

	Client(String name) {
		this.name = name;
	}
}
