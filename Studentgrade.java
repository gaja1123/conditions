package day_5conditions;

public class Studentgrade {
	public static void main(String [] args) {
		int mark = 82;
		if (mark>90&&mark<=100) {
			System.out.println("A grade");
		}
		else if (mark>80&&mark<=90) {
			System.out.println("B grade");
		}
		else if (mark>70&&mark<=80) {
			System.out.println("c grade");
		}
		else if (mark>60&&mark<=70) {
			System.out.println("D grade");
		}
		else if (mark>50&&mark<=60) {
			System.out.println("E grade");
		}
		else if (mark>40&&mark<=50) {
			System.out.println("F grade");
		}
		else if (mark<=40) {
			System.out.println("Fail");
		}
		else {
			System.out.println("Invalid data");
		}
	}
}
		
		
		
		
		
		
		
		
	


