package day_5conditions;

public class StudentHeightComparison {
	public static void main(String [] args) {
		int ajay = 132;
		int ram = 129;
		int vijay = 135;
		int arun = 144;
		if (ajay<ram&&ajay<vijay&&ajay<arun) {
			System.out.println("ajay is shortest");
		}
		else if (ram<ajay&&ram<vijay&&ram<arun) {
			System.out.println("Ram is shortest");
		
		}
		else if (vijay<ajay&&vijay<ram&&vijay<arun) {
			System.out.println("vijay is shortest");
		}
		else {
			System.out.println("arun is shortest");
		}
		
	
	}

}
