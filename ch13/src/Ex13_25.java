// GridLayoutTest
import java.awt.*;
import java.awt.event.*;		// 이벤트처리를 위해서 추가해야한다.

public class Ex13_25 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("GridLayoutTest");
		f.setSize(150,150);
		f.setLayout(new GridLayout(3,2));	// 3행 2열의 테이블을 만든다.
		f.add(new Button("1"));				// 추가되는 순서대로 Button에 번호를 붙였다.
		f.add(new Button("2"));
		f.add(new Button("3"));
		f.add(new Button("4"));
		f.add(new Button("5"));
		f.add(new Button("6"));

		f.setVisible(true);		
	}
}