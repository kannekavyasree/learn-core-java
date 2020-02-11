package com.learn.fundamentals;
import java.util.Scanner;

public class LearnWhileLoop {

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        int N = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	        int i=0;
	        while(i<10){
	        i++;
	        int result= N*i;
	        System.out.println(N+ " x " +i+ " = "+result);
	        }
	        scanner.close();
	    }


}
