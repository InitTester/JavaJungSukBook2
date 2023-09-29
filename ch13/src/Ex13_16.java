// DialogTest2
import java.awt.*;
import java.awt.event.*;		// 이벤트처리를 위해서 추가해야한다.

public class Ex13_16 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("Parent");	
		f.setSize(300,200);
		
		// parent Frame을 f로 하고, modal을 true로 해서 필수응답 Dialog로 함.
		Dialog info = new Dialog(f, "Information",true);
		info.setSize(140,90);
		info.setLocation(50,50);		// parent Frame이 아닌, 화면기준의 위치
		info.setLayout(new FlowLayout());
		
		Label msg = new Label("This is modal Dialog", Label.CENTER);
		Button ok = new Button("OK");
		
		ok.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {	// ok버튼을 누루면 실행됨
				// TODO Auto-generated method stub
//				info.setVisible(false);	// Dialog를 안보이게 한다.
				info.dispose();			// Dialog를 메모리에서 없앤다.
			}
		});
		
		info.add(msg);
		info.add(ok);		
		f.setVisible(true);
		info.setVisible(true);		// Dialog를 화면에 보이게 한다.
	}
}