// DataInputStreamEx2
import java.io.*;
import java.util.Arrays;

public class Ex14_12 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int score = 0;

		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			fis = new FileInputStream("score.dat");
			dis = new DataInputStream(fis);
			
			while(true) {
				score = dis.readInt();
				System.out.println(score);
				sum += score;
			}
		} catch (EOFException e) {	// readInt에서 더이상 일긍ㄹ 데이터가 없을때 발생 EOF
			System.out.println("점수의 총합은 " + sum + "입니다.");
		} catch (IOException ie) {
			ie.printStackTrace();
		} finally { // 작업이후 스트림을 닫아야하는데 무한반복이라서 finally에서 닫도록 처리
			try {
				if(dis!= null) 
					dis.close();
				} catch (IOException ie) {
					ie.printStackTrace();
			}
		}
	}
}