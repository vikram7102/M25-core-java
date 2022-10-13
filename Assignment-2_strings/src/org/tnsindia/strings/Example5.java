package org.tnsindia.strings;

import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		String str2="vikram";
		String str=s.nextLine();
		String str1=s.nextLine();
		System.out.println(str.toUpperCase());
		System.out.println(str1.toLowerCase());
		System.out.println(str2.charAt(3));
		System.out.println(str.concat(str1));
		System.out.println(str2.length());
		System.out.println(str.isEmpty());
		s.close();
		

	}

}
