// PopupMenuTest
import java.awt.*;
import java.awt.event.*;		// 이벤트처리를 위해서 추가해야한다.

public class Ex13_22 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("PopupMenu Test");
		f.setSize(300,200);
		
		final PopupMenu pMenu = new PopupMenu("Edit");
		MenuItem miCut = new MenuItem("Cut");
		MenuItem miCopy = new MenuItem("Copy");
		MenuItem miPaste = new MenuItem("Paste");
		pMenu.add(miCut);			// PopupMenu에 MenuItem들을 추가한다.
		pMenu.add(miCopy);
		pMenu.add(miPaste);
		
		f.add(pMenu);		//PopupMenu를 Frame에 추가한다.
		f.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				if(e.getModifiers() == e.BUTTON3_MASK)
					pMenu.show(f, e.getX(),e.getY());
			}
		});
		f.setVisible(true);		
	}
}