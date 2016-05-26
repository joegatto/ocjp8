package br.com.gatto.chapter10;

import java.io.IOException;

public class Chapter104 {
	void method1() {
		try {
			System.out.println("primeiro antes");
			this.method2();
			System.out.println("primeiro depois");
		} catch (IOException e) {
			// tratamento.
			System.out.println("primeiro catch");
		}
		System.out.println("primeiro fim");
	}

	void method2() throws IOException {
		System.out.println("segundo antes");
		System.in.read(); // pode lançar IOException
		System.out.println("segundo depois");
	}
}
