// AppletEx3
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class Ex13_49 extends Applet {
	Image img = null;
	
	@Override
	public void init() {
		// TODO Auto-generated method stub
//		super.init();
		img = getImage(getDocumentBase(),getParameter("imgName"));
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
//		super.paint(g);
		// Image의 크기를 얻는다.
		int imgWidth = img.getWidth(this); // getWidth(ImageObserver obj)
		int imgHeight = img.getHeight(this); // getHeight(ImageObserver obj)
		
		// 이미지를 Frame의 중앙에 출력한다.
		g.drawImage(img, (getWidth()- imgWidth)/2,(getHeight()-imgHeight)/2,this);
	}
	
	public static void main(String[] args) {
		
	}		
}