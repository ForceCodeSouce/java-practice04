package prob02;

public class Book {
	private int bookNo;
	private String title;
	private String author;
	private int stateCode;

	// 생성자
	// stateCode 초기값 1 설정

	// 생성자
	public Book(int bookNo, String title, String author) {
		super();
		this.stateCode = 1;
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
	}

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getStateCode() {
		return stateCode;
	}

	public void setStateCode(int stateCode) {
		this.stateCode = stateCode ;
	}

	public void print() {
		System.out.println("책 제목:" + title + ", 작가:" + author + ", 대여 유무:" + (stateCode == 1 ? "재고있음" : "대여중"));
		//System.out.println("stateCode :" + stateCode);
	}

	public void rent() {
		// TODO Auto-generated method stub
		stateCode = 0;
	}
}