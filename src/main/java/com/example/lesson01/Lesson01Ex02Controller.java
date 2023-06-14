package com.example.lesson01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// JSP 화면 뿌리기
@Controller // @RestController 절대 사용 금지!!, ResponseBody 사용x
public class Lesson01Ex02Controller {
	
	//http://localhost/lesson01/ex02
	@RequestMapping("/lesson01/ex02")
	public String ex02() {
		// jsp의 경로를 리턴한다.
		// "/WEB-INF/jsp/"
//		return "/WEB-INF/jsp/lesson01/ex02.jsp";
		return "lesson01/ex02"; // jsp 경로
		
	}
}
