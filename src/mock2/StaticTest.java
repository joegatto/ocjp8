package mock2;

class A {
	public static void sM1() {
		System.out.println("In base static");
	}
}

class B extends A {
	public static void sM1() {
		System.out.println("In sub static");
	}

//	public void sM1() {
//		System.out.println("In sub non-static");
//	}
}
