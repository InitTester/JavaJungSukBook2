public class Ex4_26 {
	//FlowEx26
	public static void main(String[] args) throws java.io.IOException  {
		// TODO Auto-generated method stub
		for(int i =0; i <= 10; i++) {
			if(i%3==0)
				continue; // 조건식이 true가 되어 continue문이 수행되면 반복문의 끝으로 이동한다. break문과 달리 반복문 전체를 벗어나지 않는다.
			System.out.println(i);
		}
	}
}