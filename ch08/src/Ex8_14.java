import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Date;

public class Ex8_14 {
	// ExceptionEx14
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrintStream ps = null;
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("error.log",true);	// error.log파일에 출력할 준비를 한다			
			ps = new PrintStream(fos); // 에러 로그 생성
			System.setErr(ps);
			
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(0/0);	// 예외발생
			System.out.println(4);		// 실행되지 않는다.
		} catch (Exception ae) {	
			System.err.println("-----------------------------------------------"); //  private static native void setErr0(PrintStream err);
			System.err.println("예외발생시간 : " + new Date());	// 현재시간출력
			ae.printStackTrace(System.err);	
			System.err.println("예외메시지 : " + ae.getMessage());	
			System.err.println("-----------------------------------------------");
		}
		System.out.println(6);
	}
}