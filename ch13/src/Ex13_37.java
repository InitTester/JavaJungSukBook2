// ChatWin
import java.awt.*;
import java.awt.event.*;
import java.io.*;

import org.xml.sax.HandlerBase;

public class Ex13_37 extends Frame {
	String nickname = "";
	
	TextArea ta = new TextArea();
	
	Panel p = new Panel();
	TextField tf = new TextField();
	
	Ex13_37(String nickname){
		super("Chatting");
		this.nickname = nickname;
		
		setBounds(100,100,300,200);
		
		p.setLayout(new BorderLayout());
		p.add(tf, "Center");
		
		add(ta,"Center");
		add(p,"South");
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
//				super.windowClosing(e);
				System.exit(0);
			}			
		});
		
		EventHandler handler = new EventHandler();
		ta.addFocusListener(handler);
		tf.addFocusListener(handler);
		tf.addActionListener(handler);
		
		ta.setText("#" + nickname + "님 즐거운 채팅되세요.");
		ta.setEditable(false);
		
		setVisible(true);
		tf.requestFocus();
	}
	
	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("USAGE : java ChatWin NICKNAME");
			System.exit(0);
		}
		
		new Ex13_37(args[0]);
	}
	
	class EventHandler extends FocusAdapter implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String msg = tf.getText();
			if("".equals(msg)) return;
			
			ta.append("\r\n" + nickname + ">" + msg);
			tf.setText("");
		}
		
		@Override
		public void focusGained(FocusEvent e) {
			// TODO Auto-generated method stub
//			super.focusGained(e);
			tf.requestFocus();
		}
	}
}
