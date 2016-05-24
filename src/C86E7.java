
class B {
	static int bs = 0;
	final int b = ++bs;

	private B() {
	}

	static B b() {
		return new B();
	}
}

/**
 * 7. A resposta certa é (b). O código compila e imprime 1
 */
class C86E7 {
	public static void main(String[] args) {
		System.out.println(B.b().b);
	}
}