package prob05;

public class MyBase extends Base {
	
	private int num = 0;
	
	public MyBase() {
		super();
	}
	
	public void day() {
		System.out.println("낮에는 열심히 일하자!");
	}
	
	public void night() {
		
		if(num == 0) {
			System.out.println("night");
			num++;
		}else {
			System.out.println("오후도 낮과 마찬가지로 일해야 합니다.");
		}
	}
	
	
	
	
	
	
}