// SerialEx1
import java.io.*;
import java.text.*;
import java.util.*;

public class Ex14_39 {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String fileName = "Ex14_38.ser";
			FileOutputStream fos = new FileOutputStream(fileName);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			ObjectOutputStream out = new ObjectOutputStream(bos);
			
			Ex14_38 u1 = new Ex14_38("JavaMan","1234",30);
			Ex14_38 u2 = new Ex14_38("JavaWoman","4321",26);
			
			ArrayList list = new ArrayList();
			list.add(u1);
			list.add(u2);
			
			// 객체를 직렬화한다.
			out.writeObject(u1);
			out.writeObject(u2);
			out.writeObject(list);
			out.close();
			System.out.println("직렬화가 잘 끝났습니다.");
		} catch (IOException e) { e.printStackTrace(); }
	}
}