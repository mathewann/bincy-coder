package com.niit;

import java.util.Scanner;

public class Force {

	public static void main(String[] args) {
		System.out.print("Enter an input String: ");
		Scanner in = new Scanner(System .in);
		while(true)
		{
			int  n=in.nextInt();
			if(n==42)
				break;
			System.out.print(n);
			
		}
	}
}
