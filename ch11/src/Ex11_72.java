// DateFormatEx3
import java.text.*;
import java.util.*;

public class Ex11_72 {
	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일");
		DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
		
		try {
			Date d = df.parse("2001년 3월 10일");
			System.out.println(df2.format(d));
		} catch (Exception e) {}
	}
}