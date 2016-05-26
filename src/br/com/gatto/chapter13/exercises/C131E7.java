package br.com.gatto.chapter13.exercises;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

/**
 * 7. A resposta certa . (d).
LocalDateTime.ofInstant(d.toInstant(),
ZoneId.systemDefault()).toLocalDate();
8. A resposta certa . (e). N.o compila. O m.todo
MonthDay.isSupported n.o aceita par.metros do tipo
ChronoUnit, apenas ChronoField.
9. A resposta certa . (d). N.o compila. N.o existe um valor
ChronoUnit.YEAR, e sim ChronoUnit.YEARS.
 */
public class C131E7 {
	public static void main(String[] args) {
		Date d = new Date();
		LocalDateTime.ofInstant(d.toInstant(), ZoneId.systemDefault()).toLocalDate();
	}
}
