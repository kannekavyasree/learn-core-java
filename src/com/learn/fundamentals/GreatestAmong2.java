package com.learn.fundamentals;

import java.util.Scanner;

public class GreatestAmong2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value of a");
		int a = sc.nextInt();
		System.out.println("enter value of b");
		int b = sc.nextInt();
		if (a > b)
		{
			System.out.println("the greatest number is " + a);
		}
		else
		{
			System.out.println("the gretest number is "+ b);
		}		
	}
}
