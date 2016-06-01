package mock3;

interface Account {

	public default String getId() {
		return "0000";
	}

	public default String getName() {
		return "0000";
	}

	static void test() {
		System.out.println(1);
	}
}

interface PremiumAccount extends Account {
	public String getId();

	public default String getName() {
		return "0000";
	}

	static void test() {
		System.out.println(1);
	}
}

public class BankAccount implements PremiumAccount {

	public static void main(String[] args) {
		Account acct = new BankAccount();
		System.out.println(acct.getId());
	}

	@Override
	public String getId() {
		return null;
	}

}
