// CheckboxEventTest2
import java.awt.*;
import java.awt.event.*;		// 이벤트처리를 위해서 추가해야한다.
import java.beans.EventHandler;

import javax.swing.colorchooser.AbstractColorChooserPanel;

public class Ex13_33 extends Frame {
	CheckboxGroup group;
	Checkbox cb1,cb2,cb3;
	
	Ex13_33(String title){
		super(title);		// Frame(String title)을 호출한다.
		
		group = new CheckboxGroup();
		cb1 = new Checkbox("red",group,true);
		cb2 = new Checkbox("green",group,false);
		cb3 = new Checkbox("blue",group,false);
		
		cb1.addItemListener(new EventHandler());
		cb2.addItemListener(new EventHandler());
		cb3.addItemListener(new EventHandler());
		
		setLayout(new FlowLayout());
		add(cb1);
		add(cb2);
		add(cb3);
		setBackground(Color.red);
		setSize(300,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ex13_33 mainWin = new Ex13_33("CheckboxEventTest2");
	}	
	
	class EventHandler implements ItemListener{
		@Override
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			Checkbox cb = (Checkbox)e.getSource();
			String color = cb.getLabel();
			if(color.equals("red")) {
				setBackground(Color.red);
			} else if (color.equals("green")) {
				setBackground(Color.green);
			} else {
				setBackground(Color.blue);
			}
		}
	}
}