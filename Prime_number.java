package javaApp;
import java.util.Scanner;
public class Prime_number {

	public static void main(String[] args) {
		demo();

	}
		public static void demo() {
			int input;
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the Number to check weather it is Prime Number OR Not:");
			input = scan.nextInt();
			if (input == 2) {
				System.out.println("It is a prime number....");
			}
			else if (input == 3) {
				System.out.println("It is a prime number....");
			}
			else if(2%input == 0) {
				System.out.println("It is not a prime number....");
			}
			else if(3%input == 0) {
				System.out.println("It is not a prime number....");
			}
			else {
				System.out.println("It is a prime number....");
			}
			
		}

}
