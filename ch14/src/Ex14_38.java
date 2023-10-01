// UserInfo
import java.io.*;
import java.text.*;
import java.util.*;

public class Ex14_38 implements java.io.Serializable {	
	String name;
	String password;
	int age;
	
	public Ex14_38() {
		this("Unknown","1111",0);
	}
	
	public Ex14_38(String name, String password, int age) {
		this.name = name;
		this.password = password;
		this.age = age;
	}
	
	public String toString() {
		return "(" +name + "," + password + "," + age + ")";
	}
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//	}
}