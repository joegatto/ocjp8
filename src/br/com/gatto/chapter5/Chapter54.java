package br.com.gatto.chapter5;

public class Chapter54 {
	public static void main(String[] args) {
		boolean authenticated = true;
		if (authenticated) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}

		int valor = 100;
		if (valor > 200)
			if (valor < 400)
				if (valor > 300)
					System.out.println("a");
				else
					System.out.println("b");
			else
				System.out.println("c");
	}

	public int method(int x) {
		if (x > 200) {
			return 5;
			// System.out.println("Will it run?");
		}
		throw new RuntimeException();
	}
}
