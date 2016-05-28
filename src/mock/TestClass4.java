package mock;

class TestClass4 implements I1, I2 {
	public void m1() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		TestClass4 tc = new TestClass4();
		((I2) tc).m1();
	}
}

interface I1 {
	int VALUE = 1;

	void m1();
}

interface I2 {
	int VALUE = 2;

	void m1();
}