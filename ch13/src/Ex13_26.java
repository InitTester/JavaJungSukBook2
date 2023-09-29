// CardLayoutTest
import java.awt.*;
import java.awt.event.*;		// 이벤트처리를 위해서 추가해야한다.

public class Ex13_26 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Frame f = new Frame("CardLayoutTest");
		final CardLayout card = new CardLayout(10,10);
		f.setLayout(card);
		
		Panel card1 = new Panel();
		card1.setBackground(Color.lightGray);
		card1.add(new Label("Card 1"));
		
		Panel card2 = new Panel();
		card2.setBackground(Color.orange);
		card2.add(new Label("Card 2"));
		
		Panel card3 = new Panel();
		card3.setBackground(Color.cyan);
		card3.add(new Label("Card 3"));
		
		f.add(card1,"1");
		f.add(card2,"2");
		f.add(card3,"3");
		
		class Handler extends MouseAdapter {
			public void mouseClicked(MouseEvent e) {
				// 마우스 오른쪽 버튼을 눌렀을때
				if(e.getModifiers() == e.BUTTON3_MASK) {
					card.previous(f);		// CardLayout의 이전 Panel을 보여준다.
				} else {
					card.next(f);
				}
			}
		}
		
		card1.addMouseListener(new Handler());
		card2.addMouseListener(new Handler());
		card3.addMouseListener(new Handler());

		f.setSize(200,200);
		f.setLocation(200,200);
		f.setVisible(true);		
		
		card.show(f, "1");
	}
}