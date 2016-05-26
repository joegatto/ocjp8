package br.com.gatto.chapter13.exercises;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.MonthDay;
import java.time.YearMonth;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

/**
 * 8. A resposta certa . (e). N.o compila. O m.todo MonthDay.isSupported n.o
 * aceita par.metros do tipo ChronoUnit, apenas ChronoField.
 * 
 */
public class C131E8 {
	public static void main(String[] args) {
		System.out.println(YearMonth.now().isSupported(ChronoField.DAY_OF_MONTH));
//		System.out.println(MonthDay.now().isSupported(ChronoUnit.DAYS));
		System.out.println(LocalDate.now().isSupported(ChronoUnit.DAYS));
		System.out.println(LocalDateTime.now().isSupported(ChronoField.DAY_OF_MONTH));
	}
}
