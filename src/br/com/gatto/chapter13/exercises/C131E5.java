package br.com.gatto.chapter13.exercises;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * 5. A resposta certa . (c). ChronoUnit.DAYS.between(d1,d2);
 */
public class C131E5 {
	public static void main(String[] args) {
		LocalDate d1 = LocalDate.of(1988, 3, 22);
		LocalDate d2 = LocalDate.of(2016, 05, 26);
		ChronoUnit.DAYS.between(d1, d2);
	}
}
