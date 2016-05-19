package br.com.gatto.chapter4.exercises;

class C47E2 {
	public static void main(String[] args) {
		new I().imprime();
	}
}

class I {
	String msg;

	void imprime() {
		if (!msg.isEmpty())
			System.out.println(msg);
		else
			System.out.println("Empty");
	}
}
