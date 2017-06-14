package com.vamsi.challenge2;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the Number: ");
	       Scanner s = new Scanner(System.in);
	       int num = s.nextInt();
	       int n = num;
	       //reversing number
	       int rev=0,rmd; 
	       while(num > 0) 
	       { 
	         rmd = num % 10; 
	         rev = rev * 10 + rmd; 
	         num = num / 10; 
	       } 
	       if(rev == n) 
	         System.out.println(n+" is a Palindrome Number!"); 
	       else 
	         System.out.println(n+" is not a Palindrome Number!"); 
	       s.close(); 
	     } 
}
