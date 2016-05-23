package br.com.gatto.chapter7;

public class Chapter74 {
	public static void main(String[] args) {
		int i = 20;
		do {
			System.out.println(i);
			i++;
		} while (i < 10);

		int j = 20;
		while (j < 20) {
			System.out.println(j);
			j++;
		}

		Account account = new Account();

		while (account.getAmount() > 0) {
			account.withdraw(1000);
		}

		account = new Account();
		int total;
		for (total = 0; account.getAmount() > 0; total++) {
			account.withdraw(1000);
		}
		System.out.println("Withdraw " + total + " times");
	}
}
