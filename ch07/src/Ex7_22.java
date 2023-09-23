import java.util.Vector;

public class Ex7_22 {
	// PolyArgumentTest3
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer_3 b = new Buyer_3();
		Tv_3 tv = new Tv_3();
		Computer_3 com = new Computer_3();
		Audio_3 audio = new Audio_3();
		
		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		b.summaary_3();
		System.out.println();
		b.refund(com);
		b.summaary_3();
		System.out.println("===================================");
		System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
		System.out.println("현재 보너스점수는 " + b.bonusPoint + "점입니다.");		
	}
}

class Product_3 {
	int price;			// 제품의 가격
	int bonusPoint;		// 제품구매 시 제공하는 보너스 점수
	
	Product_3(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);		// 보너스점수를 제품가격의 10%
	}
	
	Product_3() {
		price = 0;
		bonusPoint = 0;
	}
}

class Tv_3 extends Product_3 {
	
	Tv_3(){	super(100);	}
		public String toString() { return "Tv"; }
}

class Computer_3 extends Product_3 {
	
	Computer_3(){ super(200); }	
	public String toString() { return "Computer"; }
}

class Audio_3 extends Product_3 {
	
	Audio_3(){ super(50); }	
	public String toString() { return "Audio"; }
}

class Buyer_3 {			// 고객, 물건을 사는사람
	
	int money = 1000;	// 보유금액
	int bonusPoint = 0; // 보너스 점수
	Vector item = new Vector();		// 구입한 제품을 저장하는데 사용될 Vector객체 
	
	
	void buy(Product_3 p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살수 없습니다.");
			return;
		}
		
		money -= p.price;		// 가진 돈에서 구입한 제품의 가격을 뺀다.
		bonusPoint += p.bonusPoint; // 제품의 보너스 점수를 추가한다.
		item.add(p);			// 구입한 제품을 Vector에 저장한다.
		System.out.println(p + " 을/를 구입하였습니다.");
	}
	
	void refund(Product_3 p) { // 구입한 제품을 환불한다.
		if(item.remove(p)) { //제품을 Vector에서 제거한다.
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + " 을/를 반품하셨습니다.");
		} else {
			System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
		}
	}
	
	void summaary_3() {			// 구매한 물품에 대한 정보를 요약해서 보여준다.
		
		int sum = 0;			// 구입한 물품의 가격합계
		String itemList = ""; 	// 구입한 물품목록
		
		if(item.isEmpty()) {	// Vector가 비어있는지 확인한다.
			System.out.println("구입하신 제품이 없습니다.");
			return;
		}
		
		//반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
		for(int i=0; i <item.size(); i++) {
			Product_3 p = (Product_3)item.get(i);
			sum += p.price;
			itemList += (i==0) ? "" : ", "+ p;
		}
		System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");		
	}
}