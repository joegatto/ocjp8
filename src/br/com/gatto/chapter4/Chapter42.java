package br.com.gatto.chapter4;

class Chapter42 {
	public static void main(String[] args) {
		Car a = new Car();
		a.age = 5;
		
		Car b = new Car();
		b.age = 5;
				
		Object c = a;
		
		System.out.println(a == b);
		System.out.println(a == c);
	}
}

class Car {
	int age;
}
