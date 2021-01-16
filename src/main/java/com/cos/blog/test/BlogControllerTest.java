package com.cos.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//스프링이 coms.cos.blog패키지 이하를 스캔해소 모든 메모리에 new하는것은 아니고 특정 어노테이션이 붙어있는 클래스 파일들을 new(ioc) 해서 스프링 컨테이너에서 관리해줌
@RestController
public class BlogControllerTest {

	@GetMapping("/test/hello")
	public String hello() {
		return "<h1>hello spring boot</h1>";
	}
}
   