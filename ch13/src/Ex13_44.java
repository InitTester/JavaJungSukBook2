// GraphicsEx5
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Ex13_44 extends Frame implements MouseMotionListener {
	int x = 0;
	int y = 0;
	
	Image img = null;
	Graphics gImg = null;
	
	public static void main(String[] args) {
		new Ex13_44("GraphicsEx5");
	}
	
	public Ex13_44(String title) {
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
		
		img = createImage(500,500);
		gImg = img.getGraphics();
		gImg.drawString("왼쪽버튼을 누른 채로 마우스를 움직여보세요.", 10, 50);
		repaint();
	}
	
	public void paint(Graphics g) {
		if(img!=null)
			g.drawImage(img, 0, 0, this);
	}	
	
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		x = e.getX();
		y = e.getY();
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub		
		if(e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK) return; 
		
		gImg.drawLine(x,y,e.getX(),e.getY());
		x = e.getX();
		y = e.getY();
		
		repaint();	
	}
}