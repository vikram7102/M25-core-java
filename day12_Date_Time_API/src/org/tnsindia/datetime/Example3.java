package org.tnsindia.datetime;

import java.time.OffsetDateTime;
import java.time.OffsetTime;

public class Example3 {

	public static void main(String[] args) {
		OffsetDateTime obj1=OffsetDateTime.now();
		OffsetTime obj2= OffsetTime.now();
		
		System.out.println(obj1);
		System.out.println(obj2);

	}

}
