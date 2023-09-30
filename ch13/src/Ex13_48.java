// AppletEx2
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class Ex13_48 extends Applet implements MouseMotionListener {
	int x = 0;
	int y = 0;
	
	Image img = null;
	Graphics gImg = null;
	
	public Ex13_48() {
		addMouseMotionListener(this);
	}
	
	@Override
	public void init() {
		// TODO Auto-generated method stub
//		super.init();
		img = createImage(500,500);
		gImg = img.getGraphics();
		gImg.drawString(getParameter("text"), 10, 50);
		gImg.drawString("value1:" + getParameter("value1"),10,65);
		gImg.drawString("value2:" + getParameter("value2"),10,80);
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
		if(e.getModifiersEx() != MouseEvent.BUTTON1_DOWN_MASK) return;
		
		gImg.drawLine(x, y, e.getX(), e.getY());
		x = e.getX();
		y = e.getY();
		
		repaint();
	}
	
	public static void main(String[] args) {
		
	}		
}