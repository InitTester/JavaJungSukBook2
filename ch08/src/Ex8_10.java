public class Ex8_10 {
	// ExceptionEx10
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0);	// 0으로 나눠서 고의로 ArithmeticException을 발생
			System.out.println(4);
		} catch (Exception e) {	// ArithmeticException대신 Exception을 사용
			System.out.println(5);
		}
		System.out.println(6);
	}
}