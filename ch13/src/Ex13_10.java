// TextAreaTest
import java.awt.*;

public class Ex13_10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("Comments");	
		f.setSize(400,200);	
		f.setLayout(new FlowLayout());	
		
		TextArea comments = new TextArea("하고 싶은 말을 적으세요.",10,50);
		f.add(comments);
		comments.selectAll();// TextArea의 text전체가 선택 되도록 한다.
		f.setVisible(true);		
	}
}