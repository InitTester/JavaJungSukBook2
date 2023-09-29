// ThreadEx1
public class Ex12_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadEx1 t1 = new ThreadEx1(); 
		
		Runnable r = new ThreadEx2();
		Thread t2 = new Thread(r);	// 생성자 Thread(Runnable target)
		
		t1.start();
		t2.start();
	}
}

class ThreadEx1 extends Thread{
	public void run() { 
		for(int i = 0; i < 5; i++) {
			System.out.println(getName());	// 조상인 Thread의 getName()을 호출
		}
	}
}

class ThreadEx2 implements Runnable {
	public void run() {
		for(int i =0; i <5; i++) {
			//Thread.currentThread() - 현재 실행중인 Thread를 반환한다.
			System.out.println(Thread.currentThread().getName());
		}
	}
}
