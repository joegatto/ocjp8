package br.com.gatto.chapter4.exercises;

/**
 * 14. A resposta certa é (a). Pensamos que pode ser gualherme, mas lembramos
 * que String em Java é imutável e ela não foi reatribuída. O = dá uma impressão
 * de reatribuição de parte da String, mas isso não existe em Java, o lado
 * esquerdo de uma atribuição deve ser sempre uma variável e não uma chamada a
 * um método. Por isso, a linha do substring não compila.
 *
 */
public class C47E14 {
	public static void main(String[] args) {
		String s = "guilherme";
		/*
		 * s.substring(0,2) = "gua"; ERRO DE COMPILAÇÃO não podemos fazer
		 * atribuição para metodos
		 */
		System.out.println(s);
	}
}
