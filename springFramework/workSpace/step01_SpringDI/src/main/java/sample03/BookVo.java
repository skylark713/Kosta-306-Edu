package sample03;

public class BookVo {
	private String subject;
	private String writer;
	private int price;
	private String date;
	
	public BookVo() {
		
	}
	
	public BookVo(String subject, String writer, int price, String date) {
		this.subject = subject;
		this.writer = writer;
		this.price = price;
		this.date = date;
	}

	public String getSubject() {
		return subject;
	}

	public String getWriter() {
		return writer;
	}

	public int getPrice() {
		return price;
	}

	public String getDate() {
		return date;
	}

	@Override
	public String toString() {
		return "책제목 : " + subject + "\n작성자 : " + writer + "\n가격 : " + price + "\n날짜 : " + date;
	}

}
