package sample07;

import org.springframework.stereotype.Repository;

@Repository //<bean class="BoardMyBatisDAOImpl" id="boardMyBatisDDAOImpl"/>
public class BoardMyBatisDAOImpl implements BoardDAO {
	
	public BoardMyBatisDAOImpl() {
		System.out.println("BoardMyBatisDAOImpl 생성자 호출됨");
	}

	@Override
	public void select() {
		System.out.println("BoardMyBatisDAOImpl select 메소드 호출");

	}

}
