package zPractice.exersize;
import java.util.Scanner;
public class Fibonacci_non_recursive {
	public static void fib(int n)
	{
		int a=0 , b=1;
		for (int i=0; i<n; i++)
		{
			System.out.println(a+" ");
			int c=a+b;
			a=b;
			b=c;
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int n=sc.nextInt();
		fib(n);
		sc.close();
	}

}
