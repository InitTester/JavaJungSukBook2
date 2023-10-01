// FileEx7
import java.io.*;
import java.text.*;
import java.util.*;

public class Ex14_33 {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length!=1) {
			System.out.println("USAGE : java Ex14_33 pattern");
			System.exit(0);
		}
		
		String currDir = System.getProperty("user.dir");
		
		File dir = new File(currDir+"\\src");
		final String pattern = args[0];
		
		//String[] list (FilenameFilter filter)
		String[] files = dir.list(new FilenameFilter() {			
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
//				return false;
				return name.indexOf(pattern) != -1;
			}
		});
		
		for(int i=0; i <files.length; i++) {
			System.out.println(files[i]);
		}
	}
}