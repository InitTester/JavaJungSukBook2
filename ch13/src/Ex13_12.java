// CanvasTest
import java.awt.*;

public class Ex13_12 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("CanvasTest");	
		f.setSize(300,200);
		f.setLayout(null);		// Frame의 Layout Manager설정을 해제한다.
		
		Canvas c = new Canvas();
		c.setBackground(Color.pink);	// Canvas의 배경을 분홍색으로 한다.
		c.setBounds(50,50,150,100);
		
		
        f.add(c);		// Canvas를 Frame에 포함
        f.setVisible(true);
	}
}