// MouseEventTest
import java.awt.*;
import java.awt.event.*;		// 이벤트처리를 위해서 추가해야한다.
import java.beans.EventHandler;

import javax.swing.colorchooser.AbstractColorChooserPanel;

public class Ex13_30 extends Frame {
	Label location;
	
	Ex13_30(String title){
		super(title);		// Frame(String title)을 호출한다.
		location = new Label("Mouse Pointer Location : ");
		location.setSize(195,15);
		location.setLocation(50,60);
		location.setBackground(Color.yellow);	// Label의 배경색을 노란색으로 한다.
		add(location);
		
		// EventHandler의 인스턴스를 Frame의 Listener로 등록한다.
		addMouseMotionListener(new EventHandler());
		
		setSize(300,200);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		Ex13_30 mainWin = new Ex13_30("MouseEventTest");
	}
	
	class EventHandler implements MouseMotionListener {
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			location.setText("Mouse Pointer Location : (" + e.getX() + ", " + e.getY() + ")");
		}
	}
}