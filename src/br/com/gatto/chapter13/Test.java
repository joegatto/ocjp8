package br.com.gatto.chapter13;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Test {
	public static void main(String[] args) {
		PersonFilter pf = new PersonFilter();
		ArrayList<Person> persons = new ArrayList<>();

		Predicate<Person> matcher = new Predicate<Person>() {

			@Override
			public boolean test(Person p) {
				return p.getAge() >= 18;
			}

		};

		Predicate<Person> matcher2 = p -> p.getAge() >= 18;

		List<Person> adults = pf.filter(persons, matcher2);
	}
}
