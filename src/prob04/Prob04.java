package prob04;

public class Prob04 {

	public static void main(String[] args) {
		//Employee 객체를 상속 받은 Depart
		Employee pt = new Depart( "홍길동", 3000, "개발부" );
		pt.getInformation();
	}
}