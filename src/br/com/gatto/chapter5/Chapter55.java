package br.com.gatto.chapter5;

public class Chapter55 {
	public static void main(String[] args) {
		int option = 1;
		switch (option) {
		case 1:
			System.out.println("number 1");
		case 2:
			System.out.println("number 2");
		case 3:
			System.out.println("number 3");
		}

		Byte b = 10;
		switch (b) {
		case 10:
			System.out.println("TEN");
		}

		String s = "Oi";
		switch (s) {
		case "Oi":
			System.out.println("Olá");
		case "Hi":
			System.out.println("Hello");
		}

		int mix = 20;
		switch (mix) {
		// case "10":
		// System.out.println(10);
		// case "20":
		// System.out.println(20);
		}

		int value = 20;
		final int FIVE = 5;
		int thirty = 30;
		switch (value) {
		case FIVE:
			System.out.println(5);
		case 10:
			System.out.println(10);
		case FIVE + 4:
			System.out.println(20);
			// case thirty:
			// System.out.println(30);
			// case thirty + FIVE:
			// System.out.println(35);
//		case null:
//			System.out.println("null");
		}

	}
}
