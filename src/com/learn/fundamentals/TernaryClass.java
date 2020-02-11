package com.learn.fundamentals;

import java.util.Scanner;

public class TernaryClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of a");
		int a = sc.nextInt();
		System.out.println("enter the value of b");
		int b = sc.nextInt();
		System.out.println("enter the value of c");
		int c = sc.nextInt();
	
		int max=(a>b)?((a>c)?a:c):b;
		System.out.println("the greatest value among a b c is "+ max);

	}

}
