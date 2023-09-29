// TextFieldTest
import java.awt.*;

public class Ex13_9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("Login");	
		f.setSize(400,80);	
		f.setLayout(new FlowLayout());	// LayoutManager를 FlowLayout으로 한다.
		
		Label lid = new Label("ID :", Label.RIGHT);	// 정렬을 오른쪽으로.
		Label lpwd = new Label("Password :",Label.RIGHT);
		
		TextField id = new TextField(10);	// 약 10개의 글자를 입력할 수 있는 TextField 생성
		TextField pwd = new TextField(10);	
		pwd.setEchoChar('*');		// 입력한 값 대신 '*'가 보이도록 한다.
		
		f.add(lid);
		f.add(id);
		f.add(lpwd);
		f.add(pwd);
		f.setVisible(true);		
	}
}