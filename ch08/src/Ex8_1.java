public class Ex8_1 {
	// ExceptionEx1
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			try { } catch(Exception e) { }
		} catch(Exception e) {
			try { } catch(Exception e) { }	// 컴파일 에러 발생
		}
		
		try { } catch (Exception e) {}
	}
}