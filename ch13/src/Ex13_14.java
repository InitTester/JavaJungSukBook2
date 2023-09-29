// ScrollPaneTest
import java.awt.*;

public class Ex13_14 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("ScrollPaneTest");	
		f.setSize(300,200);
		
		ScrollPane sp = new ScrollPane();
		Panel p = new Panel();
		p.setBackground(Color.green); 	//Panel의 배경을 녹색으로한다.
		p.add(new Button("첫번째"));
		p.add(new Button("두번째"));
		p.add(new Button("세번째"));
		p.add(new Button("네번째"));
		
		sp.add(p);		// Panel을 ScrollPane에 포함
		f.add(p);		// ScrollPane를 Frame에 포함
        f.setVisible(true);
	}
}