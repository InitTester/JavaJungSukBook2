public class Ex10_2 {
	// InnerEx2
	class InstanceInner2 { }	
	static class StaticInner2 { }
	
	//인스턴스멤버 간에는 서로 직접 접근이 가능하다.
	InstanceInner2 iv = new InstanceInner2();
	// static 멤버 간에는 서로 직접 접근이 가능하다.
	static StaticInner2 cv = new StaticInner2();
	
	static void staticMethod() {
		// static멤버는 인스턴스멤버에 직접 접근할 수 없다.
		// InstanceInner2 obj1 = new InstanceInner2();
		StaticInner2 obj2 = new StaticInner2();
		
		// 굳이 접근하려면 아래와 같이 객체를 생성해야 한다.
		// 인스턴스클래스는 외부 클래스를 먼저 생성해야만 생성할 수 있다.
		Ex10_2 outer = new Ex10_2();
		InstanceInner2 obj1 = outer.new InstanceInner2();
	}
	
	void instanceMethod() {
		//인스턴스메서드에서는 인스턴스멤버와 static멤버 모두 접근 가능하다.
		InstanceInner2 obj1 = new InstanceInner2();
		StaticInner2 obj2 = new StaticInner2();
		//메서드 내에 지역적으로 선언된 내부 클래스는 외부에서 접근할 수 없다.
		// LocalInner lv = new LocalInner();
	}
	
	void myMethod() {
		class LocalInner{}
		LocalInner lv = new LocalInner();
	}
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//	}
}
