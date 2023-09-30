// GraphicsEx3
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Ex13_43 extends Frame implements MouseMotionListener {
	int x = 0;
	int y = 0;
	
	public static void main(String[] args) {
		new Ex13_43("GraphicsEx3");
	}
	
	public Ex13_43(String title) {
		super(title);
		addMouseMotionListener(this);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
//				super.windowClosing(e);
				System.exit(0);
			}
		});
		
		//Frame을 (100,100)의 위치에 width 500, height 500 크기로 보이게한다.
		setBounds(100,100,500,500);
		setVisible(true);
	}
	
	public void paint(Graphics g) {
		g.drawString("마우스를 움직여보세요.", 10, 50);
		g.drawString("*", x, y);
	}
	
	public void update(Graphics g) {
		paint(g);
	}
	
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		x = e.getX();
		y = e.getY();
		repaint();
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub		
	}
}