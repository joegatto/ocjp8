package br.com.gatto.chapter4.exercises;

class C41E2 {
	public static void main(String[] args) {
		int age;
		if (args.length > 0) {
			age = Integer.parseInt(args[0]);
		} else {
			System.err.println("???");
		}
		/* System.out.println(age); - ERRO DE COMPILAÇÃO variavel não foi iniciada*/
	}
}
