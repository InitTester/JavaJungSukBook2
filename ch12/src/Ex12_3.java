// ThreadEx3
public class Ex12_3 {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		MyThreadEx3 t1 = new MyThreadEx3();
		t1.start();
		
	}
}

class MyThreadEx3 extends Thread {
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