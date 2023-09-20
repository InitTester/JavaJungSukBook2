public class Ex3_15 {
	// OperatorEx15
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = 'a'; // 97
		for(int i =0; i <26; i++) {
			System.out.print(c++); // a~z
		}
		
		System.out.println();
		
		c = 'A';	// 65
		for(int i =0; i <26; i++) {
			System.out.print(c++);	// A~Z
		}
		
		// a, A 의 사이 구분은 -32, +32로 가능 (
		
		System.out.println();
		
		c='0';
		for(int i =0; i <10; i++) {
			System.out.print(c++);	// 0~9
		}

		System.out.println();
	}
}