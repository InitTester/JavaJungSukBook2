public class Ex4_13 {
	//FlowEx13
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;		// 합계를 저장하기 위한 변수.
		
		for(int i =1; i<=10; i++) {
			sum += i;
		}
		System.out.println(i-1 + "까지의 합: " + sum); // 에러발생! i는 for문 안에서만 가능. 유효범위(scope)가 아니다.
	}
}