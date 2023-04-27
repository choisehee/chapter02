package com.himedia;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController //@Controller대신에 스프링 4부터 지원하는 @RestController를 사용한다,
//REST
public class BoardController {
	
	public BoardController() {
		System.out.println("===> BoardController 생성");
	}
	
	@GetMapping("/hello")
	String hello(String name) {
		return "Hello : "+name;
	}

}
