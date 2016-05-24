package br.com.gatto.chapter8;

public class Chapter85 {
	public Chapter85() {
		this(value());
		System.out.println("simple");
		// this(5);
	}

	public Chapter85(int i) {
		this();
	}

	public Chapter85(String s) {
		// this(s, s);
	}
	
	//
	// public Chapter85(String s, String s2) {
	// this(s);
	// }

	public Chapter85(Integer... i) {
		System.out.println("varargs");
	}

	private static String value() {
		return "value...";
	}
}
