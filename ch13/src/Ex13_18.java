// FontList
import java.awt.*;
import java.awt.event.*;		// 이벤트처리를 위해서 추가해야한다.

public class Ex13_18 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraphicsEnvironment ge = null;
		ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		Font[] fonts = ge.getAllFonts();
		
		for(int i=0; i< fonts.length; i++) {
			System.out.println(fonts[i].getFontName());
		}
	}
}