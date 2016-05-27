package br.com.gatto.chapter13;

class AgeOfMajority implements Matcher<Person> {

	@Override
	public boolean test(Person p) {
		return p.getAge() >= 18;
	}

}
