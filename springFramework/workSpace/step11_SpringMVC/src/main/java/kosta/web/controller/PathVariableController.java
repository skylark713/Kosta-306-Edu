package kosta.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class PathVariableController {

	@RequestMapping("/{type}/{id}.do")
	public void aa(@PathVariable String type, 
					@PathVariable String id) {
		log.info("aa 메소드 호출됨...");
		log.info("type : {} ,  id : {}", type, id);
	}

	@RequestMapping("/{id}")
	public void bb(@PathVariable String id) {
		log.info("bb method call id:{}", id);
	}

	@RequestMapping("/{type}/{kind}/{no}")
	public String cc(@PathVariable String type, 
					@PathVariable String kind, 
					@PathVariable String no) {
		log.info("type : {}", type);
		log.info("kind : {}", kind);
		log.info("no: {}", no);
		
		//기능을 완료한 후에 다른 Controller를 실행하고 싶다.
		/**
		 * viewName에 
		 * 1) redirect:url주소
		 * 2) forward:url주소
		 */
		
		//return "/rem/a.do"; //WEB_INF/view/rem/a.do.jsp 이동
		//return "redirect:/rem/a.do";
		return "forward:/rem/a.do";
		
	}

}
