package com.qa.main;

public class Division {
	public static void main(String[] arg) {
		int num = 5;
		int num2 = 3;
		if(num < num2) {
			System.out.println("First number must be less than second.");
			
		} else {
			float result = (float) num/num2;
			System.out.print(result);
		}
	}
}