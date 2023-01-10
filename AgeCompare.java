package day_5conditions;

public class AgeCompare {
	public static void main (String [] args) {
		int age = 15;
		if (age>0&&age<=12){
			System.out.println("kid");
		}
		else if (age>12&&age<=20) {
			System.out.println("Adult");
		}
		else {
			System.out.println("Invalid data");
		}
		
	}

}
