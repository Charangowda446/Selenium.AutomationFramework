package JAVA;

import java.util.Scanner;

public class Buzz_Number {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter Number:");
			int n=sc.nextInt();

			if (n%7== 0 || n%10==7) {
			    System.out.println(n + " is a Buzz Number");
			} 
			else 
			{
			    System.out.println(n + " is not a Buzz Number");
			}
		}
	}
}
