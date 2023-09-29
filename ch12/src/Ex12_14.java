// ThreadEx14
public class Ex12_14 {
	public static void main(String[] args) {
		ThreadEx14_1 t1 = new ThreadEx14_1();
		ThreadEx14_2 t2 = new ThreadEx14_2();
		
		t1.start();
		
		try {
			t1.join();	
		} catch (InterruptedException e) {  }
		t2.start();
	}
}

class ThreadEx14_1 extends Thread {
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print("-");
		}
	}
}

class ThreadEx14_2 extends Thread {
	
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print("|");
		}
	}
}