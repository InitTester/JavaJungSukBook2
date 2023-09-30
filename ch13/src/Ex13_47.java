// AppletEx1
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Ex13_47 extends java.applet.Applet {
	TextArea ta = new TextArea();
	Button clear = new Button("clear");
	
	public Ex13_47() {
		setLayout(new BorderLayout());
		add(ta,"Center");
		add(clear,"South");
		clear.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ta.setText("");
			}
		});
		write("constructor\n");
	}
	
	@Override
	public void init() {
		// TODO Auto-generated method stub
//		super.init();
		write("init()\n");
	}
	
	@Override
	public void start() {
		// TODO Auto-generated method stub
//		super.start();
		write("start()\n");
	}
	
	@Override
	public void stop() {
		// TODO Auto-generated method stub
//		super.stop();
		write("stop()\n");
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
//		super.destroy();
		write("destroy()\n");
	}

	public void paint(Graphics g) {
		write("paint()\n");
	}	

	private void write(String str) {
		// TODO Auto-generated method stub
		ta.append(str);
		System.out.print(str);
	}
	
	public static void main(String[] args) {
		
	}		
}