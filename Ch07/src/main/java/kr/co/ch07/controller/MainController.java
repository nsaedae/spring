package kr.co.ch07.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.ch07.vo.UserVo;

@Controller
public class MainController {
	
	@GetMapping(value = {"/", "/index"})
	public String index(Model model) {
		
		String title = "SpringBoot Thymeleaf Practice";
		String hello = "Hello Thymeleaf";
		
		UserVo user = new UserVo();
		user.setUid("a101");
		user.setName("홍길동");
		user.setHp("010-1234-1234");
		user.setAge(25);
		
		List<UserVo> users = new ArrayList<>();
		users.add(new UserVo("a101", "김유신", "010-1234-1111", 21));
		users.add(new UserVo("a102", "김춘추", "010-1234-2222", 22));
		users.add(new UserVo("a103", "장보고", "010-1234-3333", 23));
		users.add(new UserVo("a104", "강감찬", "010-1234-4444", 24));
		users.add(new UserVo("a105", "이순신", "010-1234-5555", 25));
		
		model.addAttribute("title", title);
		model.addAttribute("hello", hello);
		model.addAttribute(user);
		model.addAttribute("users", users);
		
		return "/index";
	}
	
	@GetMapping("/include")
	public String include() {
		return "/include";
	}
	
	
	
}
