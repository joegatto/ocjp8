package br.com.gatto.chapter13;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class Chapter131 {
	public static void main(String[] args) {

		LocalTime currentTime = LocalTime.now(ZoneId.of("America/Chicago"));
		LocalDate today = LocalDate.now(ZoneId.of("America/Sao_Paulo"));
		LocalDateTime now2 = LocalDateTime.now(ZoneId.of("America/Los_Angeles"));

		LocalTime noon = LocalTime.of(12, 0);

		LocalDate christmas2014 = LocalDate.of(2014, 12, 25);
		LocalDate christmas2015 = LocalDate.of(2015, Month.DECEMBER, 25);

		MonthDay someChristmas = MonthDay.of(Month.DECEMBER, 31);

		LocalDateTime someDate = LocalDateTime.of(2017, Month.JANUARY, 25, 13, 45);
		LocalDateTime christmasAtNoon = LocalDateTime.of(christmas2014, noon);

		LocalDateTime now = LocalDateTime.of(2014, 12, 15, 13, 0);
		System.out.println(now.getDayOfMonth()); // 15
		System.out.println(now.getDayOfYear()); // 349
		System.out.println(now.getHour()); // 13
		System.out.println(now.getMinute()); // 0
		System.out.println(now.getYear()); // 2014
		System.out.println(now.getDayOfWeek()); // MONDAY
		System.out.println(now.getMonthValue()); // 12
		System.out.println(now.getMonth());

		System.out.println(now.get(ChronoField.DAY_OF_MONTH));
		System.out.println(now.get(ChronoField.DAY_OF_YEAR));
		System.out.println(now.get(ChronoField.HOUR_OF_DAY));
		System.out.println(now.get(ChronoField.MINUTE_OF_HOUR));
		System.out.println(now.get(ChronoField.YEAR));
		System.out.println(now.get(ChronoField.DAY_OF_WEEK));
		System.out.println(now.get(ChronoField.MONTH_OF_YEAR));

		MonthDay day1 = MonthDay.of(1, 1); // 01/jan
		MonthDay day2 = MonthDay.of(1, 2); // 02/jan
		System.out.println(day1.isAfter(day2)); // false
		System.out.println(day1.isBefore(day2)); // true

		LocalDate aprilFools = LocalDate.of(2015, 4, 1);
		LocalDate foolsDay = LocalDate.of(2015, 4, 1);
		// are equals
		System.out.println(aprilFools.isEqual(foolsDay)); // true
		// does this object support days?
		System.out.println(aprilFools.isSupported(ChronoField.DAY_OF_MONTH)); // true
		// does this object supports hours?
		System.out.println(aprilFools.isSupported(ChronoField.HOUR_OF_DAY)); // false
		// Can I make operations with days?
		System.out.println(aprilFools.isSupported(ChronoUnit.DAYS));
		// true
		// Can I make operations with hours?
		System.out.println(aprilFools.isSupported(ChronoUnit.HOURS));
		// false

		LocalDate d = LocalDate.of(2015, 4, 1); // 2014-04-01
		d = d.withDayOfMonth(15).withMonth(3); // chaining
		System.out.println(d);

		System.out.println(d); // 2013-09-07
		d.withMonth(12);
		System.out.println(d); // 2013-09-07

		d = d.plusDays(1).plusMonths(3).minusYears(2);
		System.out.println(d); // 2011-12-08

		LocalDateTime now3 = LocalDateTime.now();
		LocalDate dateNow = now3.toLocalDate();
		LocalTime timeNow = now3.toLocalTime();

		// from date to datetime
		LocalDateTime nowAtTime1 = dateNow.atTime(timeNow);
		// from time to datetime
		LocalDateTime nowAtTime2 = timeNow.atDate(dateNow);

		Date date = new Date();
		Instant i = date.toInstant();
		LocalDateTime ldt1 = LocalDateTime.ofInstant(i, ZoneId.systemDefault());

		Calendar c = Calendar.getInstance();
		Instant i2 = c.toInstant();
		LocalDateTime ldt2 = LocalDateTime.ofInstant(i2, ZoneId.systemDefault());

		Instant instant = ldt1.toInstant(ZoneOffset.UTC);
		Date date2 = Date.from(instant);

		Instant t1 = Instant.EPOCH; // 01/01/1970 00:00:00
		Instant t2 = Instant.now();
		long secondsSinceEpoch = Duration.between(t1, t2).getSeconds();

		LocalDate birthday = LocalDate.of(1988, 3, 22);
		LocalDate base = LocalDate.of(2016, 05, 26);
		// 31 years total
		System.out.println(ChronoUnit.YEARS.between(birthday, base));
		// 377 months total
		System.out.println(ChronoUnit.MONTHS.between(birthday, base));
		// 11479 days total
		System.out.println(ChronoUnit.DAYS.between(birthday, base));
	}
}
