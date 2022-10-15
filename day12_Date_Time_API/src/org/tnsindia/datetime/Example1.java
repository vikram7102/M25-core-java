package org.tnsindia.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Example1 {

	public static void main(String[] args) {
		LocalDate d = LocalDate.now();
		LocalTime t=LocalTime.now();
		
		LocalDateTime dt= LocalDateTime.now();
		LocalDate dl= LocalDate.of(2022, 10, 15);
		
		System.out.println(d);
		System.out.println(t);
		System.out.println(dt);
		System.out.println(dl);

	}

}
