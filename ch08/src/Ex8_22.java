import java.io.File;

public class Ex8_22 {
	// ExceptionEx22
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File f = createFile(args[0]);
			System.out.println(f.getName() + " 파일이 성공적으로 생성되었습니다.");				
		} catch (Exception e) {
			System.out.println(e.getMessage() + " 다시 입력해 주시기 바랍니다.");				
		}
	}
	
	static File createFile(String fileName) throws Exception {
		if (fileName == null || fileName.equals(""))
			throw new Exception("파일이름이 유효하지 않습니다.");	
		File f = new File(fileName);	// File 클래스의 객체를 만든다.
		// File객체의 createNewFile메서드를 이용해서 실제 파일을 생성한다.
		f.createNewFile();
		return f;			// 생성된 객체의 참조를 반환한다.
	}
	
	static void createNewFile(File f) {
		try {
			f.createNewFile();	//파일을 생성한다.			
		} catch (Exception e) { } 		
	}	// createNewFile 메서드의 끝
}