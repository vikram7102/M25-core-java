package day2_IntroductionWithJava;
import java.util.Scanner;
public class Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of x: ");
		char x=s.next().charAt(3);
		System.out.println("The result is: ");
		System.out.print(x);
	}

}
