package mock4;

class XXX {
	public void m() {
		throw new RuntimeException();
	}
}

class YYY extends XXX {
	// public void m() throws Exception {
	// throw new Exception();
	// }
}

public class TestClass4 {
	public static void main(String[] args) {
//		______ obj = new ______();
//		obj.m();
	}
}