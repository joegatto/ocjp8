package br.com.gatto.chapter4.exercises;

class C41E3 {
	public static void main(String[] args) {
		int age;
		if (args.length > 0) {
			age = Integer.parseInt(args[0]);
		} else {
			System.err.println("???");
			return;
		}
		System.out.println(age);
	}
}
