// FileEx4
import java.io.*;
import java.text.*;
import java.util.*;

public class Ex14_30 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String currDir = System.getProperty("user.dir");
		File dir = new File(currDir);
		
		File[] files = dir.listFiles();
		
		for(int i=0; i <files.length; i++) {
			File f = files[i];
			String name = f.getName();
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String attribute = "";
			String size = "";
			
			if(files[i].isDirectory()) {
				attribute = "DIR";
			} else {
				size = f.length() + "";
				attribute = f.canRead() ? "R" : " ";
				attribute += f.canWrite() ? "W" : " ";
				attribute += f.isHidden() ? "H" : " ";
			}
			
			System.out.printf("%s %3s %6s %s\n", df.format(new Date(f.lastModified())), attribute,size,name);
		}
	}
}