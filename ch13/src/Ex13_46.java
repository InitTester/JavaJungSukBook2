// HelloApplet
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Ex13_46 extends java.applet.Applet {

	public static void main(String[] args) {
		
	}
	
	public void paint(Graphics g) {
		setBackground(Color.lightGray); // 애플릿의 바탕을 밝은 회색으로 설정
		g.drawString("Hello,Applet.",50,50);
	}		
}