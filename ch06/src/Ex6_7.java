public class Ex6_7 {
	// CallStackTest
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		firstMethod();
	}
	
	static void firstMethod() {
		secondMetehod();
	}
	
	static void secondMetehod() {
		System.out.println("secondMethod()");
	}
}