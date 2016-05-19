package br.com.gatto.chapter4;

public class Chapter47 {
	public static void main(String[] args) {
		String implicit = "Java";
		String explicit = new String("Java");
		
		char[] name = new char[]{'J','a', 'v', 'a'};
		String fromArray = new String(name);
		
		String nulled = null;
		
		System.out.println("Value: " + nulled);
		System.out.println(nulled + "Value: ");
		
		String name2 = "Java" + ' ' + "Certification" + ' ' + 1500;
		System.out.println(name2);
		
		String s = "caelum";
		String s2 = s.toUpperCase();
		System.out.println(s2);
		
		System.out.println(s.length());
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.isEmpty());
		
		String texto = "Certification";
		System.out.println(texto.equals("Certification"));
		System.out.println(texto.equals("certification"));
		System.out.println(texto.equalsIgnoreCase("CerTifIcatIon"));
		
		System.out.println(texto.compareTo("Casa"));
		System.out.println(texto.compareTo("Certification"));
				
		String text = "Pretendo fazer a prova de certificação de Java";
		
		System.out.println(text.indexOf("Pretendo"));
		System.out.println(text.indexOf("Pretendia"));
		System.out.println(text.indexOf("tendo"));
		
		System.out.println(text.indexOf("a"));
		System.out.println(text.lastIndexOf("a"));
		System.out.println(text.lastIndexOf("Pretendia"));
		
		System.out.println(text.startsWith("Pretendo"));
		System.out.println(text.startsWith("Pretendia"));
		
		System.out.println(text.endsWith("Java"));
		System.out.println(text.endsWith("Oracle"));
		
	}
}
