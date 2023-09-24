public class Ex9_6 {
	//CardToString2
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card2 c = new Card2("HEART",10);		
		System.out.println(c.toString());
	}
}

class Card2{
	String kind;
	int number;
	
	Card2(){
		this("SPADE",1);
	}
	
	Card2(String kind, int number){
		this.kind = kind;
		this.number = number;
	}
	
	public String toString() {
		// Card인스턴스의 kind와 number를 문자열로 반환한다.
		return "kind : " + kind + ", number : " + number;
	}
}