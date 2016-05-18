package br.com.gatto.chapter3;

class Chapter31 {

	public void m1(String s) { // method - opening
		int x = 10; // method local variable
		/*
		* int x = 0; - COMPILATION ERROR (Variable with same name)
		* static int x = 10 - COMPILATION ERROR (Variable with same name)
		 */
	
		if (x >= 10) { // if - opening
			int y = 50; // if local variable
			System.out.println(y);
		} // if - closing

		for (int i = 0, j = 0; i < 10; i++)
			j++;

		// special attention to for loops
		/*
		 * System.out.println(j); - COMPILATION ERROR (j is declared inside for loop)
		 */

	} // method - closing

	public void m2() {
		/*
		 * System.out.println(s); - COMPILATION ERROR (s is the parameter for m1 method) is not reacheable for m2.
		 */
	}

	public static void main(String[] args) {
		Person p = new Person();

		System.out.println(p.id);

		System.out.println(Person.id);
	}
}

class Person {

	static int id = 15;
	static int x = 0;

	int y = 0;
	String name;

	public void setName(String n) {
		this.name = n;
	}
	
	public void setX(int x) {
		Person.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
}

class X {
	int a = 100;
	
	public void method(){
		int a = 200;
		System.out.println(a);
	}
}
