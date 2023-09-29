// ThreadEx2
public class Ex12_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThreadEx2 t1 = new MyThreadEx2();
		t1.start();
	}
}

class MyThreadEx2 extends Thread {
	public void run() {
		throwException();
	}
	
	public void throwException() {
		try {
			throw new Exception();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}