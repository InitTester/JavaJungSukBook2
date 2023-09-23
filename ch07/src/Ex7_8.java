public class Ex7_8 {
	// PointTest2
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point3D2 p3 = new Point3D2();
		System.out.println("p3.x = " +p3.x);
		System.out.println("p3.y = " +p3.y);
		System.out.println("p3.z = " +p3.z);
		System.out.println(p3.getLocation());
	}
}

class Point2 {
	int x = 10;
	int y = 20;
	
	Point2(int x,int y){ // 생성자 첫 줄에서 다른 생성자를 호출하지 않기 때문에 컴파일러가 'super();'를 여기에 삽입한다.
						 // super()는 Point의 조상인 Object클래스의 기본 생성자인 'Object()'를 의미한다.
		this.x = x;
		this.y = y;
	}
}

class Point3D2 extends Point2 {
	int z = 30;
	
	Point3D2(){
		this(100,200,300);
	}
	
	Point3D2(int x, int y, int z){	
		super(x,y);
		this.z = z;
	}
	
	String getLocation() {		
		return "x :" + x + ",y :" + y + ", z :" +z;
	}
}