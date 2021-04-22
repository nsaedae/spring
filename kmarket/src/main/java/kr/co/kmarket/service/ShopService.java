package kr.co.kmarket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.kmarket.dao.ShopDao;
import kr.co.kmarket.vo.ProductVo;

@Service
public class ShopService {

	@Autowired
	private ShopDao dao;
	
	public List<ProductVo> selectProducts(int cate1, int cate2){
		return dao.selectProducts(cate1, cate2);
	}
	
}















