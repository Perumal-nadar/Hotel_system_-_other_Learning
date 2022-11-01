package javaApp;
import java.util.Scanner;
public class Fabonacci_series {

	public static void main(String[] args) {
		F_S();

	}
	public static void F_S() {
		
		int a = 0,b = 1,c,ser;
		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter the number to find the Fibonacci Series: ");
		ser = scan.nextInt();
		System.out.println(a);
		System.out.println(b);
		for(int i=1 ; i<=ser ;i++) {
			c = a+b;
			System.out.println(c);
			 a = b;
			 b = c;
		}

	}
}