package com.niit;

import java.util.Scanner;

public class TestExmp01 {

@SuppressWarnings("resource")
public static void main(String[] args) {
int l;
int dm;
Scanner sc= new Scanner(System.in);
System.out.println("Enter the number");
l=sc.nextInt();
dm=l*l;
Scanner rc= new Scanner(System.in);
System.out.println("Enter the number");
int w=rc.nextInt();
Scanner pc= new Scanner(System.in);

System.out.println("Enter the number");
int h=pc.nextInt();
int pd=w*h;
if(pd==dm){
System.out.println("The photo is Accepted");
}
else if (w!=l){
System.out.println("change photo");

}

else if (h!=l){
System.out.println("change photo");

}

else{
System.out.println("Crop the photo");

}





}}


