package com.niit;

import java.util.Scanner;
public class UpperLower{

public static String toToggleCase(String inputString) {
String result = "";
for (int i = 0; i < inputString.length(); i++) {
char currentChar = inputString.charAt(i);
if (Character.isUpperCase(currentChar)) {
char currentCharToLowerCase = Character.toLowerCase(currentChar);
result = result + currentCharToLowerCase;
} else {
char currentCharToUpperCase = Character.toUpperCase(currentChar);
result = result + currentCharToUpperCase;
}
}
return result;
}

public static void main(String[] args) {
Scanner scanner = new Scanner(System .in);
System.out.print("Enter an input String: ");
String inputString = scanner.nextLine();

System.out.println("Toggle Case: " + toToggleCase(inputString) );}}