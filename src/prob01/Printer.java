package prob01;

public class Printer{

	public void println(int i) {
		// TODO Auto-generated method stub
		System.out.println(i);
	}
	
	public void println(Boolean i) {
		// TODO Auto-generated method stub
		System.out.println(i);
	}
	
	public void println(double i) {
		// TODO Auto-generated method stub
		System.out.println(i);
	}
	
	public void println(String  i) {
		// TODO Auto-generated method stub
		System.out.println(i);
	}
	
	public void println(int num, boolean tf, double dnum, String name) {
		System.out.println("최종 : " + num + " : " + tf +" : " + dnum
				+" : "+  name);
	}
	
	public int sum(int a,int b,int c ) {
		int num = 0;
		
		num = a + b + c;
		
		return num;
	}

	public int sum(int i, int j, int k, int l, int m) {
		// TODO Auto-generated method stub
		int num = 0;
		
		num = i + j + k + l + m;
		return num;
	}
	

	

	
}
