import java.util.Arrays;

public class TEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	int sum = 0, i =0,j = 1;
//		
//		for(int i =1; i <=20; i++) {
//			if(!(i%2 ==0) && !(i%3 ==0)) {
//				sum += i;
//				System.out.println("i= "+i);
//			}			
//		}
//		System.out.println(sum);
//		int i =1,sum =0;
//		int totalsum = 0;
//		while(i<=10) {
//			sum += i++;
//			totalsum += sum;
//			System.out.println("i =" + i+ ", sum ="+sum +", totalsum = "+totalsum);
//		}
//
//		System.out.println("totalsum = "+totalsum);
//
//		System.out.println(sum);
		
//		int sum = 0,j =1,i=0;
//		while(sum <100) {
//			j = -j;
//			sum += i*j;
//			System.out.println("i= "+i+", j="+j+", sum= "+sum);
//			
//			++i;
//		}		
//		i = i-1;		
		//System.out.println("sum= "+sum+", i = "+i);
//		
//		int num1 =1;
//		int num2 = 1;
//		int num3 = 0;
//		System.out.print(num1+","+num2);
//		System.out.println();
//		for(int i=0; i <8; i++)
//		{
//			System.out.println("num1= "+num1+", num2="+num2);
//			System.out.println();
//			
//			num3 = num1 +num2;
//			System.out.print(","+num3);
//			System.out.println();
//			num1 = num2;
//			num2 = num3;
//			
//			
//		}
		
//		int i =2;		
//		while(i<=9) {
//			int j =1;
//			while(j<=9) {
//				if(j < 4) {
//					System.out.println(i +"*"+j+"=" + i*j); 
//				}
//				j++;
//			}
//			i++;
//			System.out.println();
//		}
		
//		for(int i =2; i<=9; i ++) {
//			for(int j =1; j<=3; j++) // 열 
//				System.out.print(i +"*" );
//				
//				//if(i<i+3)
//					//System.out.print(i + "*" + j +"=" + i*j+"\t");
//				//System.out.print(i + "*" + (j-1) +"=" + i*j+"\t");
//			
//			
//
//			System.out.println();
//		}
//
		for(int i =1; i<=9; i ++) {
			for(int j =1; j<=3; j++) {
				
				int x = j+1 + (i-1) / 3*3;
				System.out.print("X= "+x+"   ->");
				System.out.print("(i-1) / 3*3 ["+(i-1) / 3*3 + "] ");
				
				int y = i%3==0? 3: i%3;
				
				//System.out.println("x ="+ x +", y =" +y );
				
				if(x>9)
					break;
				
				System.out.print(x+"*"+y+"="+x*y+"\t"); //println이 아님에 주의
			}
			System.out.println();
			if(i%3==0) System.out.println(); //
			}
		
//		String str = "12345";
//		int sum = 0;
//		
//		for(int i=0; i < str.length(); i++)
//		{
//			sum += str.charAt(i)- '0';
//		}
//		System.out.println("sum=" + sum);
//		
	}
}