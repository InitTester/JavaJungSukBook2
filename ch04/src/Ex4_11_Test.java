public class Ex4_11_Test {
	//FlowEx11_Test
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 98;
		String grade = " ";
		
		switch(score/10) {
			case 9: grade = (score <= 95) ? "A" : "A+"; break;
			case 8: grade = (score <= 85) ? "B" : "B+"; break;
			case 7: grade = (score <= 75) ? "C" : "C+"; break;
			case 6: grade = (score <= 65) ? "D" : "D+"; break;
			default: grade = "F";
		}	// end of switch
		System.out.println("당신의 학점은 " + grade + "입니다.");
	}
}