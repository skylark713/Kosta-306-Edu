package sample07;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service //<bean class="BoardServiceImpl" id="boardServiceImpl"/>
public class BoardServiceImpl implements BoardService {
	
	@Autowired //byType --> byName 기준
	@Qualifier("boardMyBatisDAOImpl")
	private BoardDAO boardMyBatisDAOImpl;
	
	@Autowired 
	@Qualifier("boardOracleDAOImpl")
	private BoardDAO boardOracleDao;

	public BoardServiceImpl() {
		System.out.println("BoardServiceImpl 생성자..");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("boardMyBatisDAOImple = " + boardMyBatisDAOImpl);
		System.out.println("boardOracleDAO =" + boardOracleDao);
	}
	
	@Override
	public void select() {
		System.out.println("BoardServiceImpl select call");
		
		boardMyBatisDAOImpl.select();

		boardOracleDao.select();

	}

}
