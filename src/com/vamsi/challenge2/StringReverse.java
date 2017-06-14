package com.vamsi.challenge2;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="";
        System.out.println("Enter the string");
        try
        {
        	Scanner scan = new Scanner(System.in);
        	input=scan.nextLine();	            
            char[] str= input.toCharArray();
            for (int i=str.length-1;i>=0;i--)
            System.out.print(str[i]);
            scan.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

	}

}
