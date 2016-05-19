package br.com.gatto.chapter4;

class Chapter45 {
	public static void main(String[] args) {
		Person p = new Person();
		
		p.setName("Mario");
		
		String name = p.getName();
		
		// String a = p.setName("X"); ERRO DE COMPILAÇÃO - Não podemos atribuir um void para String.
		
		Calculator c = new Calculator();
		
		System.out.println(c.sum());
		System.out.println(c.sum(1));
		System.out.println(c.sum(1,2));
		System.out.println(c.sum(1,2,3,4,5,6,7,8,9));
	}
}

class Person {
	
	String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}