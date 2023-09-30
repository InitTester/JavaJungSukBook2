// GraphicsEx6
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Ex13_45 extends Frame {
	Image img = null;
	
	public static void main(String[] args) {
		new Ex13_45("GraphicsEx6");
	}
	
	public Ex13_45(String title) {
		super(title);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
//				super.windowClosing(e);
				System.exit(0);
			}
		});
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		img = tk.getImage("ironman2.jpg");
		
		setBounds(100,100,400,300);
		setVisible(true);
	}
	
	public void paint(Graphics g) {
		if(img==null) return;
		
		// Image의 크기를 얻는다.
		int imgWidth = img.getWidth(this);	// getWidth(ImageObserver obj)
		int imgHeight = img.getHeight(this); // getHeight(ImageObserver obj)
		
		// 이미지를 Frame의 중앙에 출력한다.
		g.drawImage(img, (getWidth() - imgWidth)/2,(getHeight()-imgHeight)/2,this);
			g.drawImage(img, 0, 0, this);
	}		
}