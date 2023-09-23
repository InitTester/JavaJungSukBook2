public class Ex7_13 {
	// SingletonTest
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Singleton s = new Singleton(); // The constructor Singleton() is not visible
		Singleton s1 = Singleton.getInstance();
	}
}

final class Singleton {
	private static Singleton s = new Singleton();
	
	private Singleton() {
		//...
	}
	
	public static Singleton getInstance() {
		if(s==null) {
			s = new Singleton();
		}
		return s;
	}
	
	//...
}