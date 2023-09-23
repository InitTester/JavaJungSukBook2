public class Ex7_28 {
	// InterfaceTest2
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		A2 a = new A2();
		a.autoPlay(new B2());
		a.autoPlay(new C());
	}
}

interface I {
	public abstract void play();
}

class A2 {
	void autoPlay(I i) {
		i.play();
	}
}

class B2 implements I {
	@Override
	public void play() {
		System.out.println("play in B class");
	}
}

class C implements I {
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("play in C class");
	}
}