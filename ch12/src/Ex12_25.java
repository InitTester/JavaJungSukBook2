// ThreadEx25
public class Ex12_25 {
	public static void main(String[] args) {
		Runnable r = new RunnableEx25();
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		
		t1.start();
		t2.start();
	}
}

class Account2 {
	int balance = 1000;
	
	public synchronized void withdraw(int money) {
		if(balance >= money) {
			try { Thread.sleep(1000); } catch (Exception e) {}
			balance -= money;
		}

		System.out.println("withdraw.balance : "+ balance);
	}
}

class RunnableEx25 implements Runnable {
	Account2 acc = new Account2();
	
	public void run() {
		while(acc.balance >0){
			// 100,200,300 중의 한 값을 임의로 선택해서 출금(withdraw)
			int money = (int)(Math.random() * 3 +1)*100;
			acc.withdraw(money);
			System.out.println("balance : "+ acc.balance);
		}
	}	
}