// StringTokenizerEx5
import java.util.StringTokenizer;

public class Ex11_67 {
	public static void main(String[] args) {
		String data = "100,,,200,300";
		
		// 빈문자열도 토큰으로 인식, 데이터를 토큰으로 잘라낸 결과를 배열에 담아서 반환하기때문에 StringTokenizer보다 성능이 떨어진다
		String[] result = data.split(","); 
		StringTokenizer st = new StringTokenizer(data,",");
		
		for(int i=0; i < result.length; i++) 
			System.out.print(result[i]+"|");
		
		System.out.println("개수:" + result.length);
		
		int i =0;
		for(;st.hasMoreTokens();i++)
			System.out.print(st.nextToken()+"|");
		
		System.out.println("개수:"+i);
	}
}