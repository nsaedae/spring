package kr.co.kmarket.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.kmarket.service.admin.AdminProductService;
import kr.co.kmarket.vo.Cate1Vo;
import kr.co.kmarket.vo.Cate2Vo;

@Controller
public class AdminProductController {
	
	@Autowired
	private AdminProductService service;
	
	@ResponseBody
	@GetMapping("/admin/product/cate1")
	public List<Cate1Vo> cate1() {
		List<Cate1Vo> cate1List = service.selectCate1();
		return cate1List;
	}
	
	@ResponseBody
	@GetMapping("/admin/product/cate2")
	public List<Cate2Vo> cate2(int code1) {
		List<Cate2Vo> cate2List = service.selectCate2(code1);
		return cate2List;
	}
	
	
	
	@GetMapping("/admin/product/list")
	public String list() {
		return "/admin/product/list";
	}
	
	@GetMapping("/admin/product/register")
	public String register() {
		return "/admin/product/register";
	}
	
}
