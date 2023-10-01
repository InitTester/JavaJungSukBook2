// UserInfo2
import java.io.*;
import java.text.*;
import java.util.*;

class SuperUserInfo{
	String name;
	String password;
	
	SuperUserInfo() {
		this("Unknown","1111");
	}
	
	SuperUserInfo(String name, String password) {
		this.name = name;
		this.password = password;
	}
}

public class Ex14_41 extends SuperUserInfo implements java.io.Serializable {	
	int age;
	
	public Ex14_41() {
		this("Unknown","1111",0);
	}
	
	public Ex14_41(String name, String password, int age) {
		super(name,password);
		this.age = age;
	}
	
	public String toString() {
		return "(" +name + "," + password + "," + age + ")";
	}

	private void writeObject(ObjectOutputStream out) throws IOException {
		out.writeUTF(name);
		out.writeUTF(password);
		out.defaultWriteObject();
	}
	
	private void readObject(ObjectInputStream in) throws IOException,ClassNotFoundException {
		name = in.readUTF();
		password = in.readUTF();
		in.defaultReadObject();
	}
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//	}
}