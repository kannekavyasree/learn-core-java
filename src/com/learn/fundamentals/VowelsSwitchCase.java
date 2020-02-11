package com.learn.fundamentals;

public class VowelsSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'a';

		switch (ch) {
		case 'a':
			System.out.println("vowel");
			System.out.println("testing");
			break;
		case 'e':
			System.out.println("vowel");
			break;
		case 'i':
			System.out.println("vowel");
			break;
		case 'o':
			System.out.println("vowel");
			break;
		case 'u':
			System.out.println("vowel");
			break;
		case 's':
			System.out.println(" not vowel");
			break;
		default:
			System.out.println("invalid");
		}
	}
}
