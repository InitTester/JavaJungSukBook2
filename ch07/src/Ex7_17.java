public class Ex7_17 {
	// BindingTest
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent_0 p = new Child_0();
		Child_0 c = new Child_0();
		
		System.out.println("p.x = " + p.x);
		p.method();
		
		System.out.println("c.x = " + c.x);
		c.method();
	}
}

class Parent_0 {
	int x = 100;
	
	void method() {
		System.out.println("Parent Method");
	}
}

class Child_0 extends Parent_0 {
	int x = 200;
	
	void method() {
		System.out.println("Child Method");
	}
}