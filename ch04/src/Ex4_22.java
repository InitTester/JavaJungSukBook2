public class Ex4_22 {
	//FlowEx22
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 2;
		while(i <= 9) {
			int j =1;
			System.out.println("["+ i +"]단");
			while(j <=9) {
				System.out.println(i + " * " + j + " = " + i*j);
				j++;
			}
			System.out.println();
			i++;
		}
	}
}