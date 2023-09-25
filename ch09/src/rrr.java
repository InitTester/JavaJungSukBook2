
public class rrr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("abc");
		StringBuffer sb2 = sb.append(true);
		sb.append('d').append(10.0f);
		StringBuffer sb3 = sb.append("ABC").append(123);
		
		System.out.println(sb);
		System.out.println(sb2);
		System.out.println(sb3);
		
	}

}
