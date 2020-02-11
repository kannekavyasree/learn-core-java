package com.learn.fundamentals;

import java.util.Scanner;

public class LearnSwitchCases {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the marks");
		int n = sc.nextInt();
		sc.close();


		switch (n/10) {
		case 1:		
		case 2:			
		case 3:
			System.out.println("fail");
		break;
		case 4:
		case 5:
		 {
			System.out.println("3rd class");
		}
		break;
		case 6:
		case 7:
		 {
			System.out.println("2nd class");
		}
		break;
		case 8:
		case 9:
		case 10:
		 {
			System.out.println("1st class");
		}
		break;
		default: System.out.println("invalid entry");
		}
	}

}
