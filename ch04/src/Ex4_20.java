public class Ex4_20 {
	//FlowEx20
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("자, 이제 카운트다운을 시작합니다.");
		for(int i = 10; i >=0; i --) {
			for(int j = 0; j <1000000000; j++) { // int 1,000,000,000  / for j의 = for(int j = 0; j <1000000000; j++) {} 가능
				;
			}	
			System.out.println(i);
		}
		System.out.println("Game Over");
	}
}