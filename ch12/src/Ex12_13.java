// ThreadEx13
public class Ex12_13 {
	static long startTime =0;
	
	public static void main(String[] args) {
		ThreadEx13_1 t1 = new ThreadEx13_1();
		ThreadEx13_2 t2 = new ThreadEx13_2();
		
		t1.start();
		t2.start();
		startTime = System.currentTimeMillis();
		
		try {
			t1.join();	// t1의 작업이 끝날 때까지 기다린다.
			t2.join();	// t2의 작업이 끝날 때까지 기다린다.
		} catch (InterruptedException e) { }
		System.out.print("소요시간 : " + (System.currentTimeMillis() - Ex12_13.startTime));
	}
}

class ThreadEx13_1 extends Thread {
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print("-");
		}
	}
}

class ThreadEx13_2 extends Thread {
	
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print("|");
		}
	}
}