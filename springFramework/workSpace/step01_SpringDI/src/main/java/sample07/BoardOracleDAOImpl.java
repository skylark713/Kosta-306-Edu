package sample07;

import org.springframework.stereotype.Repository;

@Repository //생성 <bean class="BoardOracleDAOImpl" id="boardOracleDAOImple"/>
public class BoardOracleDAOImpl implements BoardDAO {

	public BoardOracleDAOImpl() {
		System.out.println("BoardOracleDAOImpl 생성자 호출됨");
	}
	
	@Override
	public void select() {
		System.out.println("BoardOracleDAOImpl select 메소드 호출");

	}

}
