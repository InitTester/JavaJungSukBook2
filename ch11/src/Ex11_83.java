// GenericsEx4
import java.util.*;

public class Ex11_83 {
	public static void main(String[] args) {
		ArrayList<Student5> list = new ArrayList<Student5>();
		
		list.add(new Student5("자바왕",1,1,100,100,100));
		list.add(new Student5("자바짱",1,2,90,80,70));
		list.add(new Student5("홍길동",2,1,70,70,70));
		list.add(new Student5("전우치",2,2,90,90,90));
		
		Collections.sort(list);// list를 정렬한다.
		
		Iterator<Student5> it = list.iterator();
		
		while(it.hasNext()) {
			Student5 s = it.next();
			System.out.println(s);
		}
	}
}

// <T extends Comparable<? super T>>에서 'T'가 Student타입이므로 
// <Student extends Comparable<Student>>와
// <Student extends Comparable<Person>>이 가능하다.
class Student5 extends Person3 implements Comparable<Person3> {
	String name = "";
	int ban;
	int no;
	int koreanScore = 0;
	int mathScore = 0;
	int englishScore = 0;
	
	int total = 0;
	
	Student5(String name, int ban, int no, int koreanScore, int mathScore, int englishScore) {
		super(ban+"-"+no,name);
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.koreanScore = koreanScore;
		this.mathScore = mathScore;
		this.englishScore = englishScore;
		
		total = koreanScore+ mathScore + englishScore;
	}
	
	public String toString() {
		return name + "\t" + ban + "\t" + no  + "\t" 
				+ koreanScore + "\t" + mathScore 
				+ "\t" + englishScore + "\t" + total + "\t" ;
	}
	
	// Comparable<Person>이므로 Person타입의 매개변수를 선언.
	public int compareTo (Person3 o) {
		return id.compareTo(o.id);	// String클래스의 compareTo()를 호출
	}
}

class Person3{
	String id;
	String name;
	
	Person3(String id,String name){
		this.id = id;
		this.name = name;
	}
}