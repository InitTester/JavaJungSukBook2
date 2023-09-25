public class Ex9_18 {
	// StringCount
	private int count;
	private String source = "";
	
	public Ex9_18 (String source) {
		this.source = source;
	}
	
	public int Ex9_18(String s) {
		return Ex9_18(s,0);
	}
	
	public int Ex9_18(String s, int pos) {
		int index = 0;
		if(s==null || s.length() ==0)
			return 0;
		if((index = source.indexOf(s,pos))!= -1) {
			count++;
			Ex9_18(s,index +s.length());
		}
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aabbccAABBCCaa";
		System.out.println(str);
		Ex9_18 e9 = new Ex9_18(str);
		System.out.println("aa를 " + e9.Ex9_18("aa") + "개 찾았습니다.");
	}
}  