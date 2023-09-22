public class Ex6_22 {
	// BlockTest
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		System.out.println("Ex6_22 e = new Ex6_22();");
		Ex6_22 e = new Ex6_22();
		
		System.out.println("Ex6_22 e2 = new Ex6_22();");
		Ex6_22 e2 = new Ex6_22();
	}
	
	static {
		System.out.println("static { }");	// 클래스 초기화 블럭
	}
	
	{
		System.out.println(" { } ");	// 인스턴스 초기화 블럭
	}
	
	public Ex6_22() {
		System.out.println("생성자");
	}
}