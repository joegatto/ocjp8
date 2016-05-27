package br.com.gatto.chapter13;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class PersonFilter {
	public List<Person> filter(List<Person> input, Predicate<Person> matcher) {
		List<Person> output = new ArrayList<>();
		for (Person person : input) {
			if (matcher.test(person)) {
				output.add(person);
			}
		}
		return output;
	}
}
