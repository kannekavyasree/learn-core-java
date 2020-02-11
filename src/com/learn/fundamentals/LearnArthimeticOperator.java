package com.learn.fundamentals;

import java.util.Scanner;

public class LearnArthimeticOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of a");
		int a = sc.nextInt();
		System.out.println("enter the value of b");
		int b = sc.nextInt();
		sc.nextLine();
		System.out.println("please select the operator");
		String x = sc.nextLine();
		if (x.equalsIgnoreCase("ADD")) {
			System.out.print("adding 2 integers ");
			System.out.print(a + b);
		}
		if (x.equals("SUB")) {
			System.out.print("substracting 2 integers ");
			System.out.print(a - b);
		}
		if (x.equals("MULTIPLICATION")) {
			System.out.print("multipying 2 integers ");
			System.out.print(a * b);
		}
		if (x.equals("DIVISION")) {
			System.out.print("dividing 2 integers ");
			System.out.print(a / b);
		}
		if(x.equals("MODULUS"))
		 {
			System.out.print("modulus 2 integers ");
			System.out.print(a % b);
		}
		else
		{
			System.out.println("no condition matched");
		}
	

	}

}
