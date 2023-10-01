// TcpIpMulitichatServer
import java.io.*;
import java.net.*;
import java.rmi.server.ServerRef;
import java.text.*;
import java.util.*;

public class Ex15_13 {
	HashMap clients;
	
	Ex15_13() {
		clients = new HashMap();
		Collections.synchronizedMap(clients);
	}
	
	private void start() {
		// TODO Auto-generated method stub
		ServerSocket serversocket = null;
		Socket socket = null;
		
		try {
			serversocket = new ServerSocket(7777);
			System.out.println("서버가 시작되었습니다.");
			
			while(true) {
				socket = serversocket.accept();
				System.out.println("["+socket.getInetAddress() + ":"+socket.getPort() + "]"+"에서 접속하였습니다.");
				ServerReceiver thread = new ServerReceiver(socket);
				thread.start();
			}
		} catch (Exception e) { e.printStackTrace(); }
	}
	
	void sendToAll(String msg) {
		Iterator it = clients.keySet().iterator();
		
		while(it.hasNext()) {
			try {
				DataOutputStream out = (DataOutputStream)clients.get(it.next());
				out.writeUTF(msg);
			} catch (IOException e) {}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		new Ex15_13().start();
	}
	
	class ServerReceiver extends Thread {
		Socket socket;
		DataInputStream in;
		DataOutputStream out;
		
		ServerReceiver(Socket socket){
			this.socket = socket;
			try {
				in = new DataInputStream(socket.getInputStream());
				out = new DataOutputStream(socket.getOutputStream());
			} catch (IOException e) {}
		}
		
		public void run() {
			String name = "";
			try {
				name = in.readUTF();
				sendToAll("#"+name+"님이 들어오셨습니다.");
				
				clients.put(name, out);
				System.out.println("현재 서버접속자 수는 " + clients.size() + "입니다.");
				
				while(in!=null) {
					sendToAll(in.readUTF());
				}
			} catch (IOException e) {}
			  finally {
				  sendToAll("#"+name+"님이 나가셨습니다.");
				  clients.remove(name);
				  System.out.println("["+socket.getInetAddress()+":"+socket.getPort()+"]"+"에서 접속을 종료하였습니다.");
				  System.out.println("현재 서버접속자 수는 " + clients.size() +"입니다. ");
			  }
		}
	}
}