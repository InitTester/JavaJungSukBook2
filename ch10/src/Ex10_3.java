public class Ex10_3 {
	// InnerEx3
	private int outerIv = 0;
	static int outerCv = 0;

	class InstanceInner3 {
		int iiv = outerIv;	// 외부 클래스의 private멤버도 접근가능하다.
		int iiv2 = outerCv;
	}

	static class StaticInner3 { 
		// static 클래스는 외부 클래스의 인스턴스멤버에 접근할 수 없다.
//		int siv = outerIv;
		static int scv = outerCv;
	}

	void myMethod() {
		int lv = 0;
		final int LV = 0;
		
		class LocalInner{
			int liv = outerIv;
			int liv2 = outerCv;
			// 외부 클래스의 지역변수는 final이 붙은 변수(상수)만 접근가능하다.
			int liv3 = lv; // JDK1.8버전 이상 에러 아님, 자동적으로 final 선언
			int liv4 = LV;
		}
	}
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//	}
}
