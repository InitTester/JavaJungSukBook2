public class Ex9_16 {
	// StringEx8
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] number = {"1","2","3","4","5"};
		String result1 = "";
		int result2 = 0;
		
		for(int i = 0; i < number.length; i ++) {
			result1 += number[i];
			result2 += Integer.parseInt(number[i]);
		}
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
	}
}  