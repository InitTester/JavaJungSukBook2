public class Ex7_14 {
	// CastingTest1
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;	// car = (Car)fe;에서 형변환이 생략된 형태다.
//		car.water();	// 컴파일러 에러!!! Car타입의 참조변수로는 water()를 호출할 수 없다.
		fe2 = (FireEngine)car;
		fe2.water();
	}
}

class Car {
	String color;
	int door;
	
	void drive() {	// 운전하는 기능
		System.out.println("drive, Brrr~");
	}
	
	void stop() {	// 멈추는 기능
		System.out.println("stop!!!");
	}
}

class FireEngine extends Car { // 소방차
	void water() { // 물을 뿌리는 기능
		System.out.println("water!!!");
	}
}