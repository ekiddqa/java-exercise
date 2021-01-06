package com.qa.main;

public class Results {

	public static void display(int physics, int chemistry, int biology) {
		int totalMark = physics+chemistry+biology;
		System.out.println("Exam results: Physics:" + physics + " Chemistry:" + chemistry + " Biology:" + biology + "Total Marks:" + totalMark);
	}
	public static void percentage(int physics, int chemistry, int biology, int total) {
		int totalMark = physics+chemistry+biology;
		double percentage = totalMark/total;
		System.out.println(percentage*100 + "%");
	}
	public static void main(String[] arg) {
		int physics;
		int chemistry;
		int biology;
		System.out.println(display(50,100,140));
		System.out.println(percentage(50,100,140,450));
		
	}
}
