public class Ex9_13 {
	// StringEx5		
	
	static String s ;
	static String s2 = "";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i =0; i <10; i++) {
			s += i;		// s = s + i;
			s2 += i;
		}
		System.out.println(s);
		System.out.println(s2);
	}
} 