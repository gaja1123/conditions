package day_5conditions;

public class GreetingTime {
	public static void main (String [] args) {
		int time = 19;
		if (time>=6&&time<=11) {
			System.out.println("good morning");
		}
		else if (time>=12&&time<=15) {
			System.out.println("good afternoon");
		}
		else if (time>=16&&time<=20) {
			System.out.println("good evening");
		}
		else if (time>=21&&time<=24) {
			System.out.println("good night");			
		}
		else {
			System.out.println("Invalid data");
		}
	}

}
