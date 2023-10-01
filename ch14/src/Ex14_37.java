// FileMerge
import java.io.*;
import java.text.*;
import java.util.*;

public class Ex14_37 {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 1) {
			System.out.println("USAGE : java Ex14_33 filename");
			System.exit(0);
		}
		
		String mergeFilename = args[0];
		
		try {
				File tempFile = File.createTempFile("~mergetemp",".tmp");
				tempFile.deleteOnExit();
				
				FileOutputStream fos = new FileOutputStream(tempFile);
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				
				FileInputStream fis = null;
				BufferedInputStream bis = null;
				
				int number = 1;
				
				File f = new File(mergeFilename + "_." + number);
				
				while(f.exists()) {
					f.setReadOnly();		// 작업중에 파일의 내용이 변경되지 않도록한다.
					bis = new BufferedInputStream(new FileInputStream(f));
					
					int data = 0;
					while((data =bis.read())!=-1) {
						bos.write(data);
					}
					
					bis.close();
					
					f = new File(mergeFilename + "_." + ++number);
				}
				bos.close();
				
				File oldFile = new File(mergeFilename);
				if(oldFile.exists()) oldFile.delete();
				tempFile.renameTo(oldFile);
			} catch (IOException e) { }
	}
}