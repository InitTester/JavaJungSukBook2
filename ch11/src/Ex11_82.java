// GenericsEx3
import java.util.*;

public class Ex11_82 {
	public static void main(String[] args) {
		ArrayList<Student4> list = new ArrayList<Student4>();
		
		list.add(new Student4("자바왕",1,1,100,100,100));
		list.add(new Student4("자바짱",1,2,90,80,70));
		list.add(new Student4("홍길동",2,1,70,70,70));
		list.add(new Student4("전우치",2,2,90,90,90));
		
		Collections.sort(list);// list를 정렬한다.
		
		Iterator<Student4> it = list.iterator();
		
		while(it.hasNext()) {
			Student4 s = it.next();
			System.out.println(s);
		}
	}
}

class Student4 implements Comparable<Student4> {
	String name = "";
	int ban;
	int no;
	int koreanScore = 0;
	int mathScore = 0;
	int englishScore = 0;
	
	int total = 0;
	
	Student4(String name, int ban, int no, int koreanScore, int mathScore, int englishScore) {
		
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
	
	public int compareTo (Student4 o) {
		return o.total - this.total;
	}
}