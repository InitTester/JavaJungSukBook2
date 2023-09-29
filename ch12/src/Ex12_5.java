// ThreadEx5
public class Ex12_5 {
	static long startTime = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadEx5 t1 = new ThreadEx5();
		t1.start();
		startTime = System.currentTimeMillis();
		
		for(int i =0; i < 300; i ++) {
			System.out.print("-");
		}
		System.out.print("소요시간1: "+ (System.currentTimeMillis()-Ex12_5.startTime));
	}
}

class ThreadEx5 extends Thread {
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print("|");
		}
		System.out.print("소요시간2: "+ (System.currentTimeMillis()-Ex12_5.startTime));
	}	
}