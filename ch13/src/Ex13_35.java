// TextEditor
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Ex13_35 extends Frame {
	String fileName;
	TextArea content;
	MenuBar mb;
	Menu mFile;
	MenuItem miNew, miOpen, miSaveAs, miExit;
	
	Ex13_35(String title){
		super(title);		// 조상인 Frame의 생성자 Frame(String title)을 호출한다.
		content = new TextArea();
		add(content);
		
		mb = new MenuBar();
		mFile = new Menu("File");
		miNew = new Menu("New");
		miOpen = new Menu("Open");
		miSaveAs = new Menu("SaveAs...");
		miExit = new Menu("Exit");
		
		mFile.add(miNew);
		mFile.add(miOpen);
		mFile.add(miSaveAs);
		mFile.addSeparator();	// 메뉴 분리선 (separator)을 넣는다.
		mFile.add(miExit);
		
		mb.add(mFile);			// MenuBar에 Menu를 추가한다.
		setMenuBar(mb);			// Frame에 MenuBar를 포함시킨다.
		
		// 메뉴에 이벤트 핸들러를 등록한다.
		MyHandler handler = new MyHandler();
		miNew.addActionListener(handler);
		miOpen.addActionListener(handler);
		miSaveAs.addActionListener(handler);
		miExit.addActionListener(handler);
		
		setSize(300,200);
		setVisible(true);		
	}
	
	// 선택된 파일의 내용을 읽어서 TextArea에 보여주는 메서드
	void fileOpen(String fileName) {
		FileReader fr;
		BufferedReader br;
		StringWriter sw;
		
		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			sw = new StringWriter();
			
			int ch = 0;
			while((ch=br.read())!=-1) {
				sw.write(ch);
			}
			
			br.close();
			content.setText(sw.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	void saveAs(String fileName) {
		FileWriter fw;
		BufferedWriter bw;
		
		try {
			fw = new FileWriter(fileName);
			bw = new BufferedWriter(fw);
			bw.write(content.getText());	// TextArea의 내용을 파일에 저장한다.
			bw.close();
			
		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Ex13_35 mainWin = new Ex13_35("CardLayoutTest");
	}	
	
	class MyHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String command = e.getActionCommand();
			
			if(command.equals("New")) {
				content.setText("");
			} else if(command.equals("Open")) {
				FileDialog fileOpen = new FileDialog(Ex13_35.this,"파일열기");
				fileOpen.setVisible(true);
				fileName = fileOpen.getDirectory() + fileOpen.getFile();
				System.out.println(fileName);
				// 선택된 파일의 내용을 TextArea에 보여준다.
				fileOpen(fileName);
			} else if(command.equals("Save As...")) {
				FileDialog fileSave = new FileDialog(Ex13_35.this,"파일저장",FileDialog.SAVE);
				fileSave.setVisible(true);
				fileName = fileSave.getDirectory() + fileSave.getFile();
				System.out.println(fileName);
				// 현재 TextArea의 내용을 선택된 파일에 저장한다.
				saveAs(fileName);
			} else if(command.equals("Exit")) {
				System.exit(0);		// 프로그램을 종료
			}
		}
	}
}