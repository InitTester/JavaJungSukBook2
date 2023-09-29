// BorderLayoutTest
import java.awt.*;
import java.awt.event.*;		// 이벤트처리를 위해서 추가해야한다.

public class Ex13_23 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("BorderLayoutTest");
		f.setSize(200,200);

		//Frame은 기본적으로 BorderLayout로 설정되어 있으므로 따로 설정하지 않아도 됨
		f.setLayout(new BorderLayout());
		Button north = new Button("North");
		Button south = new Button("South");
		Button east = new Button("East");
		Button west = new Button("West");
		Button center = new Button("Center");
		
		//Frame의 5개의 각 영역에 Button을 하나씩 추가한다.
		f.add(north,"North");
		f.add(south,"South");
		f.add(east,"East");
		f.add(west,"West");
		f.add(center,"Center");

		f.setVisible(true);		
	}
}