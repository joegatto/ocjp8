package br.com.gatto.chapter6.exercises;

/**
 * 7. A resposta certa é (d). Compila e imprime true: note que não existe
 * criação de um novo array, nós simplesmente temos duas referências ( valores e
 * vals para o mesmo array na memória).
 */
public class C61E7 {
	public static void main(String[] args) {
		String[] valores = new String[2];
		valores[0] = "Certification";
		valores[1] = "Java";
		Object[] vals = (Object[]) valores;
		vals[1] = "Daniela";
		System.out.println(vals[1].equals(valores[1]));
	}
}
