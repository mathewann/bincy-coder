package com.niit;

import java.util.Scanner;

public class MyFact {

	public static void main(String[] args) {
		int i,fact=1,n;
		System.out.println("enter the no");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
			
		}
		
		System.out.println("Factorial of "+ n + " is "+fact);
	}

}
