// PanelTest
import java.awt.*;

public class Ex13_13 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("Panel");	
		f.setSize(300,200);
		f.setLayout(null);		// Frame의 Layout Manager설정을 해제한다.
		
		Panel p = new Panel();
		p.setBackground(Color.green); 	//Panel의 배경을 녹색으로한다.
		p.setSize(100,100);
		p.setLocation(50,50);
		
		Button ok = new Button("OK");
		
		p.add(ok);		// Button을 Panel에 포함
        f.add(p);		// Panel를 Frame에 포함
        f.setVisible(true);
	}
}