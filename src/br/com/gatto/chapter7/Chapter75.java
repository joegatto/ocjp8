package br.com.gatto.chapter7;

public class Chapter75 {
	public static void main(String[] args) {
		int i = 1;
		while (i < 10) {
			i++;
			if (i == 5) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("End");

		i = 1;
		while (i < 10) {
			i++;
			if (i == 5) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("End");

		for (i = 1; i < 10; i++) {
			if (i == 8) {
				break;
			}
			if (i == 5) {
				continue;
			}
			System.out.println(i);
		}

		externo: for (i = 1; i < 10; i++) { // laço externo
			interno: for (int j = 1; j < 10; j++) { // laço interno
				if (i * j == 25) {
					break externo;
				}
				if (i * j == 16) {
					continue interno;
				}
			}
		}

		for (i = 0; i < 4; i++) {
			System.out.println("Before switch");
			mario: guilherme: switch (i) {
			case 0:
			case 1:
				System.out.println("Case " + i);
				for (int j = 0; j < 3; j++) {
					System.out.println(j);
					if (j == 1)
						break mario;
				}
			case 2:
				System.out.println("At i = " + i);
				continue;
			case 3:
				System.out.println("At 3");
				break;
			default:
				System.out.println("Weird...");
				break;
			}
			System.out.println("After switch");
		}
	}

	void labelAnywhere() {
		myLabel: System.out.println("hi");
	}

	void continueSomeRandomLabelDoesNotCompile() {
		myLabel: System.out.println("hi");
		if (1 < 10) {
			// continue myLabel;
		}
	}
}
