package br.com.gatto.chapter8.exercises.model;

public class Client {
	private String name;

	Client(String name) {
		this.name = name;
	}

	public void print() {
		System.out.println(name);
	}
}
