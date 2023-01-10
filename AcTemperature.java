package day_5conditions;

public class AcTemperature {
	public static void main(String [] args) {
		int temp = 26;
		if (temp>=16&&temp<=20) {
			System.out.println("Very cold Weather");
		}
		else if (temp>=21&&temp<=25) {
			System.out.println("Cold Weather");
			
		}
		else if(temp>=26&&temp<=30) {
			System.out.println("Normal Weather");
				
			}
		else {
			System.out.println("Invalid temperature");
		}
	}
	

}
