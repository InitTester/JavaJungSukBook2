public class Ex3_6 {
	// OperatorEx6
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 10;
		// byte result =7 ~b;	'~'연산의 결과가 int라서 byte형변수에 저장할 수 없다.
		byte result = (byte)~b;
		
		System.out.println("b = " + b);
		System.out.println("~b = " + result);
	}
}
