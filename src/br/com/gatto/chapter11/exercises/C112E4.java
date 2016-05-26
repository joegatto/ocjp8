package br.com.gatto.chapter11.exercises;


/**
 * 4. A resposta certa é (b). Esta alternativa imprime >12.45 <
 */
public class C112E4 {
	public static void main(String[] args) {
		 System.out.printf(">%0,8.2f<",12.45);
		 System.out.printf(">%-(8.2f<",12.45);
		 System.out.format(">%0(8.2f<",12.45);
		 System.out.format(">%1$08.2f<",12.45);
		 System.out.printf(">%0,(8.2f<",12.45);
	}
}
