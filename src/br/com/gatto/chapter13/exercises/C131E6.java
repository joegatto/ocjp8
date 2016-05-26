package br.com.gatto.chapter13.exercises;

import java.time.LocalDate;
import java.time.Period;

/**
 * 6. A resposta certa . (a). Period d = Period.between(birthday, today);
 */
public class C131E6 {
	public static void main(String[] args) {
		LocalDate birthday = LocalDate.of(1975, 9, 23);
		LocalDate today = LocalDate.now();

		Period d = Period.between(birthday, today);

		System.out.println(
				"You are " + d.getYears() + " years, " + d.getMonths() + " months, and " + d.getDays() + " days old.");
	}
}
