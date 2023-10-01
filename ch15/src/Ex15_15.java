// UdpClient
import java.io.*;
import java.net.*;
import java.rmi.server.ServerRef;
import java.text.*;
import java.util.*;

public class Ex15_15 {
	public void start() throws IOException, UnknownHostException {
		DatagramSocket datagramSocket = new DatagramSocket();
		InetAddress serverAddress = InetAddress.getByName("127.0.0.1");
		
		// 데이터가 저장될 공간으로 byte 배열을 생성한다.
		byte[] msg = new byte[100];
		
		DatagramPacket outPacket = new DatagramPacket(msg, 1,serverAddress,7777);
		DatagramPacket inPacket = new DatagramPacket(msg, msg.length);
		
		datagramSocket.send(outPacket);	//전송
		datagramSocket.receive(inPacket);	//수신
		
		System.out.println("current server time :" + new String(inPacket.getData()));
		
		datagramSocket.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		try {
			new Ex15_15().start();
		} catch(Exception e) { e.printStackTrace();}
	}
}