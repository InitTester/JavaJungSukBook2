public class Ex3_8 {
	// OperatorEx8
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 10;
		byte b = 20;
		byte c = a + b;	// 컴파일러 에러가 발생한다. 명시적으로 형변환이 필요하다. ex : byte c  = (byte)(a+b);
		System.out.println(c);
	}
}