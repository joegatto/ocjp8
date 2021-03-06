package br.com.gatto.chapter13.exercises;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.MonthDay;
import java.time.YearMonth;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

/**
 * 9. A resposta certa . (d). N.o compila. N.o existe um valor ChronoUnit.YEAR,
 * e sim ChronoUnit.YEARS.
 */
public class C131E9 {
	public static void main(String[] args) {
		System.out.println(YearMonth.now().isSupported(ChronoUnit.MONTHS));
		System.out.println(YearMonth.now().isSupported(ChronoField.DAY_OF_MONTH));
		System.out.println(MonthDay.now().isSupported(ChronoField.DAY_OF_MONTH));
		System.out.println(LocalDate.now().isSupported(ChronoUnit.DAYS));
//		System.out.println(LocalDate.now().isSupported(ChronoUnit.YEAR));
		System.out.println(LocalDateTime.now().isSupported(ChronoField.HOUR_OF_AMPM));
		System.out.println(LocalDateTime.now().isSupported(ChronoField.YEAR));
	}
}
