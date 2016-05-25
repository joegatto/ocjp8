package br.com.gatto.chapter9.savings;

import br.com.gatto.chapter9.model.Account;

public class SavingsAccount extends Account {
	public void close() {
		System.out.println("closing savings account");
	}
}
