package sample03;

public class BookDAOImpl implements BookDAO {
	
	BookDAOImpl(){
		
	}

	@Override
	public void insert(BookVo bookVo) {
		System.out.println("BookDAOImpl의 INSERT 호출됨!");
		System.out.println(bookVo);
	}

}
