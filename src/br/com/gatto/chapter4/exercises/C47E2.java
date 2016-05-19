package br.com.gatto.chapter4.exercises;

/**
 * 2. A resposta certa é (b). Dá NullPointerException! msg é null e não dá pra
 * chamar isEmpty em null.
 *
 */
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
