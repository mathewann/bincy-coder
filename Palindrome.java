package com.niit;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String or,reverse="";
	System.out.println("enter the string");
	Scanner sc= new Scanner(System.in);
	 or= sc.nextLine();
	 for(int i=or.length()-1;i>=0;i--)
	 {
		 reverse=reverse+ or.charAt(i);
		
		 }
	 System.out.println("reverse of string= "+reverse);
	 if(or.equals(reverse))
	 {
		 System.out.println("Yes");
	 }
	 else{
		 System.out.println("No");
	 }
	 }
	
			
	}


