package br.com.gatto.chapter13.exercises;

import java.util.List;
import java.util.function.Predicate;

public class C132E2 {
	public static void main(String[] args) {
		Predicate<List> bigger = list -> list.size() > 1000;
		Predicate<String> startsWithA = s -> s.startsWith("A");
		// Predicate big = list -> list.size() > 100;
		String name = "";
		Predicate isEmpty = s -> s.equals("");

	}
}
