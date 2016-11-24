package com.niit;

import java.util.Scanner;
//static String s;


public class MyString {

	public static void main(String[] args) {
		System.out.println("enter the string");
		Scanner sc= new Scanner(System.in);
		 String s1 = sc.nextLine();
		 char c[]=s1.toCharArray();
		 for (int i = 0; i < c.length; i++) {
			 
		 if (Character.isUpperCase(c[i])) { // Upper Case
			   System.out.println(Character.isLowerCase(c[i]));
			   
			   
			} else if (Character.isLowerCase(c[i])) 
					{ // Lower Case
				System.out.println(Character.isUpperCase(c[i]));
			
			} 
			}
}}
		
		
