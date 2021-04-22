package kr.co.kmarket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.kmarket.service.ShopService;
import kr.co.kmarket.vo.Cate1Vo;
import kr.co.kmarket.vo.ProductVo;


@Controller
public class ShopController {
	
	@Autowired
	private ShopService service;

	@GetMapping("/shop/search")
	public String search() {
		return "/shop/search";
	}
	
	@GetMapping("/shop/list")
	public String list(Model model, int cate1, int cate2, String sort) {
		
		ProductVo titles = service.selectTitles(cate1, cate2);
		List<ProductVo> products = service.selectProducts(cate1, cate2, sort);
		
		model.addAttribute("cate1", cate1);
		model.addAttribute("cate2", cate2);
		model.addAttribute("titles", titles);
		model.addAttribute("products", products);
		
		return "/shop/list";
	}
	
	@GetMapping("/shop/view")
	public String view(int code, Model model) {
		
		ProductVo product = service.selectProduct(code);
		model.addAttribute(product);
		
		return "/shop/view";
	}
	
	@GetMapping("/shop/cart")
	public String cart() {
		return "/shop/cart";
	}
	
	@GetMapping("/shop/order")
	public String order() {
		return "/shop/order";
	}
	
	@GetMapping("/shop/order-complete")
	public String orderComplete() {
		return "/shop/order-complete";
	}
	
	
	
}
