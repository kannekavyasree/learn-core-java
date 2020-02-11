package com.learn.fundamentals;

import java.util.Scanner;

public class GreatestAmong3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value of a");
		int a = sc.nextInt();
		System.out.println("enter value of b");
		int b = sc.nextInt();
		System.out.println("enter value of c");
		int c = sc.nextInt();
	if(a>b && a>c)
	{
		System.out.println("a is the greatest number "+ a);
	}
	else if(b>a && b>c)
	{
		System.out.println("b is the greatest number "+ b);
	}	
	else if(c>a && c>b)	
	{
		System.out.println("c is the greatest number "+ c);
	}
}
}
