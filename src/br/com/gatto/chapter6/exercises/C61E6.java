package br.com.gatto.chapter6.exercises;

/**
 * 6. A resposta certa é (f). Não tenha medo de simular o código na mão. Simule
 * a memória e perceba que o resultado é 2, -5. Para isso, desenhe os três
 * espaços do array, aponte os valores iniciais 0 e continue atribuindo valores,
 * executando o código. Durante a prova, simular os arrays e os ponteiros é
 * ideal para não se perder em códigos complexos de referências e valores com
 * arrays.
 */
public class C61E6 {
	public static void main(String[] args) {
		int x[] = new int[3];

		for (x[1] = x.length - 1; x[1] >= 0; x[1]--) {
			x[x[1]] = -5;
			System.out.println(x[1]);
		}
	}
}
