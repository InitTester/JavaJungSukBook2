public class Ex4_23 {
	//FlowEx23
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int i = 0;
		
		while(sum + i <= 100) {
			sum += ++i;	// sum = sum + ++i;
			System.out.println(i + " - " + sum);
			// i = 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 // , 14, 15 
		  // sum = 0, 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, 66, 78, 91 //, 105, 120
		//sum +i = 0, 2, 5, 9, 14, 20, 27, 35, 44, 54, 65, 77, 90 //  , 104
		}
	}
}