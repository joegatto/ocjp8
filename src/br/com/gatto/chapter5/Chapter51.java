package br.com.gatto.chapter5;

public class Chapter51 {
	public static void main(String[] args) {
		int a = 20;
		long b = 20;
		float c = 10f;
		double d = 20.0f;
		double e = 30.0;
		// float f = 40.0; - Double não cabe no float
		// int g = 10l; - long não cabe no int
		float h = 10l;
		double i = 20;
		// long j = 20f; - decimais não cabem em inteiros.

		byte b1 = 10;
		// byte b2 = 200; não compila, estoura o byte

		char c1 = 10;
		// char c2 = -3; não compila, char não pode ser negativo

		int two = 2;
		int ten = 10;

		int twelve = two + ten;

		int eigth = ten - two;

		int twenty = two * ten;

		int five = ten / two;

		int three = 3;
		int one = ten % three;

		int age = 15;
		long years = 5;

		long afterThoseYears = age + years;

		// int afterThoseYears2 = age + years; não compila pois o maior valor é
		// long, então devolve long.

		byte b2 = 1;
		short s1 = 2;

		int i1 = b2 + s1;

		// byte b3 = b2 + s1; não compila pois o minimo é um int.

		byte b3 = (byte) (b2 + s1);

		System.out.println(1 == 1);
		System.out.println(1 != 1);
		System.out.println(2 < 1);
		System.out.println(2 > 1);
		System.out.println(1 >= 1);
		System.out.println(2 <= 1);

		System.out.println("==============================");

		System.out.println(1 == 2 & method("hi"));
		System.out.println(1 == 2 && method("bye"));

		int i2 = 10;
		System.out.println(i2 == 2 & i2++ == 0);
		System.out.println(i2);

		int j = 10;
		System.out.println(j == 2 && j++ == 0);
		System.out.println(j);

		System.out.println("==============================");

		int num = 5;

		System.out.println(num++);

		System.out.println(num--);

		System.out.println(num);

		num = 5;

		System.out.println(++num);

		System.out.println(--num);

		System.out.println(num);

		num = 5;

		num += 10;
		System.out.println(num);

		num -= 10;
		System.out.println(num);

		num *= 3;
		System.out.println(num);

		num /= 3;
		System.out.println(num);

		num %= 2;
		System.out.println(num);
		
		System.out.println(num+=3);
		
		int a2 = 10;
		a2 += ++a2 + a2 + ++a2;
		System.out.println(a2);
		
		a2 = 10;
		a2+= a2++ + a2 + a2++;
		System.out.println(a2);
		
		int j2 = 0;
		int i3 = (j2++ * j2 + j2++);
		System.out.println(i3);
		System.out.println(j2);
		
		j2 = 0;
		i3 = (++j2 * j2 + ++j2);
		System.out.println(i3);
		System.out.println(j2);

	}

	public static boolean method(String msg) {
		System.out.println(msg);
		return true;
	}
}
