package br.com.gatto.chapter7;

public class Account {
	int amount;

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public void withdraw(int amount) {
		this.amount -= amount;
	}
}
