package ch11;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Human human1 = new Human("Jackson", 31);	
		Human human2 = human1.shallowCopy();	
		Human human3 = human1.deepCopy();
		
		System.out.println(human1);	
		System.out.println(human2);	
		System.out.println(human3);	
		
		human1.setName("JAVA");	
		human1.setAge(20);	
		System.out.println("<<<<<<<<<<<<= human의 깊은 복사 변경 후 =>>>>>>>>>>>>>");	
		System.out.println(human1);	
		System.out.println(human2);	
		System.out.println(human3);
	}

}

class Human implements Cloneable {

	String name;
	int age;
	
	public Human() {	
	}
	
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	
	public String toString() {	
		return "Human [name=" + name + ", age=" + age + "]";	
	}
	
	public Human shallowCopy() {	
		Object obj = null;
		try {	
			obj = super.clone();
		
		} catch (CloneNotSupportedException e) {}	
	return (Human) obj;	
	}
​
	public Human deepCopy() {
		Object obj = null;
	
		try {		
		obj = super.clone();
		} catch (CloneNotSupportedException e) {}
	
		Human man = (Human) obj;	
		man = new Human(this.name , this.age);	
		return man;	
	}
}