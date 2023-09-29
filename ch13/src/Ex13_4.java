// ButtonTest2
import java.awt.*;

public class Ex13_4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("Login");	
		f.setSize(300,200);	
		f.setLayout(null);		// 레이아웃 매니저의 설정을 해제한다.
		
		Button b = new Button("확 인");	
		b.setSize(100,50);				// Button의 크기를 설정한다.
		b.setLocation(100,75);			// Frame내에서의 Button의 위치를 설정한다.
		
		f.add(b);
		f.setVisible(true);		
	}
}