// ThreadEx9
public class Ex12_9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadEx9_1 th1 = new ThreadEx9_1();
		ThreadEx9_2 th2 = new ThreadEx9_2();
		
		th2.setPriority(7); // 보통우선순위=5, 최소우선순위=1, 최대우선순위=10
		
		System.out.println("Priority of th1 (-) : " + th1.getPriority());
		System.out.println("Priority of th2 (-) : " + th2.getPriority());
		
		th1.start();
		th2.start();
	}
}

class ThreadEx9_1 extends Thread {
	public void run() {
		for(int i = 0; i < 300 ; i++) {
			System.out.print("-");
			for(int x=0; i<10000000;x++);	// 작업을 지연시키기 위한 for문
		}
	}	
}

class ThreadEx9_2 extends Thread {
	public void run() {
		for(int i = 0; i < 300 ; i++) {
			System.out.print("|");
			for(int x=0; i<10000000;x++);
		}
	}	
}