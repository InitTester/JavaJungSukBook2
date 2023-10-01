// TcpIpServer4
import java.io.*;
import java.net.*;
import java.text.*;
import java.util.*;

public class Ex15_10 implements Runnable {
	ServerSocket serverSocket;
	Thread[] threadArr;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5개의 쓰레드를 생성하는 서버를 생성한다.
		Ex15_10 server = new Ex15_10(5);
		server.start();
	}
	
	public Ex15_10(int num) {
		try {
			// 서버소켓을 생성하여 7777번 포트와 결합(bind)시킨다.
			serverSocket = new ServerSocket(7777);
			System.out.println(getTime() + "서버가 준비되었습니다.");
			
			threadArr = new Thread[num];
		} catch (IOException e) { e.printStackTrace(); }
	}
	
	public void start() { 
		for(int i=0; i< threadArr.length; i++) {
			threadArr[i] = new Thread(this);
			threadArr[i].start();
		}
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			try {
				System.out.println(getTime() + "가 연결요청을 기다립니다.");
				
				Socket socket = serverSocket.accept();
				System.out.println(getTime() + socket.getInetAddress() + "로부터 연결요청이 들어왔습니다.");

				// 소켓의 출력스트림을 얻는다.
				OutputStream out = socket.getOutputStream();
				DataOutputStream dos = new DataOutputStream(out);
				
				// 원격 소켓(remote socket)에 데이터를 보낸다.
				dos.writeUTF("[Notice] Test Message1 from Server.");
				System.out.println(getTime() + "데이터를 전송했습니다.");
				
				// 스트림과 소켓을 닫아준다.
				dos.close();
				socket.close();
				
			} catch (IOException e) { e.printStackTrace(); }
		}
	}
	
	// 현재시간을 문자열로 반환하는 함수
	static String getTime() {
		SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
		return f.format(new Date());
	}
}