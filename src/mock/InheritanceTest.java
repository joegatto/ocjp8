package mock;

class A {
	public double m1(int a) {
		return a * 10 / 4 - 30;
	}
}

class A2 extends A {
	public double m1(int a) {
		return a * 10 / 4.0;
	}
}
