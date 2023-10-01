// UdpServer
import java.io.*;
import java.net.*;
import java.rmi.server.ServerRef;
import java.text.*;
import java.util.*;

public class Ex15_16 {
	public void start() throws IOException {
		// 포트 7777번을 사용하는 소켓을 생성한다.		
		DatagramSocket socket = new DatagramSocket(7777);
		DatagramPacket inPacket,outPacket;
		
		byte[] inMsg = new byte[10];
		byte[] outMsg;
		
		while(true) {
			//데이터를 수신하기 위한 패킷을 생성한다.
			inPacket = new DatagramPacket(inMsg, inMsg.length);
			
			// 패킷을 통해 데이터를 수신(receive)한다.
			socket.receive(inPacket);
			
			// 수신한 패킷으로부터 client의 ip주소와 port를 얻는다.
			InetAddress address = inPacket.getAddress();
			int port = inPacket.getPort();
			
			// 서버의 현재 시간을 시분초 형태([hh:mm:ss])로 반환
			SimpleDateFormat sdf = new SimpleDateFormat("[hh:mm:ss]");
			String time = sdf.format(new Date());
			outMsg = time.getBytes();
			
			// 패킷을 생성해서 client에게 전송
			outPacket = new DatagramPacket(outMsg, outMsg.length,address,port);
			socket.send(outPacket);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		try {
			new Ex15_16().start();
		} catch(Exception e) { e.printStackTrace();}
	}
}