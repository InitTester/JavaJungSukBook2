// FrameTest3
import java.awt.*;
import java.awt.event.*;		// 이벤트처리를 위해서 추가해야한다.
import java.beans.EventHandler;

public class Ex13_28 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("Login");		// Frame객체를 생성한다.
		f.setSize(300,200);					// Frame의 크기를 설정한다.
		
		// EventHandler클래스의 객체를 생성해서 Frame의 WindowListener로 등록한다.
		f.addWindowListener(new EventHandler());
		f.setVisible(true);
	}
}

class EventHandler implements WindowListener {
	public void windowOpened(WindowEvent e) {}
	public void windowClosing(WindowEvent e) {	// Frame의 닫기 버튼을 눌렀을 때 호출한다.
		e.getWindow().setVisible(false);		// Frame을 화면에서 보이지 않도록 하고
		e.getWindow().dispose();				// 메모리에서 제거한다.
		System.exit(0);							// 프로그램을 종료한다.
	}

	public void windowClosed(WindowEvent e) {}	// 아무내용없는 메서드 구형
	public void windowIconified(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowActivated(WindowEvent e) {}
	public void windowDeactivated(WindowEvent e) {}
}