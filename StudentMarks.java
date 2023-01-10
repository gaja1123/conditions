package day_5conditions;

public class StudentMarks {
	public static void main (String [] args) {
		int tamil = 89;
		int english = 92;
		int maths = 85;
		if (tamil>english&&tamil>maths) {
			System.out.println("Tamil is high");
		}
		else if (english>tamil&&english>maths) {
			System.out.println("english is high");
		}
	
		else {
			System.out.println("maths is high");
		}
		}

}
