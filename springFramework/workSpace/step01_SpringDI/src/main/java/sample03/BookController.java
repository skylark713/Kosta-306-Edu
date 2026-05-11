package sample03;

public class BookController {
	private BookDAO bookDao;//null
	private BookVo bookVo;//null

	BookController(){
		System.out.println("BookController 기본생성자 호출됨...");
	}
	
	BookController(BookDAO bookDao, BookVo bookVo){
		this.bookDao = bookDao;
		this.bookVo = bookVo;
	}
	
	public void bookInsert() {
		bookDao.insert(bookVo);
	}
	
	
}
