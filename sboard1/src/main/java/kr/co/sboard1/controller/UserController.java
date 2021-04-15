package kr.co.sboard1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.sboard1.service.UserService;
import kr.co.sboard1.vo.TermsVo;

@Controller
public class UserController {
	
	@Autowired
	private UserService service;

	@GetMapping("/user/login")
	public String login() {
		return "/user/login";
	}
	
	@GetMapping("/user/terms")
	public String terms(Model model) {
		
		TermsVo vo = service.selectTerms();
		
		model.addAttribute(vo);
		
		return "/user/terms";
	}
	
	
}
