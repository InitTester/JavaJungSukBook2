// TcpIpServer5
import java.io.*;
import java.net.*;
import java.text.*;
import java.util.*;

import javax.sound.midi.Receiver;
import javax.xml.crypto.Data;

public class Ex15_11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5개의 쓰레드를 생성하는 서버를 생성한다.
		
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			// 서버소켓을 생성하여 7777번 포트와 결합(bind)시킨다.
			serverSocket = new ServerSocket(7777);
			System.out.println("서버가 준비되었습니다.");
			
			socket = serverSocket.accept();
			Sender sender = new sender(socket);
			Receiver receiver = new Receiver(socket);
			
			sender.start();
			receiver.start();
			
		} catch (Exception e ) { e.printStackTrace();}
	}
}

class Sender extends Thread {
	Socket socket;
	DataOutputStream out;
	String name;
	
	Sender(Socket socket){ 
		this.socket = socket;
		try {
			out = new DataOutputStream(socket.getOutputStream());
			name = "[" + socket.getInetAddress() + ":" + socket.getPort() + "]";
		} catch (Exception e) {}
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
//		super.run();
		Scanner scanner = new Scanner(System.in);
		while(out!=null) {
			try {
				out.writeUTF(name+scanner.nextLine());
			} catch (IOException e) {}
		}
	}
}

class Receiver extends Thread {
	Socket socket;
	DataInputStream in;
	
	Receiver(Socket socket){ 
		this.socket = socket;
		try {
			in = new DataInputStream(socket.getInputStream());
		} catch(IOException e) {}
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
//		super.run();
		while(in!=null) {
			try {
				System.out.println(in.readUTF());
			} catch (IOException e) {}
		}
	}
}