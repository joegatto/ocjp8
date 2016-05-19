package br.com.gatto.chapter4.exercises;

/**
 * 12. A resposta certa é (c). Nenhuma das alternativas dadas com número, pois
 * primeiro ele soma val e div, imprimindo 14. A conta de divisão é feita entre
 * int, devolvendo um int de valor 2. Quando esse número é atribuído a um
 * double, continua sendo 2. Portanto, imprime 14 e 2.0.
 */
public class C47E12 {
	public static void main(String[] args) {
		int val = 10;
		int div = 4;
		double res = val / div;
		System.out.println(val + div + "...");
		System.out.println(res + " = result");
	}
}
