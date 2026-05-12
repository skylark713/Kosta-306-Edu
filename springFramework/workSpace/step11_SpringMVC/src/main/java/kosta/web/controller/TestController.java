package kosta.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller // 생성
public class TestController {

	@RequestMapping("/test.do")
	public ModelAndView aa() {
		System.out.println("TestController의 test.do 요청됨...");

		// 뷰쪽으로 전달할 데이터가 있다.

		// return new ModelAndView("result"); //뷰이름의 결과 prefix + 뷰이름 + suffix
		return new ModelAndView("result", "message", "Spring재미있다!"); // (String viewName, String modelName, Object modelObject)
	}

	@RequestMapping("/test2.do")
	public ModelAndView aa(String no) {
		System.out.println("TestController의 test2.do 요청됨...");

		int convert = Integer.parseInt(no);
		
		// 뷰쪽으로 전달할 데이터가 있다.

		return new ModelAndView("result", "message", "Spring재미있다!");
	}
}
