import java.util.*;
// HashSetLotto
public class Ex11_20 {
	public static void main(String[] args) {
		Set set = new HashSet();
		
		for(int i = 0; set.size() < 6; i++) {
			int num = (int)(Math.random() *45) +1;
			set.add(new Integer(num));
		}
		
		List list = new LinkedList(set);	// LinkedList(Collection c)
		Collections.sort(list);
		System.out.println(list);
	}
}