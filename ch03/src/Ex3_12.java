public class Ex3_12 {
	// OperatorEx12
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1000000 * 1000000 / 1000000; // 먼저 곱하는 경우 int의 범위를 넘어선 상태에서 다음 연산 실행
		int b = 1000000 / 1000000 * 1000000;		
		System.out.println(a);
		System.out.println(b);
	}
}