// FileEx8
import java.io.*;
import java.text.*;
import java.util.*;

public class Ex14_34 {	
	static int deletedFiles = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length!=1) {
			System.out.println("USAGE : java Ex14_33 Extension");
			System.exit(0);
		}
		
		String currDir = System.getProperty("user.dir")+"\\src";
		
		File dir = new File(currDir);
		String ext = "." + args[0];
		
		delete(dir,ext);
		System.out.println(deletedFiles + "개의 파일이 삭제되었습니다.");
		
	}
	
	public static void delete(File dir, String ext) {
		File[] files = dir.listFiles();
		
		for(int i=0; i<files.length; i++) {
			if(files[i].isDirectory()) {
				delete(files[i],ext);
			} else {
				String filename = files[i].getAbsolutePath();
				
				if(filename.endsWith(ext)) {
					System.out.print(filename);
					if(files[i].delete()) {
						System.out.println(" - 삭제 성공");
						deletedFiles++;
					} else {
						System.out.println(" - 삭제 실패");
					}
				}
			}
		}
	}
}