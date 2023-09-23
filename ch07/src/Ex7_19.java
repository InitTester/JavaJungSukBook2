public class Ex7_19 {
	// BindingTest3
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent_2 p = new Child_2();
		Child_2 c = new Child_2();
		
		System.out.println("p.x = " + p.x);
		p.method();
		System.out.println();		
		System.out.println("c.x = " + c.x);
		c.method();
	}
}

class Parent_2 {
	int x = 100;
	
	void method() {
		System.out.println("Parent Method");
	}
}

class Child_2 extends Parent_2 { 
	int x = 200;
	
	void method() {
		System.out.println("x = " + x);
		System.out.println("super.x = "+ super.x);
		System.out.println("this.x = "+ this.x);
	}
}