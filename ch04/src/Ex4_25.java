public class Ex4_25 {
	//FlowEx25
	public static void main(String[] args) throws java.io.IOException  {
		// TODO Auto-generated method stub
		int sum = 0;
		int i = 0;
		
		while(true) {
			if(sum > 100)
				break;
			++i;
			sum += i;
		}
		// i  = 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14
		//sum = 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, 66, 78, 91, 105
		
		System.out.println("i = " + i);
		System.out.println("sum = " + sum);		
	}
}