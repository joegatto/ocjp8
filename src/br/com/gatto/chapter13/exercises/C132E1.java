package br.com.gatto.chapter13.exercises;

public class C132E1 {
	public static void main(String[] args) {
		Printer p = null;

		p = () -> System.out.println("Hello World");

		p.printMessage();

	}
}

interface Printer {
	void printMessage();
}