package day2_IntroductionWithJava;
import java.util.Scanner;

public class User_Input_integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		System.out.println("enter the value of x :");
		int x= s.nextInt();
		System.out.println("the entered value is " + x);
		s.close();
	}

}
