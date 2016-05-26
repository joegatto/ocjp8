package br.com.gatto.chapter12;

public class Chapter121 {
	public static void main(String[] args) {
		Double d1 = new Double(22.5);
		Double d2 = new Double(22);
		Double d3 = new Double("22.5");
		// Double d4 = new Double("abc");

		Character c = new Character('d');

		Boolean b1 = new Boolean(true); // true
		Boolean b2 = new Boolean("true"); // true
		Boolean b3 = new Boolean("TrUe"); // true
		Boolean b4 = new Boolean("T"); // false

		Long l = new Long("123");
		byte b = l.byteValue();
		double d = l.doubleValue();
		int i = l.intValue();
		short s = l.shortValue();

		boolean b5 = new Boolean("true").booleanValue();
		char c2 = new Character('z').charValue();

		double d4 = Double.parseDouble("23.4");
		long l2 = Long.parseLong("23");
		int i2 = Integer.parseInt("444");

		short i1 = Short.parseShort("11", 10); // 11 Decimal
		int i7 = Integer.parseInt("11", 16); // 17 HexaDecimal
		byte i3 = Byte.parseByte("11", 8); // 9 Octal
		int i4 = Integer.parseInt("11", 2); // 3 Binary
		int i5 = Integer.parseInt("A", 16); // 10 HexaDecimal
		int i6 = Integer.parseInt("FF", 16); // 255 HexaDecimal

		Double d5 = Double.valueOf("23.4");
		Long l3 = Long.valueOf("23");
		Integer i8 = Integer.valueOf("444");
		Integer i9 = Integer.valueOf("5AF", 16);

		Integer i10 = Integer.valueOf(256);
		String number = i10.toString();

		String d6 = Double.toString(23.5);
		String s1 = Short.toString((short) 23);
		String i11 = Integer.toString(23);
		String l4 = Long.toString(20, 16);

		String binaryString = Integer.toBinaryString(8); // 1000, binary
		String hexString = Long.toHexString(11); // B, Hexadecimal
		String octalString = Integer.toOctalString(22); // 26 Octal

		Integer i12 = 1234;
		Integer i13 = 1234;
		System.out.println(i12 == i13); // false
		System.out.println(i12.equals(i13)); // true
	}
}
