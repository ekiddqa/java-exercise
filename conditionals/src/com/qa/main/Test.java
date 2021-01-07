package com.qa.main;

public class Test {
	
	
	//public static void main(String[] arg) {
	//	Results sample = new Results (150, 150, 84, "Sample");
		
	//	sample.setBiology(150);
	//	sample.setChemistry(150);
	//	sample.setPhysics(84);
	//	sample.setName("Sample");
	//}
	
// part 1
	public static void main(String[] arg) {
		int biology = 150;
		int chemistry = 150;
		int physics = 84;
		int total = biology+chemistry+physics;
		int max = 450;
		String name = "Sample";
		
		if (total < max*0.6) {
			System.out.println(name + "'s grade: Fail.");
		} else {
			System.out.println(name + "'s grade: Pass");
		}
	
	
	// part 2
	
	if (biology < 150*0.6 || chemistry <150*0.6 || physics <150*0.6) {
		System.out.println(name + "'s grade: Fail.");
	} else {
		System.out.println(name + "'s grade: Pass");
	
	//part 3
		int result = 0;
	if (biology < 150*0.6) {
		result += 1;
	} else if (chemistry <150*0.6) {
		result += 3;
	} else if (physics <150*0.6) {
		result += 5;
	} else {
		System.out.println(name + "'s grade: Pass");
	}
	switch(result) {
		case 1:
			System.out.println(name + "'s grade: Fail. Failed exam: Biology");
			break;
		case 3:
			System.out.println(name + "'s grade: Fail. Failed exam: Chemistry");
			break;
		case 5:
			System.out.println(name + "'s grade: Fail. Failed exam: Physics");
			break;
		case 4:
			System.out.println(name + "'s grade: Fail. Failed exams: Biology and Chemistry");
			break;
		case 6:
			System.out.println(name + "'s grade: Fail. Failed exams: Biology and Physics");
			break;
		case 8:
			System.out.println(name + "'s grade: Fail. Failed exams: Chemistry and Physics");
			break;
		case 9:
			System.out.println(name + "'s grade: Fail. Failed exams: Biology, Chemistry, and Physics");
			break;
	}
	}
	}
}

