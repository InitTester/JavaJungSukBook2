public class Ex10_6 {
	Object iv = new Object() { void method(){} };	// 익명클래스
	static Object cv = new Object() { void method(){} };	// 익명클래스
	
	void myMethod() {
		Object lv = new Object() { void method(){} }; // 익명클래스
	}
	
	// InnerEx6
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}