// NetworkEx5
import java.io.*;
import java.net.*;

public class Ex15_5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		URL url = null;
		InputStream in = null;
		FileOutputStream out = null;				
		String address = "http://www.javachobo.com/book/src/flashjava2_src.zip";
		int ch = 0;
		
		try {
			url = new URL(address);
			in = url.openStream();
			out = new FileOutputStream("flashjava2_src.zip");
			
			while((ch=in.read())!=-1) {
				out.write(ch);
			}
			in.close();
			out.close();
		} catch (Exception e) { e.printStackTrace(); }
	}
}