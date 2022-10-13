package org.tnsindia.strings;
import java.util.Scanner;
public class Example2 {

	public static void main(String[] args) {
		String str = new String("hello vikram");
		System.out.println(str);
		Scanner s= new Scanner(System.in);
		System.out.println("enter the value of str1");
		String str1= new String(s.nextLine());
		System.out.println(str1);
		s.close();

	}

}
