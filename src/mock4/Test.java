package mock4;

class Super {
	static String ID = "QBANK";
}

class Sub extends Super {
	static {
		System.out.println("In Sub");
	}
}

public class Test {
	public static void main(String[] args) {
		System.out.println(Sub.ID);
		System.out.println(new Sub().ID);
	}
}
