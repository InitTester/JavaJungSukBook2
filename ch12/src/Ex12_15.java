// ThreadEx15
public class Ex12_15 {
	public static void main(String[] args) {
		ThreadEx15_1 t1 = new ThreadEx15_1();
		ThreadEx15_2 t2 = new ThreadEx15_2();
		
		t1.start();
		t2.start();
		
		try {
			t1.sleep(5000);
		} catch (InterruptedException e) {  }
		System.out.print("<<main 종료>>");
	}
}

class ThreadEx15_1 extends Thread {
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print("-");
		}
		System.out.print("<<th1 종료>>");
	}
}

class ThreadEx15_2 extends Thread {
	
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print("|");
		}
		System.out.print("<<th2 종료>>");
	}
}