package br.com.gatto.chapter13;

@FunctionalInterface
interface Matcher<T> {
	boolean test(T t);
}
