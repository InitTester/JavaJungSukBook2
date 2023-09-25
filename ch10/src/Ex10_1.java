public class Ex10_1 {
	// InnerEx1
	class InstanceInner {
		int iv = 100;
		static int cv = 100; 			// static변수를 선언할 수 없다.(16버전 이전)
		final static int CONST = 100;	// final static은 상수이므로 허용한다.
	}
	
	static class StaticInner {
		int iv = 200;
		static int cv = 200; 		// static 클래스만 static멤버를 정의할 수 있다.
	}
	
	void myMethod() {
		class LocalInner {
			int iv = 300;
			static int cv = 300;	// static변수를 선언할 수 없다.(16버전 이전)
			final static int CONST = 300;	
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
	}
}
