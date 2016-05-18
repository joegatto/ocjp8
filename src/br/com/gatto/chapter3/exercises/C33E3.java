package br.com.gatto.chapter3.exercises;

/**
 * 3. Ao rodar sem argumentos, nosso array tem tamanho zero, portanto, ao tentar
 * acessar seu primeiro elemento recebemos um ArrayIndexOutOfBoundsException na
 * linha C. A resposta certa é (c).
 */
public class C33E3 {
	public static void main(String[] args) {
		System.out.println(args);
		System.out.println(args.length);
		System.out.println(args[0]);
	}
}
