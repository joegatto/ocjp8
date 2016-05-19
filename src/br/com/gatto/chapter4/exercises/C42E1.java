package br.com.gatto.chapter4.exercises;

class C42E1 {
	public static void main(String[] args) {
		int x = 15;
		int y = x;
		y++;
		x++;
		int z = y;
		z--;
		System.out.println(x + y + z);
	}
}
