package br.com.gatto.chapter4;

public class Chapter46 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("Caelum");
		sb.append(" - ");
		sb.append("Alura - Casa do Código");
		
		System.out.println(sb);
		
		// vazio
		StringBuilder sb1 = new StringBuilder();
		sb1.append("Caelum").append(" - ").append("Ensino e Inovação");
		System.out.println(sb1);
		
		// tamanho inicial do array para colocar a string
		StringBuilder sb2 = new StringBuilder(50);
		
		//baseado em outro objeto do mesmo tipo
		StringBuilder sb3 = new StringBuilder(sb2);
		
		//conteudo inicial
		StringBuilder sb4 = new StringBuilder("Java");
		
		StringBuilder sb5 = new StringBuilder();
		sb2.append("Caelum - Inovação");
		sb2.insert(9, "Ensino e ");
		System.out.println(sb2);
		
		StringBuilder sb6 = new StringBuilder();
		sb6.append("Caelum - Ensino e Inovação");
		sb6.delete(6, 15);
		System.out.println(sb6.toString());
		
		System.out.println(new StringBuilder("   Exemplo Trim     ").toString().trim());
		System.out.println(new StringBuilder("OCJP").charAt(2));
		System.out.println(new StringBuilder("abcdefghijklmnopqrstuvxwyz").length());
		System.out.println(sb3.equals(sb2));
		System.out.println(sb6.reverse());
		System.out.println(new StringBuilder("OCJP").indexOf("JP"));
		System.out.println(new StringBuilder("abcdefghijklmnopqrstuvxwyz").substring(2, 4));
	}
}
