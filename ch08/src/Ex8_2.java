public class Ex8_2 {
	// ExceptionEx2
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 100;
		int result = 0;
		int check = 0;
		
		for(int i =0; i < 10; i ++) {
			check =(int)(Math.random()*10);
			System.out.println("number : " + number + ", check :  " + check );
			result = number / check; // 7번째 라인
			System.out.println(result);
		}
	}
}