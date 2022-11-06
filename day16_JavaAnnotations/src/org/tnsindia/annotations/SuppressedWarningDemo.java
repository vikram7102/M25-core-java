package org.tnsindia.annotations;

import java.util.Scanner;

public class SuppressedWarningDemo {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		//this annotation is used to remove the warnings which occurred at the compile time
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		System.out.println(x);

	}

}
