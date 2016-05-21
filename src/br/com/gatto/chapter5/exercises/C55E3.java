package br.com.gatto.chapter5.exercises;

/**
 * 3. A resposta certa é (b). A String "42" é uma String uma vez que ela está
 * entre aspas. Portanto, o código imprime Guilherme.
 */
public class C55E3 {
	public static void main(String[] args) {
		switch ("Guilherme") {
		case "Guilherme":
			System.out.println("Guilherme");
			break;
		case "42":
			System.out.println("42");
		default:
			System.out.println("Mario");
		}
	}
}
