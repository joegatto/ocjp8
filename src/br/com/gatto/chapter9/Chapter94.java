package br.com.gatto.chapter9;

public class Chapter94 {
	public static void main(String[] args) {
		Object[] objects = new Object[100];
		String s = "certification";
		objects[0] = s;
		String recovered = (String) objects[0];
	}
}
