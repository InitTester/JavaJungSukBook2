// StringReaderWriterEx
import java.io.*;

public class Ex14_18 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputData = "ABCD";
		StringReader input = new StringReader(inputData);
		StringWriter output = new StringWriter();
		
		int data = 0;
		
		try {
		while((data = input.read())!=-1) {
			output.write(data);	// void write(int b)
			}
		} catch (IOException e) {}
		
		System.out.println("Input data : " + inputData);
		System.out.println("Output data : " + output.toString());
//		System.out.println("Output data : " + output.getBuffer().toString());
		// getBuffer() : StringWriter에 출력한 데이터가 저장된 StringBuffer를 반환
		// toString() : StringWriter에 출력된 (StringBuffer에 저장된) 문자열을 반환 
	}
}
