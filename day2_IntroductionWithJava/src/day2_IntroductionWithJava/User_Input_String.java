package day2_IntroductionWithJava;
import java.util.Scanner;
public class User_Input_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for user-input
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string =");
		//the difference between next() and nextLine()
		/* next() will take only the first word of your sentence and 
		 * nextLine() take the complete sentence*/
		String x=s.nextLine();
		System.out.println("Result =");
		System.out.println(x);
		s.close();
	}

}
