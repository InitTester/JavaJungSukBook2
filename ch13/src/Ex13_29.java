// TextFieldTest2
import java.awt.*;
import java.awt.event.*;		// 이벤트처리를 위해서 추가해야한다.
import java.beans.EventHandler;

public class Ex13_29 extends Frame {
	Label lid;
	Label lpwd;
	TextField tfId;
	TextField tfPwd;
	Button ok;
	
	Ex13_29(String title){
		super(title);		// Frame(String title)을 호출한다.
		
		lid = new Label("ID : ",Label.RIGHT);	// Label의 text정렬을 오른쪽으로.
		lpwd = new Label("Password : ", Label.RIGHT);
		
		// 약 10개의 글자를 입력할 수 있는 TextField 생성.
		tfId = new TextField(10);
		tfPwd = new TextField(10);
		tfPwd.setEchoChar('*');// 입력한 값 대신 '*'이 보이게 한다.
		
		ok = new Button("OK");
		// OK버튼과 TextField에 이벤트처리를 위한 Listener를 추가해준다.
		tfId.addActionListener(new EventHandler());
		tfPwd.addActionListener(new EventHandler());
		ok.addActionListener(new EventHandler());
		
		setLayout(new FlowLayout());  // LayoutManager를 FlowLayout으로
		add(lid);
		add(tfId);
		add(lpwd);
		add(tfPwd);
		add(ok);
		setSize(450,65);
		setVisible(true);	// Frame이 화면에 보이게 한다.
	}
	public static void main(String[] args) {
		Ex13_29 f = new Ex13_29("Login");
	}
	
	class EventHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String id = tfId.getText();	// tfId에 입력되어있는 text를 얻어온다.
			String password = tfPwd.getText();
			if(!id.equals("javachobo")) {
				System.out.println("입력하신 id가 유효하지 않습니다. " + " 다시 입력해 주세요.");
				
				// id를 다시 입력할 수 있도록, focus를 tfId로 옮긴다.
				tfId.requestFocus();
				tfId.selectAll();	//tfId에 입력된 text가 선택되게 한다.	
			} else if (!password.equals("asdf")) {
				System.out.println("입력하신 비밀번호가 틀렸습니다. " + " 다시 입력해 주세요.");
				
				// tfPwd를 다시 입력할수 있도록 포커스 이동
				tfPwd.requestFocus();
				tfPwd.selectAll();
			} else {
				System.out.println( id + "님, 성공적으로 로그인 되었습니다.");
			}
		}
	}
}