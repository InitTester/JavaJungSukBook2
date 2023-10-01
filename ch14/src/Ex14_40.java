// SerialEx2
import java.io.*;
import java.text.*;
import java.util.*;

public class Ex14_40 {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String fileName = "Ex14_38.ser";
			FileInputStream fis = new FileInputStream(fileName);
			BufferedInputStream bis = new BufferedInputStream(fis);
			
			ObjectInputStream in = new ObjectInputStream(bis);
			
			// 객체를 읽을 때는 출력한 순서와 일치해야한다.
			Ex14_38 u1 = (Ex14_38)in.readObject();
			Ex14_38 u2 = (Ex14_38)in.readObject();
			ArrayList list =(ArrayList)in.readObject();
			
			System.out.println(u1);
			System.out.println(u2);
			System.out.println(list);
			in.close();
		} catch (Exception e) { e.printStackTrace(); }
	}
}