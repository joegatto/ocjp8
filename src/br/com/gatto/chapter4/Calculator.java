package br.com.gatto.chapter4;

class Calculator {
	public int sum (int... nums) {
		int total = 0;
		for (int a : nums) {
			total += a;
		}
		return total;
	}
}
