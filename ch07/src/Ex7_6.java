public class Ex7_6 {
	// SuperTest2
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child2 c = new Child2();
		c.method();
	}
}

class Parent2 {
	int x =10;
}

class Chibld2 extends Parent2 {
	int x = 20;
	
	void method() {
		System.out.println("x= "+x);
		System.out.println("this.x= "+this.x);
		System.out.println("super.x= "+super.x);
	}
}