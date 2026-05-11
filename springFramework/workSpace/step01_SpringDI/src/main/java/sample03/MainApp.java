package sample03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sample02.MemberService;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext application =
				new ClassPathXmlApplicationContext("sample03/springDI_Constructor.xml");
		
		BookController controller = application.getBean("controller", BookController.class);
		controller.bookInsert();
	}

}
