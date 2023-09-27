// RandomEx2
import java.util.*;

public class Ex11_49 {
	public static void main(String[] args) {
		Random rand = new Random();
		int[] number = new int[100];
		int[] counter = new int[10];
		
		for(int i =0; i < number.length; i++) {
//			System.out.println(number[i] = (int)(Math.random() * 10));
			// 0 <= 10 범위의 정수 x를 반환한다.
			System.out.print(number[i] = rand.nextInt(10)); // nextInt(int n) 은 0~n사이의 정수를 반환한다. 단 n은 범위에 포함되지 않는다.
		}
		System.out.println();
		
		for(int i = 0; i < number.length; i ++)
			counter[number[i]]++;
		
		for(int i = 0; i < counter.length; i ++)
			System.out.println(i + "의 개수 :" + printGraph('#',counter[i])+ " " + counter[i]);
	}
	
	public static String printGraph(char ch, int value) {
		char[] bar = new char[value];
		
		for(int i = 0; i < bar.length; i++)
			bar[i] = ch;
		
		return new String(bar);
	}
}