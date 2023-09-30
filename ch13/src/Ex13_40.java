// GraphicsEx1
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Ex13_40 extends Frame {
	public static void main(String[] args) {
		new Ex13_40("GraphicsEx1");
	}
	
	public void paint(Graphics g) {
		g.setFont(new Font("serif", Font.PLAIN,15));
		g.drawString("Graphics를 이용해서 그림을 그립니다.",10,50);
		
		g.drawOval(50, 100, 50, 50);
		g.setColor(Color.blue);
		g.fillOval(100, 100, 50, 50);
		
		g.setColor(Color.red);
		g.drawLine(100, 100, 150, 150);
		
		g.fillRoundRect(200, 100, 120, 80, 30, 30);
		g.setColor(Color.orange);
		g.fillPolygon(new int[] { 50, 100, 150, 200},new int[] { 250, 200, 200, 250}, 4);
		g.setColor(Color.cyan);
		g.fillArc(250, 200, 100, 100, 0, 120);
	}
	
	public Ex13_40(String title) {
		super(title);
		addWindowListener( new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
//				super.windowClosing(e);
				System.exit(0);
			}
		});
		
		//Frame을 (100,100)의 위치에 width 400, height 300 크기로 보이게한다.
		setBounds(100,100,400,300);
		setVisible(true);
	}
}
