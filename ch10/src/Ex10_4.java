class Outer{
	class InstanceInner4{
		int iv = 100;
	}
	
	static class StaticInner4 { 
		int iv = 200;
		static int cv = 300;
	}

	void myMethod() {
		class LocalInner{
			int iv = 400;
		}
	}
}

public class Ex10_4 {
	// InnerEx4	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 인스턴스클래스의 인스턴스를 생성하려면
		// 외부 클래스의 인스턴스를 먼저 생성해야 한다.
		Outer oc = new Outer();
		Outer.InstanceInner4 ii = oc.new InstanceInner4();
		
		System.out.println("ii.iv : " + ii.iv);
		System.out.println("Outer.StaticInner4.cv : " + Outer.StaticInner4.cv);
		
		// static 내부 클래스의 인스턴스는 외부 클래스를 먼저 생성하지 않아도 된다.
		Outer.StaticInner4 si = new Outer.StaticInner4();
		System.out.println("si.iv : " + si.iv);
	}
}