public class Ex4_27 {
	//FlowEx27
	public static void main(String[] args) throws java.io.IOException  {
		// TODO Auto-generated method stub
		// for문에 Loop1이라는 이름을 붙였다.
		Loop1 : for(int i=2; i<= 9; i++) {
					for(int j=1; j<= 9; j++) {
						if(j==5)
							//break Loop1;  // Loop1 끝
							//break;		// j가 5까지만 하고 계속 for문 실행 그 이후 모두 출력				
							continue Loop1;	// j=5까지 출력하고 Loop1 실행 (Loop1안에서 머무는 느낌)
							//continue;	// j=5를 제외하고 모든 값 출력
						System.out.println(i+ "*" + j + "=" + i*j);
					}
		System.out.println();
		}
	}
}